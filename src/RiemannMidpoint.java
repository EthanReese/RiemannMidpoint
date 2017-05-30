
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

        double offset = (HBOUND - LBOUND)/(2*N);
        double increment = (HBOUND-LBOUND) / N;

        double totalIntegral = 0;
        for (int i = 0; i < N; i++) {
            totalIntegral += plugIn((LBOUND + offset) +(increment*i)) * increment;
        }
        System.out.println(totalIntegral);

    }

    public double plugIn(double xVal){


        //Change the equation here to meet needs
        return Math.sqrt(Math.sin(xVal)+Math.cos(xVal));
    }

    public static void main(String[] args){
        new RiemannMidpoint();
    }

}
