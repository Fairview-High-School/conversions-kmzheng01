import java.util.Scanner;
/**
 * This application converts between various units of measurement.
 *
 * @author Kevin Zheng
 * @version 8/22/2025
 */
public class Conversions
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Feet to Meters");
            System.out.println("4. Meters to Feet");
            System.out.println("5. Ounces to Milliliters");
            System.out.println("6. Milliliters to Ounces");
            System.out.println("7. Pounds to Kilograms");
            System.out.println("8. Kilograms to Pounds ");
            System.out.println("9. Gallons to Liters");
            System.out.println("10. Liters to Gallons");
            System.out.println("11. Exit");
            //Add 2 more conversions, each both ways, to add choices 7, 8, 9, and 10.
            //You can add even more if you would like.

            int selection = keyboard.nextInt();
            keyboard.nextLine();  //go past the end-line and be ready for more input

            if (selection == 1)
            {
                System.out.print("Enter Celsius: ");
                double celsius = keyboard.nextDouble();
                keyboard.nextLine();
                double fahrenheit = celsius * (9.0 / 5.0) + 32;
                System.out.println(celsius + " degrees celsius is " + fahrenheit + " degrees fahrenheit");
            }
            else if (selection == 2)
            {
                System.out.print("Enter Fahrenheit: ");
                double fahrenheit = keyboard.nextDouble();
                double celsius = (fahrenheit - 32) * (5.0/9.0);
                System.out.println(fahrenheit + " degrees fahrenheit is " + celsius + " degrees celsius");
            }
            else if (selection == 3)
            {
                System.out.print("Enter Feet: ");
                double feet = keyboard.nextDouble();
                double meters = feet / 3.281;
                System.out.println(feet + " feet is " + meters + " meters");
            }
            else if (selection == 4)
            {
                System.out.print("Enter Meters: ");
                double meters = keyboard.nextDouble();
                double feet = meters * 3.281;
                System.out.println(meters + " meters is " + feet + " feet");
            }
            else if (selection == 5)
            {
                System.out.print("Enter Ounces: ");
                double ounces = keyboard.nextDouble();
                double milliliters = ounces * 29.574;
                System.out.println(ounces + " ounces is " + milliliters + " milliliters");
            }
            else if (selection == 6) {
                System.out.print("Enter Milliliters: ");
                double milliliters = keyboard.nextDouble();
                double ounces = milliliters / 29.574;
                System.out.println(milliliters + " milliliters is " + ounces + " ounces");
            }
            else if (selection == 7) {
                System.out.print("Enter Pounds: ");
                double pounds = keyboard.nextDouble();
                double kilograms = pounds / 2.205;
                System.out.println(pounds + " pounds is " + kilograms + " kilograms");
            }
            else if (selection == 8) {
                System.out.print("Enter Kilograms: ");
                double kilograms = keyboard.nextDouble();
                double pounds = kilograms * 2.205;
                System.out.println(kilograms + " kilograms is " + pounds + " pounds");
            }
            else if (selection == 9) {
                System.out.print("Enter Gallons: ");
                double gallons = keyboard.nextDouble();
                double liters = gallons * 3.785;
                System.out.println(gallons + " gallons is " + liters + " liters");
            }
            else if (selection == 10) {
                System.out.print("Enter Liters: ");
                double liters = keyboard.nextDouble();
                double gallons = liters / 3.785;
                System.out.println(liters + " liters is " + gallons + " gallons");
            }
            else if (selection == 11) {
                break;
            }
            else {
                System.out.println("Please select a number with the range 1-11");
            }
        }
    }
}
