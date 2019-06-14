public enum SeatStatus { 
    SEAT_BOOKED, 
    SEAT_NOT_BOOKED; 
} 
  
public enum MovieStatus { 
    Movie_Available, 
    Movie_NotAvailable; 
} 
  
public enum MovieType { 
    ENGLISH, 
    HINDI; 
} 
  
public enum SeatType { 
    NORMAL, 
    EXECUTIVE, 
    PREMIUM, 
    VIP; 
} 
  
public enum PaymentStatus { 
    PAID, 
    UNPAID; 
} 
  
class User { 
  
    int userId; 
    String name; 
    Date dateOfBirth; 
    String mobNo; 
    String emailId; 
    String sex; 
} 
  
// Movie instances will be shared across
class Movie { 
    int movieId; 
    MovieType movieType; 
    MovieStatus movieStatus; 
}

// Show instances are create on a movie in a theatre basis
class Show {
    int movieId;
    List<Time> showTimings;
}
  
class Theater { 
  
    int theaterId; 
    String theaterName; 
    Adress adress; 
  
    List<Movie> movies;
    List<Screen> screens;
    float rating; 
} 

// Screens are created uniquely to theatres
class Screen {
    String name;
    int screenId;

    List<Show> shows;
}
  
class Booking { 
    int bookingId; 
    int userId; 
    int movieId; 
    List<Integer> bookedSeats; 
    int amount; 
    PaymentStatus status_of_payment; 
    Date booked_date; 
    Time movie_timing; 
} 
  
class Address { 
    String city; 
    String pinCode; 
    String state; 
    String streetNo; 
    String landmark; 
}