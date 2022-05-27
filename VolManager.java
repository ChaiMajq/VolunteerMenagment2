import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class VolManager {
        public void showVolunteer(String s) throws Exception {

        File file = new File("plik" + s + ".txt");
            Scanner scan = new Scanner(file);

            while (scan.hasNextLine()) {
                System.out.println(scan.nextLine());
            }

    }




}



