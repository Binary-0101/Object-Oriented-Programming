package Encapsulation;
class Movie{
    private String movie_Name;
    private String director_Name;
    private String actor_Name;
    private String budget;
    private int ticket_Price;

    Movie(String movie_Name,String director_Name,String actor_Name,String budget,int ticket_Price){
        this.movie_Name = movie_Name;
        this.director_Name = director_Name;
        this.actor_Name = actor_Name;
        this.budget = budget;
        this.ticket_Price = ticket_Price;
    }
    void setterMethod(String movie_Name,String director_Name,String actor_Name,String budget,int ticket_Price){
        this.actor_Name = actor_Name;
        this.movie_Name = movie_Name;
        this.director_Name = director_Name;
        this.budget = budget;

        if(ticket_Price > 500){
            this.ticket_Price = ticket_Price;
        }
        else{
            System.out.println("Invalid ticket price");
        }
    }
    String get_MovieName(){
        return movie_Name;
    }
    String get_directorName(){
        return director_Name;
    }
    String get_Budget(){
        return budget;
    }
    String get_ActorName(){
        return actor_Name;
    }
    int get_ticketPrice(){
        return ticket_Price;
    }
    void display(){
        System.out.println(movie_Name+" "+director_Name+" "+actor_Name+" "+budget);
    }
}

public class Example {
    public static void main(String[] args) {
        Movie movie = new Movie("MS Dhoni", "Prashanth", "Shushanth", "10CR",0);
        movie.display();

        // movie.movie_Name = "Virat";     // movie_Name cannot be accessed from this class bcoz its declared as private
        // movie.actor_Name = "Ranveer";
        // movie.budget = "30000Cr";

        movie.setterMethod("Sachin","Nishhanth","Amir","20CR",600);
        System.out.println(movie.get_MovieName());
        System.out.println(movie.get_ActorName());
        System.out.println(movie.get_directorName());
        System.out.println(movie.get_Budget());
        System.out.println(movie.get_ticketPrice());

        movie.display();
    }
}
