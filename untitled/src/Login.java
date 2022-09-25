import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Login {


    public void login() throws FileNotFoundException {



        try {
            FileReader read1 = new FileReader("login.txt");
            FileWriter writeLogin = new FileWriter("login.txt",true);
            Scanner myRead = new Scanner(read1);
            Scanner input_user = new Scanner(System.in);


            System.out.println("Enter your username");
            String userinput=input_user.nextLine();
            writeLogin.write(userinput);

         while(myRead.hasNext()){


           while(myRead.next().equals(userinput)){


                 System.out.println("Valid user welcome...");


                 Reads reads=new Reads();
                 reads.reader();
                 break;
             }

         }


        } catch (IOException e) {
            System.out.println("couldnt write user input into file.");
        }

    }
}
