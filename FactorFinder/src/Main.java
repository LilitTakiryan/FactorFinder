import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Variable that holds the input value
        int number = 0;

        //Using Scanner to get the input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Write the number which factors you want to know: ");
        number = keyboard.nextInt();
        int length = number/2;

        //Passing values to the method
        int[] factors = factorFinder(number, length);

        //Printing the results
        System.out.println("Factors are: ");
        for (int index = 0; index<length; index++ )
            System.out.print( factors[index]+" ");
    }

    public static int[] factorFinder(int number, int length)
    {
        int j=0;

        int result []= new int [length];
        for (int i = 1; i <= number; i++)
        {
            if (number % i == 0)
               result[j++] = i;
        }
    return result;
    }
}