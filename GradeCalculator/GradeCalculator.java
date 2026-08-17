import java.util.*;

public class GradeCalculator{
    //Calculate the Total Marks
    public static double calculateTotal(double[] marks){
        double total = 0;
        for(int i = 0; i < marks.length; i++){
            total += marks[i];
        }

        return total;
    }

    //Calculate the Average
    public static double calculateAverage(double totalMarks){
        double average = totalMarks / 5;
        return average;
    }

    public static char getGrade(double average){
        if(average >= 90 && average <= 100){
            return 'O';
        }
        else if(average >= 80 && average < 90){
            return 'A';
        }
        else if(average >= 70 && average < 80){
            return 'B';
        }
        else if(average >= 60 && average < 70){
            return 'C';
        }
        else if(average >= 50 && average < 60){
            return 'D';
        }
        else{
            return 'F';
        }
    }

    public static void main(String[] args){
        //CBSE class 10 Grade Calculator
        Scanner scan = new Scanner(System.in);

        //Subjects of Class 10
        String[] subjects = {"English", "Tamil", "Maths", "Science", "Social Science"};

        //Store marks in arrays
        double[] marks = new double[subjects.length];

        //User inputs the marks
        for(int i = 0; i < subjects.length; i++){
            System.out.printf("Enter your %s marks: ", subjects[i]);
            marks[i] = scan.nextDouble();
        }

        //Stores calculated total marks
        double totalMarks = calculateTotal(marks);
        System.out.println("Total marks: " + totalMarks);

        //Stores calculated average
        double average = calculateAverage(totalMarks);
        System.out.println("Average: " + average);

        //Stores grade
        char grade = getGrade(average);
        System.out.println("Grade: " + grade);
    }
}