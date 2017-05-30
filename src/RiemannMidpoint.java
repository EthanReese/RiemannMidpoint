
/**
 * Output the estimated integral of an expression, given an equation, bounds, and n
 * Created by Ethan Reese on 5/29/17.
 */
public class RiemannMidpoint {
    //Change the bounds and n here
    final int N = 27;
    final double LBOUND = 0;
    final double HBOUND = (3*Math.PI)/4;


    public RiemannMidpoint(){

    }

    public double plugIn(int xVal){


        //Change the equation here to meet needs
        return Math.sqrt(Math.sin(xVal)+Math.cos(xVal));
    }

    public static void main(String[] args){
        new RiemannMidpoint();
    }

}
