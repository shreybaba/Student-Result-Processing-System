package studentresultsystem.model;
import java.util.ArrayList;

public class Student {
    private String name;
    private String RollNumber; 
    private ArrayList<Integer> marks; 

    Student(String Name, String RollNumber, int Marks){
        this.name=name; 
        this.RollNumber=RollNumber; 
        this.marks=new ArrayList<>(marks); 
        }

         public void setName(String name){
            this.name= name; 
        }

        public String getName(){
            return  this.name; 
        }

        public void setRollNumber(String RollNumber){
            this.RollNumber=RollNumber; 
        }

         public String getRollNumber(){
            return this.RollNumber; 
         }


    
}
