import java.util.Scanner;


/**
 *
 * Will complete assignment in a day or two
 *
 */

public class Main {


    Scanner sc = new Scanner(System.in);


    //function to checkPalindrome

    public void checkPalindrome()
    {

    }


    //function to printPattern

    public void printPattern()
    {

        System.out.print("Enter number of levels to be printed : ");
        int levels = sc.nextInt();

        while(levels>0)
        {
            for(int i=levels; i>=1; i--)
            {
                System.out.print("*");
            }
            System.out.println();
            --levels;
        }
        System.out.println();
    }


    //function to check no is prime or not

    public void checkPrimeNumber() {

        System.out.print("Please enter number to be check for Prime :");
        int numberToBeChecked = sc.nextInt();

        if(numberToBeChecked ==1 || numberToBeChecked ==2)
        {
            System.out.println("Number is Prime\n");
        }else {
            for(int i=2; i<numberToBeChecked; i++)
            {
                if(numberToBeChecked%i ==0)
                {
                    System.out.println("Number is not prime\n");
                    return;
                }
            }
            System.out.println("Number is Prime\n");
        }

    }


    // function to print Fibonacci Series

    public void printFibonacciSeries() {

        //initialize the first and second value as 0,1 respectively.

        int first = 0, second = 1;

    }


//main method which contains switch and do while loop

    public static void main(String[] args) {

        Main obj = new Main();

        int choice;

        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

                    + "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

                    + "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

            System.out.println();


            choice = sc.nextInt();

            switch (choice) {


                case 0:

                    choice = 0;

                    break;


                case 1: {

                    obj.checkPalindrome();

                }

                break;


                case 2: {


                    obj.printPattern();

                }

                break;


                case 3: {

                    obj.checkPrimeNumber();

                }

                break;


                case 4: {


                    obj.printFibonacciSeries();

                }

                break;


                default:

                    System.out.println("Invalid choice. Enter a valid no.\n");

            }


        } while (choice != 0);

        System.out.println("Exited Successfully!!!");

        sc.close();

    }


}