package studentresultsystem.model;

public class Result {
    private int totalMarks;
    private String grade;
    private double percentage;
    private boolean pass;

    public Result(int totalMarks, String grade, double percentage, boolean pass) {
        this.totalMarks = totalMarks;
        this.grade = grade;
        this.percentage = percentage;
        this.pass = pass;
    }

    public int getTotalMarks() {
        return this.totalMarks;
    }

    public String getGrade() {
        return this.grade;
    }

    public boolean isPass() {
        return this.pass;
    }

    public double getPercentage() {
        return this.percentage;
    }
}