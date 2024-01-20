// The StudentDetails class represents the details of a student, including their name and roll number.

class StudentDetails {
    // Default name for the student.
    String name = "MERAJ";

    // Default roll number for the student.
    int RollNo = 21;
}

// The Student class is the main class containing the program's entry point.
public class Student {
    public static void main(String[] args) {
        // Create an instance of the StudentDetails class named obj1.
        StudentDetails obj1 = new StudentDetails();

        // Print the name and roll number of the student using the obj1 instance.
        System.out.println("Student Name: " + obj1.name);
        System.out.println("Roll Number: " + obj1.RollNo);
    }
}
