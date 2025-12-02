class Student {
    private String name;
    private int rollNo;
    private int marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks. Enter between 0 and 100.");
        }
    }
}
public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setName("Pranav");
        s1.setRollNo(101);
        s1.setMarks(95);

        System.out.println("Name: " + s1.getName());
        System.out.println("Roll No: " + s1.getRollNo());
        System.out.println("Marks: " + s1.getMarks());

        s1.setMarks(120);
        System.out.println("Updated Marks: " + s1.getMarks());
    }
}
 