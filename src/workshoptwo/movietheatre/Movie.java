package workshoptwo.movietheatre;

public class Movie extends Theatre{
    protected String movieName;
    protected int availableSeats = 150;
    protected int vipSeats = 25;

    public void addMovie(String addMOvie){
        this.movieName = addMOvie;
    }
    public void getTickets(int seats, String type){
        if(type.equals("VIP")){
            if(seats<=vipSeats){
                System.out.println(seats + " VIP Tickets Purchased Successfully for " + movieName);
            }else{
                System.out.println("Sorry " + seats + " VIP tickets are not available for " + movieName);
            }
        }else {
            if (availableSeats > seats) {
                System.out.println(seats + " Tickets Purchased Successfully for " + movieName);
                availableSeats -= seats;
            } else {
                System.out.println("Sorry" + seats + " tickets are not available for " + movieName);
            }
        }
    }
    public void showAvailableSeats(){
        System.out.println(availableSeats + " seats are available for " + movieName);
    }

    public int calculate(int a, int b){
        return  a+b;
    }
}
