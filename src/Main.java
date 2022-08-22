import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        System.out.print("Please, enter the length of the array: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        double[] array = new double [n];
        System.out.println("Array:");
        for (int i = 0; i < array.length; i++)
        {
            array[i] = Math.random();
            System.out.println(array[i]);
        }

        choiceOption(array);
    }

    public static void choiceOption(double[] array)
    {
        int choice = 0;
        while (choice != 4) {
            System.out.println();
            System.out.println("Please, select the option");
            System.out.println("1 - find a min value");
            System.out.println("2 - find a max value");
            System.out.println("3 - find an average value");
            System.out.println("4 - stop");
            Scanner in = new Scanner(System.in);
            choice = in.nextInt();
            if (choice != 4)
            {
                option(choice,array);
            }
        }

    }

    public static void option(int choice, double[] array)
    {
        switch (choice) {
            case 1:
                System.out.println("Min value: "+ findMinValue(array));
                break;
            case 2:
                System.out.println("Max value: "+ findMaxValue(array));
                break;
            case 3:
                System.out.println("Average value: "+ findAverageValue(array));
                break;

        }

    }
    public static double findMinValue(double[] array)
    {
        double minValue = array[0];
        for (int i = 0; i < array.length; i++)
        {
            if(array[i] < minValue)
            {
                minValue = array[i];
            }
        }
        return minValue;
    }

    public static double findMaxValue(double array[])
    {
        double maxValue = array[0];
        for (int i = 0; i < array.length; i++)
        {
            if(array[i] > maxValue)
            {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    public static double findAverageValue(double[] array)
    {
        double averageValue = 0;
        int i;
        for (i = 0; i < array.length; i++)
        {
            averageValue += array[i];
        }
        averageValue /= i;
        return averageValue;
    }
}
