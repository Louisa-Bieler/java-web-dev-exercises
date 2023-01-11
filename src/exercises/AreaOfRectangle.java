package exercises;
import java.text.DecimalFormat;
import java.time.format.DecimalStyle;
import java.util.Scanner;
import java.util.Locale;
public class AreaOfRectangle {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        double length;
        double width;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the length in centimeters: ");
        length = input.nextDouble();
        System.out.println("Please enter the width in centimeters:");
        width = input.nextDouble();
        input.close();

        double result = length * width;
        System.out.println("The area of this rectangle is " + result + " square centimeters." );



    }
}
