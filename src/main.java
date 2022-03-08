import java.util.Scanner;
public class main {
    public static Scanner keyboard = new Scanner(System.in);

    /*
    Light Touch Test Specification:
    If the user enters 7 into the console 7 rows of pascals triangle are displayed

    Expected Result:
    1
    1,1
    1,2,1
    1,3,3,1
    1,4,6,4,1
    1,5,10,10,5,1
    1,6,15,20,15,6,1

    Actual Result:
    1
    1 1
    1 2 1
    1 3 3 1
    1 4 6 4 1
    1 5 10 10 5 1
    1 6 15 20 15 6 1

    If the user enters 30 into the console 30 rows of pascals triangle are displayed

    Expected result for 30th line:
    1,29,406,3654,23751,118755,475020,1560780,4292145,10015005,20030010,34597290,51895935,67863915,77558760,77558760,67863915,51895935,34597290,20030010,10015005,4292145,1560780,475020,118755,23751,3654,406,29,1

    Actual Result:
    1 29 406 3654 23751 118755 475020 1560780 4292145 10015005 20030010 34597290 51895935 67863915 77558760 77558760 67863915 51895935 34597290 20030010 10015005 4292145 1560780 475020 118755 23751 3654 406 29 1

     */
    public static void main(String[] args) {

        while (true) {
            //User decides how many rows to print
            System.out.println("This program prints Pascal's Triangle\nPlease enter how many rows you would like to display:\n");
            String n = keyboard.nextLine();
            //Checks if user has entered an integer
            try {
                Integer.parseInt(n);
                int number = Integer.parseInt(n);
                //Call Pascal function
                printPascalTriangle(number);
                break;
            } catch (NumberFormatException e) {
                System.out.println(n + " is not an integer");
            }
        }
    }
    //Function iterates through all values of Pascal's Triangle
    static void printPascalTriangle(int n)
    {
        //Iterate through rows of the triangle
        for (int row = 0; row < n; row++) {

            //Iterate through the numbers in row
            for (int k = 0; k <= row; k++)
                //Display the Binomial Coefficient
                System.out.print(binomialCoefficientFormula(row, k) + " ");

            //Formatting between lines
            System.out.println();
        }
    }
    //Calculates the Binomial Coefficient
    static int binomialCoefficientFormula(int n, int k)
    {
        //Default value for sides of triangle
        int returnCoefficient = 1;
        //The values of the triangle are symmetrical
        if (k > n - k)
            k = n - k;
        for (int i = 0; i < k; ++i)
        {
            returnCoefficient = returnCoefficient * (n - i);
            returnCoefficient = returnCoefficient / (i + 1);
        }
        return returnCoefficient;
    }
}