import java.util.Scanner;

class Movie{
    private String movieName;
    private String movieCategory;
    private int ticketCost;
    Movie(String movieName, String movieCategory){
        this.movieName=movieName;
        this.movieCategory=movieCategory;
    }
    public int calculateTicketCost(String circle){
        if(movieCategory.compareTo("2D")==0 || movieCategory.compareTo("3D")==0 || circle.compareTo("Gold")==0 || circle.compareTo("Silver")==0){
            if(movieCategory.compareTo("2D")==0 || movieCategory.compareTo("3D")==0){
                if(movieCategory.compareTo("2D")==0){
                    if(circle.compareTo("Gold")==0){
                        ticketCost=300;
                        return 0;
                    }
                    else if(circle.compareTo("Silver")==0){
                        ticketCost=250;
                        return 0;
                    }
                    else{
                        return -2;
                    }
                }
                else if(movieCategory.compareTo("3D")==0){
                    if(circle.compareTo("Gold")==0){
                        ticketCost=500;
                        return 0;
                    }
                    else if(circle.compareTo("Silver")==0){
                        ticketCost=450;
                        return 0;
                    }
                    else{
                        return -2;
                    }
                }
                else{
                    return -1;
                }
            }
            else{
                return -1;
            }
        }
        else{
            return -3;
        }
    }
    void show(int x){
        System.out.println("Movie name = "+movieName);
        System.out.println("Movie category = "+movieCategory);
        if(x==0){
            System.out.println("The ticket cost is = "+ticketCost);
        }
        else if(x==-1){
            System.out.println("Sorry there is no "+movieCategory+" type of category in theater.");
        }
        else if(x==-2){
            System.out.println("Sorry!!! Circle is Invalid.");
        }
        else if(x==-3){
            System.out.println("Sorry!!! Both circle and category are Invalid.");
        }
    }
}

public class MovieTicket {
    public static void main(String args[]){
        Movie m1 = getMovieDetails();
        
        m1.show(m1.calculateTicketCost(getCircle()));
    }
    public static Movie getMovieDetails(){
        Scanner sc = new Scanner(System.in);
        String movieName;
        String movieCategory;
        System.out.println("Enter the movie name : ");
        movieName=sc.next();
        System.out.println("Enter the movie category : ");
        movieCategory=sc.next();
        Movie m1=new Movie(movieName,movieCategory);
        return m1;
    }
    public static String getCircle(){
        Scanner sc = new Scanner(System.in);
        String circle;
        System.out.println("Enter the circle : ");
        circle=sc.next();
        return circle;
    }
}
