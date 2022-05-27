import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileMen {

    public void createFile(Volunteer a){

        Scanner scan = new Scanner(System.in);
        a.getInfo();


        try {
            File file = new File("plik" + a.getVolunteerID() + ".txt");

            if(file.createNewFile()) {

                FileWriter myWriter = new FileWriter("plik" + a.getVolunteerID() + ".txt");

                myWriter.write("ID wolontariusza: " + a.volunteerID + "\n" + "Imie wolontariusza: " + a.name +
                        "\n" + "Numer do wolontariusza: " + a.number + "\n" + "Wiek wolontariusza: " + a.age + "\n" +
                        "Przydzial wolontariusza: " + a.partWarehouse);

                myWriter.close();
                System.out.println("Wolontariusz poprawnie dodany");


                Thread.sleep(1000);

                System.out.println("Nacisnij Enter aby przejsc dalej");
                scan.nextLine();

            } else {
                System.out.println("Wolontariusz juz jest zapisany.");
                System.out.println("Nacisnij Enter aby przejsc dalej");
                scan.nextLine();
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Skontaktuj sie z Majkiem.");
        }

    }



        public void updateFile(String n, String e, String w) throws Exception {
            File file = new File("plik" + n + ".txt");
            Scanner scan = new Scanner(file);
            String fileContext = "";

            while (scan.hasNextLine()) {
                fileContext = fileContext + "\n" + scan.nextLine();
            }

            FileWriter myWriter = new FileWriter("plik" + n + ".txt");
            fileContext = fileContext.replaceAll(e, w);
            myWriter.write(fileContext);
            myWriter.close();
        }
    }



