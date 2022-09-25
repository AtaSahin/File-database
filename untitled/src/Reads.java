import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Reads {


    public void reader() throws FileNotFoundException {
        try {
            FileReader read=new FileReader("newDoc.txt");
            Scanner myRead=new Scanner(read);
            while (myRead.hasNext()){

                String data =myRead.nextLine();
                System.out.println(data);


            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Cannot read file...");
        }


    }
}
