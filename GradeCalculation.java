
public class GradeCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int math = 99;
        int science = 99;
        int english = 99;
        
        double average = (math + science + english) / 3.0;
        
        String grade;
        if (average >= 90 && average <= 100) {
            grade = "A+";
        } else if (average >= 75 && average <= 89) {
            grade = "A";
        } else if (average >= 60 && average <= 74) {
            grade = "B";
        } else if (average >= 40 && average <= 59) {
            grade = "C";
        } else {
            grade = "Fail";
        }
            System.out.println("Average: " + average);
            System.out.println("Grade: " + grade);

            if (grade ==("Fail")) {
                System.out.println("Please work harder next time.");
            } else if (grade==("A+") || grade==("A")) {
                System.out.println("Excellent performance!");
            } else {
                System.out.println("Keep improving.");
            } 
                if (math < 35 || science < 35 || english < 35) {
                    System.out.println("Failed due to low score in at least one subject.");
                }
            }
        }

	


