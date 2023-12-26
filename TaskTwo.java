
// Student Grade Calculator
import java.util.Scanner;

public class TaskTwo {
    public static int calculateTotalMarks(int sub1, int sub2, int sub3, int sub4, int sub5) {
        return sub1 + sub2 + sub3 + sub4 + sub5;
    }

    public static float calculateAveragePercentage(int totalMarks) {
        return (float) totalMarks / 5;
    }

    public static char gradeCalculation(float avgPercentage) {
        if (avgPercentage < 40) {
            return 'F';
        } else if (avgPercentage < 50) {
            return 'E';
        } else if (avgPercentage < 60) {
            return 'D';
        } else if (avgPercentage < 70) {
            return 'C';
        } else if (avgPercentage < 80) {
            return 'B';
        } else if (avgPercentage < 90) {
            return 'A';
        } else {
            return 'O';
        }
    }

    public static void displayResults(int totalMarks, float avgPercentage, char grade)
    {
        System.out.println("Total Marks = " + totalMarks);
        System.out.println("Percentage = " + avgPercentage);
        if(grade == 'F'){
            System.out.println("Grade = " + grade + "\nYou are Fail!");
        }
        else
        {
            System.out.println("Grade = " + grade + "\nYou are Pass");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of Physics(out of 100): ");
        int physics = sc.nextInt();
        System.out.println("Enter the marks of Chemistry(out of 100): ");
        int chemistry = sc.nextInt();
        System.out.println("Enter the marks of Maths(out of 100): ");
        int maths = sc.nextInt();
        System.out.println("Enter the marks of Computer Science(out of 100): ");
        int compSci = sc.nextInt();
        System.out.println("Enter the marks of Geography(out of 100): ");
        int geography = sc.nextInt();
        int totalMarks = calculateTotalMarks(physics, chemistry, maths, compSci, geography);
        float avgPercentage = calculateAveragePercentage(totalMarks);
        char grade = gradeCalculation(avgPercentage);
        displayResults(totalMarks, avgPercentage, grade);
        sc.close();
    }
}
