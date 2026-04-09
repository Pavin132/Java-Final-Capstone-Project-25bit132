import java.util.*;
class Patient {
    String name;
    int age;
    String disease;
    Patient(String name, int age, String disease) {
        this.name = name;
        this.age = age;
        this.disease = disease;
    }
}
public class HospitalSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Patient Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Disease: ");
        String disease = sc.nextLine();
        Patient p = new Patient(name, age, disease);
        System.out.println("\nAppointment Scheduled Successfully!");
        System.out.println("Patient: " + p.name);
        System.out.println("Age: " + p.age);
        System.out.println("Disease: " + p.disease);
        System.out.println("Doctor: Dr. Kumar");
    }
}
