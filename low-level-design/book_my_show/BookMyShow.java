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
  
class Movie { 
  
    int movieId; 
    int theaterId; 
    MovieType movieType; 
    MovieStatus movieStatus; 
} 
  
class Theater { 
  
    int theaterId; 
    String theaterName; 
    Adress adress; 
  
    List<Movie> movies; 
    float rating; 
} 
  
class Booking { 
    int bookingId; 
    int userId; 
    int movieId; 
    List<Movie> bookedSeats; 
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