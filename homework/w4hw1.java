package week4.homework;

import java.util.Scanner;

class MovieTicket {
    String movieName;
    String theatreName;
    int seatNumber;
    double price;

    MovieTicket() {
        this("Unknown", "N/A", 0, 0.0);
    }

    MovieTicket(String movieName) {
        this(movieName, "N/A", 0, 200.0);
    }

    MovieTicket(String movieName, int seatNumber) {
        this(movieName, "PVR", seatNumber, 200.0);
    }

    MovieTicket(String movieName, String theatreName, int seatNumber, double price) {
        this.movieName = movieName;
        this.theatreName = theatreName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    void printTicket() {
        System.out.println("Movie: " + movieName);
        System.out.println("Theatre: " + theatreName);
        System.out.println("Seat: " + seatNumber);
        System.out.println("Price: " + price);
        System.out.println("------------------");
    }
}

public class w4hw1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter movie name: ");
        String movie = sc.nextLine();

        System.out.print("Enter theatre name: ");
        String theatre = sc.nextLine();

        System.out.print("Enter seat number: ");
        int seat = sc.nextInt();

        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        MovieTicket t1 = new MovieTicket();
        MovieTicket t2 = new MovieTicket(movie);
        MovieTicket t3 = new MovieTicket(movie, seat);
        MovieTicket t4 = new MovieTicket(movie, theatre, seat, price);

        t1.printTicket();
        t2.printTicket();
        t3.printTicket();
        t4.printTicket();

        sc.close();
    }
}

