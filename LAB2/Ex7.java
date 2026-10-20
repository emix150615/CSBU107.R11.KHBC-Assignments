public class Ex7 {
    private String studentId;
    private String fullName;
    private String major;
    private double gpa;

    public Ex7() {
        this("00000000", "N/A");
    }
    public Ex7(String studentId, String fullName) {
        this(studentId, fullName, "Undeclared", 0.0);
    }
    public Ex7(String studentId, String fullName, String major, double gpa) {
        this.studentId = studentId;
        this.fullName = fullName;
        this.major = major;
        this.gpa = gpa;
    }
    public String getStudentId() { return studentId; }
    public void setStudentId(String studentId) { this.studentId = studentId; }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public String getMajor() { return major; }
    public void setMajor(String major) { this.major = major; }

    public double getGpa() { return gpa; }
    public void setGpa(double gpa) { this.gpa = gpa; }
    public boolean isPassed() {
        return this.gpa >= 5.0;
    }
    public String academicClassification() {
        if (gpa >= 9.0) return "Excellent";
        if (gpa >= 8.0) return "Very Good";
        if (gpa >= 6.5) return "Good";
        if (gpa >= 5.0) return "Average";
        return "Weak / Fail";
    }
    public void displayInfo() {
        System.out.printf("ID: %-9s | Name: %-18s | Major: %-22s | GPA: %4.1f | Passed: %-5b | Classification: %s%n",
                studentId, fullName, major, gpa, isPassed(), academicClassification());
    }

    public static void main(String[] args) {
        Ex7 s1 = new Ex7();                                                 
        Ex7 s2 = new Ex7("21520001", "Nguyen Van A");                       
        Ex7 s3 = new Ex7("21520002", "Tran Thi B", "Computer Science", 8.8);
        Ex7 s4 = new Ex7("21520003", "Le Van C", "Software Engineering", 4.2);    
        Ex7 s5 = new Ex7("21520004", "Pham Thi D", "Information Security", 7.1);    

        System.out.println("Information");
        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
        s4.displayInfo();
        s5.displayInfo();
    }
}
