/**
 * Name: Savitha Maiya Keshava
 * Student Number: A00241065
 * Description: This program provides various unit conversions
 */

import java.util.*;
import java.text.DecimalFormat;

public class Convert {
    private static final DecimalFormat df = new DecimalFormat("0.00"); // This is used for rounding off
    //Constants for identifying unit of measurement 
    private static final String KILOMETER = "km";
    private static final String MILE = "mi";
    private static final String CENTIMETER = "cm";
    private static final String INCH = "in";
    private static final String KILOGRAM = "kg";
    private static final String POUND = "lb";
    private static final String GRAM = "g";
    private static final String OUNCE = "oz";
    private static final String CUPS = "cups";
    private static final String LITRE = "l";
    private static final String CENTIGRADE = "c";
    private static final String FAHRENHEIT = "f";
    private static final String KELVIN = "k";

    public static void main(String args[]) {
        Double valueToConvert = 0.0;
        String currentUnitOfMeasure = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value to convert: ");
        String[] userInput = sc.nextLine().split(" "); //Takes the user input separated by single space. Example "10 kg"
        try {
            if(userInput.length > 0) {
                valueToConvert = Double.parseDouble(userInput[0]);
                currentUnitOfMeasure = userInput[1];
                //Conversion logic begins
                switch (currentUnitOfMeasure.toLowerCase()) {
                    case KILOMETER:
                        System.out.println(valueToConvert + " " + currentUnitOfMeasure + " is equal to " + df.format(valueToConvert * 0.62) + MILE);
                        break;
                    case MILE:
                        System.out.println(valueToConvert + " " + currentUnitOfMeasure + " is equal to " + df.format(valueToConvert * 1.61) + KILOMETER);
                        break;
                    case CENTIMETER:
                        System.out.println(valueToConvert + " " + currentUnitOfMeasure + " is equal to " + df.format(valueToConvert * 0.39) + INCH);
                        break;
                    case INCH:
                        System.out.println(valueToConvert + " " + currentUnitOfMeasure + " is equal to " + df.format(valueToConvert * 2.54) + CENTIMETER);
                        break;
                    case KILOGRAM:
                        System.out.println(valueToConvert + " " + currentUnitOfMeasure + " is equal to " + df.format(valueToConvert * 2.2) + POUND);
                        break;
                    case POUND:
                        System.out.println(valueToConvert + " " + currentUnitOfMeasure + " is equal to " + df.format(valueToConvert * 0.45) + KILOGRAM);
                        break;
                    case GRAM:
                        System.out.println(valueToConvert + " " + currentUnitOfMeasure + " is equal to " + df.format(valueToConvert * 0.04) + OUNCE);
                        break;
                    case OUNCE:
                        System.out.println(valueToConvert + " " + currentUnitOfMeasure + " is equal to " + df.format(valueToConvert * 28.35) + GRAM);
                        break;
                    case CUPS:
                        System.out.println(valueToConvert + " " + currentUnitOfMeasure + " is equal to " + df.format(valueToConvert * 0.04) + LITRE);
                        break;
                    case LITRE:
                        System.out.println(valueToConvert + " " + currentUnitOfMeasure + " is equal to " + df.format(valueToConvert * 28.35) + CUPS);
                        break;
                    case CENTIGRADE:
                        System.out.println(valueToConvert + " " + currentUnitOfMeasure.toUpperCase() + " is equal to " + df.format((valueToConvert * 9 / 5) + 32) + FAHRENHEIT.toUpperCase());
                        System.out.println(valueToConvert + " " + currentUnitOfMeasure.toUpperCase() + " is equal to " + df.format(valueToConvert * 273.15) + KELVIN.toUpperCase());
                        break;
                    case FAHRENHEIT:
                        System.out.println(valueToConvert + " " + currentUnitOfMeasure.toUpperCase() + " is equal to " + df.format((valueToConvert - 32) * 5 / 9) + CENTIGRADE.toUpperCase());
                        System.out.println(valueToConvert + " " + currentUnitOfMeasure.toUpperCase() + " is equal to " + df.format((valueToConvert - 32) * 5 / 9 + 273.15) + KELVIN.toUpperCase());
                        break;
                    default:
                        System.out.println("No match");
                        break;   
                }
                // End of conversion logic
            } else{
                System.out.println("Invalid input");
            }
        }catch (Exception e){
            System.out.println("Please enter the value to convert in this format : 4 kg");
        }
    }
}
