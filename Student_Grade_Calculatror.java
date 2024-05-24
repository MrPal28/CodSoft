import java.util.Scanner;

public class Student_Grade_Calculatror {

  public static void main(String[] args) {
    boolean countAgain = true;
    // logic to calculate the same multiple times
    while (countAgain) {
      Scanner input = new Scanner(System.in);
      System.out.println("----------------------------------------------------------------------------");
      System.out.print("Enter the Student Name : ");
      String name = input.nextLine();
      System.out.print("Enter the Student Roll : ");
      String Roll = input.next();
      System.out.print("Please , enter the number of subject: ");
      int no_Of_Sub = input.nextInt();
      Student_Utility SU = new Student_Utility();
      System.out.println("Enter the Marks Obtain in each Subject (Must be Between 1 - 100)");
      System.out.println("----------------------------------------------------------------------------");
      double[] Marks = SU.Marks(no_Of_Sub);
      double Sum = SU.Total_Marks(Marks);
      double averagePercentage = SU.Avg_Percentage(no_Of_Sub, Sum);
      System.out.println("----------------------------------------------------------------------------");
      System.out.println("Result ");
      System.out.printf("Student Name : %s\nRoll : %s\n", name, Roll);
      System.out.println("Total Marks : " + Sum + " Out of " + (no_Of_Sub * 100));
      System.out.println("Average : " + averagePercentage + "%");
      System.out.println("Grade : " + SU.calculateGrade(averagePercentage));
      System.out.print("Do you want to Calculate again? (yes/no): ");
      String playAgainResponse = input.next().toLowerCase();
      countAgain = playAgainResponse.equals("yes") || playAgainResponse.equals("y");
    }

  }
}

// Utility Class For the Student Grade Calculator to make Logical Stuff
class Student_Utility {
  Scanner input = new Scanner(System.in);
  // A method for taking Makrs as input in all the subject in an array and produce
  // the sumt total

  public double[] Marks(int no_Of_Sub) {

    double[] Each_Sub_Marks = new double[no_Of_Sub];
    for (int i = 0; i < Each_Sub_Marks.length; i++) {
      System.out.print("Enter the No. of Subject-" + (i + 1) + " : ");
      Each_Sub_Marks[i] = input.nextInt();
    }
    for (double num : Each_Sub_Marks) {
      if (num < 0 || num > 100) {
        System.out.println("Invalid input: all elements must be greater than 0 and less than 100.");
        return null;
      }
    }
    return Each_Sub_Marks;
  }

  // A method to calculate the Total marks
  public double Total_Marks(double[] Marks) {
    double sum = 0;
    for (int i = 0; i < Marks.length; i++) {
      sum += Marks[i];
    }
    return sum;
  }

  // A method to Calculate Average percentage
  public double Avg_Percentage(int no_Of_Sub, double Sum) {
    double Average = Sum / no_Of_Sub;
    return Average;
  }

  // grade calculator
  public String calculateGrade(double averagePercentage) {
    if (averagePercentage >= 90) {
      return "A+";
    } else if (averagePercentage >= 80) {
      return "A";
    } else if (averagePercentage >= 70) {
      return "B";
    } else if (averagePercentage >= 60) {
      return "C";
    } else if (averagePercentage >= 50) {
      return "D";
    } else {
      return "F";
    }
  }
}
