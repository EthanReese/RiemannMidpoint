
/**
 * Output the estimated integral of an expression, given an equation, bounds, and n, adapted for a specific problem
 * Created by Ethan Reese on 5/29/17.
 */
public class RiemannMidpoint {
    //Change the bounds and n here
    final int N = 27;
    final double LBOUND = 0;
    final double HBOUND = (3*Math.PI)/4;


    public RiemannMidpoint(){


        //Get the increment and offset
        double offset = (HBOUND - LBOUND)/(2*N);
        double increment = (HBOUND-LBOUND) / N;

        //Estimate the Arc Length (Part A)

        //Go through every value, plug it into the expression, and add the value at necessary points to the total integral
        double totalIntegral = 0;
        for (int i = 0; i < N; i++) {
            //To find the value to plug in, take the first value, which is the left bound + a small offset and add i * the increment the value increases by
            //Multiply the value by the delta x (the increment)
            totalIntegral += plugIn((LBOUND + offset) +(increment*i)) * increment;
        }
        System.out.println("The length of the segment is " + totalIntegral);

        //Then estimate the problem of rotation(Part B)

        //Go through and add the value at necesary points to the volume of rotation
        double totalVolumeOfRotation = 0;
        for (int i = 0; i < N; i++) {
            totalVolumeOfRotation += volumeOfRotationPlug((LBOUND+offset) + (increment*i)) * increment;
        }
        System.out.println("The volume of rotation is " + totalVolumeOfRotation);



        //Finally, Estimate the Surface Area of the expression

        double totalSurfaceArea = 0;
        for (int i = 0; i < N; i++) {
            totalSurfaceArea += surfaceAreaOfRevolutionPlug((LBOUND+offset)+(increment*i)) * increment;
        }
        System.out.println("The surface area of the shape is " + totalSurfaceArea);

    }

    //PlugIn for the arc length equation
    public double plugIn(double xVal){
        //Change the equation here to meet needs
        return Math.sqrt(1+Math.pow((Math.cos(xVal)-Math.sin(xVal))/(2*Math.sqrt(Math.sin(xVal)+Math.cos(xVal))),2));
    }

    //Plug in for equation to integrate to get volume of rotation
    public double volumeOfRotationPlug(double xVal){

        //Change the equation here to meet needs
        return 2*Math.PI*(xVal*Math.sqrt(Math.sin(xVal)+Math.cos(xVal)));
    }

    //Plug into the equation for surface area
    public double surfaceAreaOfRevolutionPlug(double xVal){

        //Change the equation here to meet needs
        return 2*Math.PI*xVal*Math.sqrt(1+Math.pow((Math.cos(xVal)-Math.sin(xVal))/(2*Math.sqrt(Math.sin(xVal)+Math.cos(xVal))),2));
    }

    public static void main(String[] args){
        new RiemannMidpoint();
    }

}
