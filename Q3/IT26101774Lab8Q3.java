import java.util.Scanner;

public class IT26101774Lab8Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] array = new int[6];
        int count = 0; 

        System.out.println("Enter 6 Positive Numbers:");

      
        while (count < 6) {
            System.out.print("Enter a Positive Number (" + (count + 1) + "/6): ");
            int num = input.nextInt();

            if (num > 0) {
                array[count] = num; 
                count++; 
            } else {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            }
        }

       
        System.out.println("\n");
		System.out.println("Array Contents:");
        for (int i = 0; i < 6; i++) {
            System.out.print(array[i] + " ");
        }

        
        int max = array[0];
        for (int i = 1; i < 6; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("\n");
		
		System.out.println("The Maximum Number Entered: " + max);

        input.close();
    }
}