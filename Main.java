import java.awt.Menu;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String arg[]) throws InterruptedException {

        System.out.println("######################### USZANOWANKO #########################");

        int i = 0;

        Scanner scan = new Scanner(System.in);
        VolManager vsv = new VolManager();

        StartMenu menuObject = new StartMenu();
        menuObject.menu();

        FileMen newOne = new FileMen();
        Volunteer newVol = new Volunteer();
        VolManager menago = new VolManager();



        while ( i < 6)  {
            System.out.println("Ktora pozycje wybierasz?");
            i = Integer.parseInt(scan.nextLine());

            switch(i) {
                case 1:
                {

                 //   menago.getInfo();
                    newOne.createFile(newVol);

                    Thread.sleep(1000);
                    System.out.println("");
                    menuObject.menu();
                    break;
                }

                case 2:
                {
                    System.out.print("Podaj ID wolontariusza: ");
                    String ID = scan.nextLine();
                    try {
                        menago.showVolunteer(ID);
                    } catch (Exception e) { System.out.println(e); }

                    Thread.sleep(1500);
                    System.out.println("");
                    menuObject.menu();
                    break;
                }

                case 3:
                {
                    System.out.print("Podaj ID wolontariusza: ");
                    String ID = scan.nextLine();
                    try {
                        menago.showVolunteer(ID);
                    } catch (Exception e) { System.out.println(e); }


                    System.out.println("");
                    System.out.println("Dla przykladu:");
                    System.out.println("Jesli chcesz zmienic Imie, wprowadz imie i nacisnij enter." + "\n" +
                            "Nastepnie wpisz nowe imie i nacisnij ponownie enter");
                    Thread.sleep(1000);
                    System.out.println("Sprobujmy wiec, podaj bledna dana do zmiany: ");
                    String s = scan.nextLine();
                    System.out.println("Na co zmieniamy?");
                    String n = scan.nextLine();

                    try {
                        newOne.updateFile(ID, s, n);

                        System.out.println("Nacisnij enter aby kontynuowac");
                        scan.nextLine();

                    } catch (Exception e) { System.out.println(e); }

                    System.out.println("");
                    menuObject.menu();
                    break;
                }

                case 4:
                {
                    CodeExit object = new CodeExit();
                    object.out();

                }

                case 5:
                {
                    menuObject.menu();
                    break;
                }

            }
        }
    }
}
