package com.gevernova.workshop.two.movietheatre;

    public class Tickets extends Movie{
        public static void main(String[] args) {
            Theatre.showTheatre();

//            to add movie names to theatre
            Theatre.addMovies("John Wick");
            Theatre.addMovies("KGF");
            Theatre.addMovies("Coolie");
            Theatre.addMovies("RRR");

//            method to show available movies
            Theatre.showMovies();

//            to add movie objects
            Tickets johnWick = new Tickets();
            johnWick.addMovie("John Wick");
            Tickets kgf = new Tickets();
            kgf.addMovie("KGF");
            Tickets coolie = new Tickets();
            coolie.addMovie("Coolie");
            Tickets rrr = new Tickets();
            rrr.addMovie("RRR");

//            booking movie tickets :
            rrr.getTickets(28 , "VIP");
            rrr.getTickets(18, "VIP");
            rrr.getTickets(35, "Normal");



        }

    }
