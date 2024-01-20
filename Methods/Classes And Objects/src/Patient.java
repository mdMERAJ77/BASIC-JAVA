// The PatientDetails class represents the details of a patient, including their name, fees, and bed number.
class PatientDetails {
    // Name of the patient.
    String Name;
    // Fees associated with the patient.
    int Fess;
    // Bed number assigned to the patient.
    int BedNumber;
}

// The Patient class is the main class containing the program's entry point.
public class Patient {
    public static void main(String[] args) {
        // Creating an instance of the PatientDetails class named obj1.
        PatientDetails obj1 = new PatientDetails();

        // Setting details for the first patient (Meraj).
        obj1.Name = "Meraj";
        obj1.Fess = 200000;
        obj1.BedNumber = 21;

        // Displaying details for the first patient on new lines.
        System.out.println("Patient Name is: " + obj1.Name);
        System.out.println("Patient Fees is: " + obj1.Fess+"/-");
        System.out.println("Patient Bed Number is: " + obj1.BedNumber);

        // Creating another instance of the PatientDetails class named obj2.
        PatientDetails obj2 = new PatientDetails();

        // Setting details for the second patient (Sakib).
        obj2.Name = "Sakib";
        obj2.Fess = 300000;
        obj2.BedNumber = 20;

        // Displaying details for the second patient on new lines.
        System.out.println("\nPatient Name is: " + obj2.Name);
        System.out.println("Patient Fees is: " + obj2.Fess+"/-");
        System.out.println("Patient Bed Number is: " + obj2.BedNumber);
    }
}
