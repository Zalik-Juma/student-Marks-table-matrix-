/*
*Name:Zalik Barasa Juma
*Reg No: J77-10594-2024
*Description: Program for student Marks table(matrix)
*/
public class StudentMarksTable {
    public static void main(String[] args) {
        int[][] marks = {
            {75, 80, 90},
            {65, 70, 85},
            {88, 92, 81}
        };
        
        // 1. Print marks in matrix form
        System.out.println("Student Marks Matrix:");
        System.out.println("--------------------");
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + "\t");
            }
            System.out.println();
        }
        
        // 2. Calculate average for Student 3 (index 2)
        int studentIndex = 2; // Student 3
        int total = marks[studentIndex][0] + 
                   marks[studentIndex][1] + 
                   marks[studentIndex][2];
        
        double average = total / 3.0;
        
        System.out.println("\nAverage marks for Student 3: " + 
                         String.format("%.2f", average));
    }

}

