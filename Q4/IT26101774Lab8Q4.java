import java.util.Scanner;

public class IT26101774Lab8Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] studentsArray = new int[8];
        int count = 0;

        System.out.println("Enter 8 Student IDs:");

        
        while (count < 8) {
            System.out.print("Enter Student ID for Student " + (count + 1) + ": ");
            int id = input.nextInt();

            if (id > 0) {
                studentsArray[count] = id; 
                count++;
            } else {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            }
        }

        
        System.out.print("\n");
		System.out.print("Enter a Student ID to Search: ");
        int searchID = input.nextInt();

        
        boolean found = false;
        for (int i = 0; i < 8; i++) {
            if (studentsArray[i] == searchID) {
                found = true;
                break; 
            }
        }

        
        if (found) {
            System.out.println("Student is Available");
        } else {
            System.out.println("Student is Not Available");
        }

        input.close();
    }
}