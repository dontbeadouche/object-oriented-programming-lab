import java.util.*;
import java.io.*;

abstract class Seat
{
    private int col;
    private char row;
    private boolean occupied;

    public abstract double getPrice();          //For Polymorphism

    public Seat(char row, int col)
    {
        this.row = row;
        this.col = col;
        this.occupied = false;
    }

    public int getCol()
    {
        return col;
    }

    public char getRow()
    {
        return row;
    }
}

class StandardSeat extends Seat
{
    private static double price = 30;

    public StandardSeat(char row, int col)
    {
        super(row,col);
    }

    public double getPrice()
    {
        return price;
    }
}

class VIPSeat extends Seat
{
    private static double price = 50;

    public VIPSeat(char row, int col)
    {
        super(row,col);
    }

    public double getPrice()
    {
        return price;
    }
}

class Show
{
    private ArrayList<Seat> seats;
    private String timing;
    private int numberOfOccupiedSeats;

    public Show(String timing)
    {
        seats = new ArrayList<Seat>();
        for(char rowIndex = 'A'; rowIndex <= 'D'; rowIndex++)
            for(int colIndex = 0; colIndex < 10; colIndex++)
                seats.add(new StandardSeat(rowIndex,colIndex));

        for(int colIndex = 0; colIndex < 10; colIndex++)
            seats.add(new VIPSeat('V',colIndex));

        this.timing = timing;
        numberOfOccupiedSeats = 0;
    }

    public int getSeatIndex(String address)
    {
        char row = address.charAt(0);
        int col = Character.getNumericValue(address.charAt(1));

        for(int i = 0; i < seats.size(); i++)
            if(row == seats.get(i).getRow() && col == seats.get(i).getCol())
                return i;
        return -1;
    }

    public Seat getSeat(int index)
    {
        return seats.get(index);
    }

    public boolean isHouseful()
    {
        return numberOfOccupiedSeats == seats.size();
    }

    public void showDetails()
    {
        System.out.println("Time : " + timing);
        System.out.println("Occupancy : " + numberOfOccupiedSeats + " / " + seats.size());
    }

    public void view(Scanner input)
    {

    }
}

class Movie
{
    private int duration;
	private String title;
	private String description;
	private int language;
	private int rating;
	private ArrayList<Integer> movieGenres;

    private static ArrayList<String> LANGS = new ArrayList<String>(Arrays.asList("English","Hindi","Arabic","German","French","Spanish","Mandarin"));
	private static ArrayList<String> GENRES=  new ArrayList<String>(Arrays.asList("Adventure","Action","Comedy","Crime","Drama","Fantasy","Historical","Documentary","Horror","Psychological","Romance","Sci-Fi","Animation"));
	private static ArrayList<String> SAFETY_RATINGS = new ArrayList<String>(Arrays.asList("G","PG","PG-13","PG-15","R","NC-17"));

    public Movie(String title, String description, int language, int rating, ArrayList<Integer> movieGenres, int duration)
	{
		this.title = title;
		this.description = description;
		this.language = language;
		this.rating = rating;
		this.movieGenres = new ArrayList<Integer> (movieGenres);
		this.duration = duration;
	}

    public String toString()
    {
        return title;
    }

    public Movie(Movie other)
    {
        this.title = other.title;
        this.description = other.description;
        this.language = other.language;
        this.rating = other.rating;
        this.movieGenres = new ArrayList<Integer> (other.movieGenres);
        this.duration = other.duration;
    }

    public static Movie createNewMovie(Scanner input)
	{

		System.out.println("Movie Details : ");

        System.out.print("Title           : ");
		String title = input.nextLine();

		System.out.print("Description     : ");
		String description = input.nextLine();

		System.out.print("Duration (mins) : ");
		int duration = input.nextInt();
        input.nextLine();

        System.out.println("Languages       : ");
		for (int i = 0;i < LANGS.size(); i++)
		{
			System.out.println("[" + i + "]" + LANGS.get(i));
		}
        System.out.print("Movie Language  : ");
		int language = input.nextInt();
        input.nextLine();

        System.out.println("Genres : ");
		for (int i = 0; i < GENRES.size(); i++)
		{
			System.out.println("[" + i + "]" + GENRES.get(i));
		}
        System.out.print("Movie Genres    : ");
        ArrayList<Integer> movieGenres = new ArrayList<Integer>();
        String[] genreInput = input.nextLine().split("\\s+");
        for(String s : genreInput)
        {
            int genre = Integer.parseInt(s);
            if(genre >= 0 && genre < GENRES.size())
                movieGenres.add(genre);
        }

        System.out.println("Safety Ratings  : ");
		for (int i = 0; i < SAFETY_RATINGS.size(); i++)
		{
			System.out.println("[" + i + "]"+ SAFETY_RATINGS.get(i));
		}
        System.out.print("Movie Rating    : ");
		int rating = input.nextInt();
        input.nextLine();;

        return new Movie(title, description, language, rating, movieGenres, duration);
    }

    public void showDetails()
    {
        System.out.println("Title         : " + this.title);
        System.out.println("Description   : " + this.description);
        System.out.println("Duration      : " + this.duration + " minutes");
        System.out.println("Language      : " + LANGS.get(this.language));
        System.out.println("Safety Rating : " + SAFETY_RATINGS.get(this.rating));
        System.out.print("Genres        : ");
        for(int genre : movieGenres)
        {
            System.out.print(GENRES.get(genre) + ". ");
        }
        System.out.println("\n");
    }
}

class Theatre
{
    private Movie movie;
    private ArrayList<Show> shows;

    public Theatre(Movie movie, ArrayList<Show> shows)
    {
        this.movie = new Movie(movie);
        this.shows = new ArrayList<Show>(shows);
    }

    public Theatre(Theatre other)
    {
        this.movie = new Movie(other.movie);
        this.shows = new ArrayList<Show>(other.shows);
    }

    public String toString()
    {
        return movie.toString();
    }

    public static Theatre createNewTheatre(Scanner input)
    {
        System.out.println("Theatre Details :");
        Movie movie = new Movie(Movie.createNewMovie(input));

        System.out.println("Show Timings : ");
        ArrayList<Show> shows = new ArrayList<Show>();
        String[] timings = input.nextLine().split("\\s+");
        for(String t : timings)
        {
            shows.add(new Show(t));
        }

        return new Theatre(movie, shows);
    }

    public void view(Scanner input)
    {
        Program.refreshScreen();
        movie.showDetails();
        for(int index = 0 ; index < shows.size(); index++)
        {
            System.out.println("[" + (index+1) + "] Show #" + (index+1) +" : ");
            shows.get(index).showDetails();
        }
        System.out.println("[0]: Return to Movie Showreel!\n");
        System.out.print("Option : ");

        try
        {
            int option = input.nextInt();
            input.nextLine();

            int index = option - 1;
            if(option == 0)
            {
                Program.transitionBuffer();
                Program.bookPortal();
            }
            else if(index >=0 && index < shows.size())
            {
                if(shows.get(index).isHouseful())
                {
                    System.out.println("Sorry ,this show is completely booked!");
                    Program.transitionBuffer();
                    this.view(input);
                }
                else
                {
                    shows.get(index).view(input);
                }
            }
        }
        catch(InputMismatchException E)
        {
            System.out.println("Please enter a valid option!");
            Program.transitionBuffer();
            this.view(input);
        }
    }
}

class Program
{
    private static ArrayList<Theatre> theatres;
    private static String USERNAME = "Admin";
	private static String PASSWORD = "1234pass4321";
    private static Scanner input;

    public static void main(String args[])
    {
        /*Theatre.setupTheatre();
        Show show = new Show("1 o'clock");
        Seat s = show.getSeat(show.getSeatIndex("V5"));
        System.out.println("Price : " + s.getPrice());*/
        input = new Scanner(System.in);
        Theatre theatre = new Theatre(Theatre.createNewTheatre(input));
        theatres = new ArrayList<Theatre>();
        theatres.add(theatre);
        login();
    }

    public static void clearScreen()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void refreshScreen()
    {
        clearScreen();
        System.out.println("XXX Cinema Portal\n");
    }

    public static void transitionBuffer()
    {
        System.out.println("Press any key to continue!");
        input.nextLine();
    }

    public static void login()
    {
        refreshScreen();
		System.out.println("[1]: Book Movie Tickets\n[2]: Manage Theatres (Admin Only!)\n[3]: Exit\n");
		System.out.print("Option : ");

        try
        {
            int option = input.nextInt();
            input.nextLine();

            switch(option)
            {
                case 1: bookPortal(); break;
                case 2: managePortal(); break;
                case 3: logout(); break;
                default : login();
            }
        }
        catch(InputMismatchException E)
        {
            System.out.println("Please enter a valid option!");
            transitionBuffer();
            login();
        }
    }

    public static void bookPortal()
    {
        refreshScreen();
        displayTheatres();

        System.out.println("[0]: Exit Portal!\n");
        System.out.print("Option : ");

        try
        {
            int option = input.nextInt();
            input.nextLine();

            int index = option -1;
            if(index < theatres.size() && index >= 0)
            {
                transitionBuffer();
                theatres.get(index).view(input);

            }
            else if(option == 0)
            {
                transitionBuffer();
                logout();
            }
            else
            {
                System.out.println("Please enter a valid option!");
                transitionBuffer();
                bookPortal();
            }
        }
        catch(InputMismatchException E)
        {
            System.out.println("Please enter a valid option!");
            transitionBuffer();
            bookPortal();
        }

    }

    public static void setupTheatres()
    {
        theatres = new ArrayList<Theatre>();

    }

    public static void displayTheatres()
    {
        for(int i =0 ; i < theatres.size(); i++)
            System.out.println("[" + (i+1) + "] : " + theatres.get(i).toString());
    }

    public static void managePortal()
    {
        refreshScreen();
        System.out.print("Username : ");
        String username = input.nextLine();

        System.out.print("PASSWORD : ");
        String password = input.nextLine();

        if (username.equals(USERNAME) && password.equals(PASSWORD))
        {
            System.out.println("Logged in succesfully!");
            transitionBuffer();
            manageMenu();
        }
        else
        {
            System.out.println("Username or Password is incorrect!");
            transitionBuffer();
            login();
        }

    }

    public static void manageMenu()
    {
        refreshScreen();
        System.out.println("[1]: Add Theatre\n[2]: Edit Theatre\n[3]: Remove Theatre\n[0]: Exit Portal\n");
        System.out.print("Option : ");

        try
        {
            int option = input.nextInt();
            input.nextLine();

            switch(option)
            {
                case 1: addTheatre(); break;
                case 2: break;
                case 3: break;
                case 0: logout(); break;
                default: manageMenu();
            }
        }
        catch(InputMismatchException E)
        {
            System.out.println("Please enter a valid option!");
            transitionBuffer();
            manageMenu();
        }
    }

    public static void addTheatre()
    {/*
        File theatreDatabase = new File("theatreDatabase.ser");
        if(theatreDatabase.exists())
        {
            System.out.println("Using existing file...");
        }
        else
        {
            theatreDatabase.createNewFile();
            System.out.println("New file created!");
        }
        ObjectOutputStream moviefile = new ObjectOutputStream(new FileOutputStream(theatreDatabase));
        try
        {
            Movie m1 = new Movie();
            theatreDatabase.writeObject(m1);
            theatreDatabase.close();

        }catch(Exception ex){
            theatreDatabase.close();
            ex.printStackTrace();
        }*/
        System.out.println("Theatre was added into file");
        transitionBuffer();
        manageMenu();
    }

    public static void updateTheatres()
    {
        System.out.println("Theatres were written and reread!");
    }

    public static void logout()
    {
        refreshScreen();
        System.out.println("Thank you for using our portal!\nWe hope to see you again!\n");
        transitionBuffer();
        System.exit(0);
    }


}