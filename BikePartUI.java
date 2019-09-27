import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.time.LocalTime;
public class BikePartUI{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        ArrayList deliveryparts = new ArrayList();
        int choice;
        boolean programrunning = true;
        while(programrunning){
            System.out.println("1: Read File");
            System.out.println("2: Enter Part");
            System.out.println("3: Sell Part");
            System.out.println("4: Display Part");
            System.out.println("5: Sort Name");
            System.out.println("6: Sort Number");
            System.out.println("7: Quit Program");
            choice = input.nextInt();
            if(choice == 1){
                System.out.println("Enter File Name:");
                    FileInputStream readfile = new FileInputStream(input.next());

                    Scanner inputfile = new Scanner(readfile);
                    boolean readingfile = true;
                    while (readingfile) {
                        if (inputfile.hasNextLine()) {
                            String currentline = inputfile.nextLine();
                            deliveryparts.add(currentline);
                        }
                        if (inputfile.hasNextLine() == false) {
                                readingfile = false;
                        }
                        }
                    for(int i = 0; i > deliveryparts.size();i++){

                    }
                    }

            else if(choice == 2) {
                String newpart = input.nextLine();
                Scanner newpartline = new Scanner(newpart);
                String bikepartname = newpartline.next();
                boolean namestillgoing = true;
                String bikepartnumber = "";
                while (namestillgoing) {
                    if (newpartline.hasNextInt()) {
                        bikepartnumber = newpartline.next();
                        namestillgoing = false;
                    } else {
                        bikepartname += newpartline.next();
                    }
                }
                String bikepartprice = newpartline.next();
                String bikepartsaleprice = newpartline.next();
                boolean bikepartisonsale = newpartline.nextBoolean();
                BikePart newbikepart = new BikePart(bikepartname, bikepartnumber, bikepartprice, bikepartsaleprice, bikepartisonsale);
            }
            else if(choice == 3){
                String sellpart = input.next();
                System.out.println("the part was sold at " + LocalTime.now().toString());

            }
            else if(choice == 4){
                String displaypart = input.next();
            }
            else if(choice == 5){

            }
            else if(choice == 6){

            }
            else if(choice == 7){
                programrunning = false;
            }
            else {
                System.out.println("Not one of the choices, please pick one from the list");
            }


        }
    }
}