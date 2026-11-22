package studentresultsystem;
  import java.util.ArrayList; 
  import studentresultsystem.model.Student; 
  import studentresultsystem.model.Result; 
  import studentresultsystem.service.ResultService; 

public class Main {
    public static void main(String[] args) {
     ArrayList<String> subjects = new ArrayList<>(); 
     ArrayList<Integer> marks = new ArrayList<>(); 

     subjects.add("Java");
marks.add(80);

subjects.add("DSA");
marks.add(90);

subjects.add("DBMS");
marks.add(70);

subjects.add("Maths");
marks.add(60);

subjects.add("COA");
marks.add(100);

Student student = new Student("Shrey", "GU12345", marks, subjects);
ResultService service = new ResultService();
Result result = service.calculateResult(student);

System.out.println("Student Name: " + student.getName());
System.out.println("Roll Number: " + student.getRollNumber());

System.out.println("Total Marks: " + result.getTotalMarks());
System.out.println("Percentage: " + result.getPercentage());
System.out.println("Grade: " + result.getGrade());
System.out.println("Result: " + (result.isPass() ? "PASS" : "FAIL"));


    }
}