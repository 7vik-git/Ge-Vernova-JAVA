package com.gevernova.workshop.two.movietheatre;

public abstract class Theatre {
    final static String theatreName = "PVR Cinemas";
    private static String[] movieName = new String[4];
    private static int index = 0;

    public static void showTheatre(){
        System.out.println("******** " + theatreName + " ********" );
    }

    public static void addMovies(String movie) {
        movieName[index] = movie;
        index++;
    }

    public static void showMovies() {
        System.out.println("Now Running : ");
        for (int i = 0; i < 4; i++) {
            System.out.println(movieName[i]);
        }
        System.out.println();
        System.out.println("Book your tickets now : ");
    }
    public abstract void addMovie(String name);
    public double calculate(double a, double b){
        return  a+b;
    }
}
