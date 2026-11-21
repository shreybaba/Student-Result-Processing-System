package studentresultsystem.model;

public class Result {
      private int totalmarks; 
      private String grade; 
      private double percentage; 
      private boolean pass; 

     public  Result(int totalmarks,String  grade, double percentage, boolean pass){
        this.totalmarks = totalmarks; 
        this. grade= grade; 
        this. percentage = percentage; 
        this . pass = pass; 
      }

      public int gettotalmarks(){
        return this.totalmarks; 
      }

      public String getgrade(){
        return this.grade; 
   }

   public boolean getpass(){
    return this.pass;
   } 

   public double getpercentage(){
    return this.percentage; 
   }
}
