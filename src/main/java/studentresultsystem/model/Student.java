package studentresultsystem.model;
import studentresultsystem.exception.InvalidStudentDataException;
import java.util.ArrayList;

public class Student {
    private String name;
    private String rollNumber; 
    private ArrayList<Integer> marks; 
    private ArrayList<String> subjects; 

    public Student(String name, String rollNumber, ArrayList<Integer> marks, ArrayList<String> subjects){

        if(subjects.size()!=marks.size()){
            throw new InvalidStudentDataException("Subject and Marks count should be same for generating the result"); 
         }
        this.name=name; 
        this.rollNumber=rollNumber; 
        this.marks=new ArrayList<>(marks); 
        this.subjects = new ArrayList<>(subjects);
        }

         public void setName(String name){
            this.name= name; 
        }

        public String getName(){
            return  this.name; 
        }

        public void setRollNumber(String rollNumber){
            this.rollNumber=rollNumber; 
        }

         public String getRollNumber(){
            return this.rollNumber; 
         }

         public ArrayList<Integer> getMarks(){
            return new ArrayList<>(this.marks); 
         }

         public ArrayList<String>  getSubjects(){
            return new ArrayList<>(this.subjects); 
         }

         



    
}
