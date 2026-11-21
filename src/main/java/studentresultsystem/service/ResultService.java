package studentresultsystem.service;
import studentresultsystem.model.*;
import java.util.ArrayList; 
import studentresultsystem.exception.InvalidMarksException;
public class ResultService {
       public Result calculateResult(Student student){
        ArrayList<Integer> marks = student.getMarks(); 
        int sum =0; 
        int count = marks.size(); 
           if(marks.isEmpty()){
                throw new InvalidMarksException("Marks cannot be empty"); 
            }
        for(int i=0; i<count;i++){
            if(marks.get(i)>100||marks.get(i)<0){
                throw new InvalidMarksException("Marks must be between 0 and 100"); 

            }
            sum+= marks.get(i); 
        }
        int maximumMarks= 100*count; 
       
        double percentage = (sum*100.0)/maximumMarks; 
      boolean pass=true; 
        for(int i =0 ; i<count;i++){
            if(marks.get(i)<40){
                pass= false; 
                break; 
            }
        }
                String grade=""; 
     if(percentage>=90){
        grade="A+";        
     }
     else if(percentage>=80){
        grade="A"; 
     }
     else if(percentage>=70){
        grade="B"; 
     }

     else if(percentage>=60){
        grade="C";
     }

     else if(percentage>=50){
        grade="D"; 
     }
     else{
        grade="F"; 
     }

     return new Result(sum, grade, percentage, pass); 
       }
}
