import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
        System.out.println("Задание 1-3");
        int[] intArray = new int[]{1, 2, 3};
        double[] doubleArray = {1.57, 7.654, 9.986};


        printIntArray(intArray);
        printDoubleArray(doubleArray);


        printIntArrayReverse(intArray);
        printDoubleArrayReverse(doubleArray);
    }

    public static void printIntArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void printDoubleArray(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void printIntArrayReverse(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void printDoubleArrayReverse(double[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("Задание 4");
        int[] arr1 = new int[]{1, 2, 3};


        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 != 0) {
                arr1[i] += 1;
                System.out.println("Все нечётные числа стали чётными:");
                System.out.println(Arrays.toString(arr1));
            }
        }
    }
}




















        


