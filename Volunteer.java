import java.util.Scanner;

public class Volunteer {

    String name;
    String number;
    String partWarehouse;
    String volunteerID;
    String age;


    public void getInfo() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj imie wolontariusza: ");
        name = scan.nextLine();

        System.out.print("Podaj numer kontaktowy: ");
        number = scan.nextLine();

        System.out.print("Podaj przydzial magazynu: ");
        partWarehouse = scan.nextLine();

        System.out.print("Nadaj ID wolontariuszowi: ");
        volunteerID = scan.nextLine();

        System.out.print("Podaj wiek wolontariusza: ");
        age = scan.nextLine();
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getPartWarehouse() {
        return partWarehouse;
    }

    public String getVolunteerID() {
        return volunteerID;
    }

    public String getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setPartWarehouse(String partWarehouse) {
        this.partWarehouse = partWarehouse;
    }

    public void setVolunteerID(String volunteerID) {
        this.volunteerID = volunteerID;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
