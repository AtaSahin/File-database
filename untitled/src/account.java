import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class account {


    public void accountRegister() throws FileNotFoundException {
        Login call =new Login();
        Reads callReads=new Reads();


        System.out.println("Do you have a account?");




        try {
            Scanner scanner =new Scanner(System.in);
            String question=scanner.nextLine().toLowerCase(Locale.ROOT);
            if(question.equals("yes")){

                call.login();


            }
            else if(question.equals("no")){
                System.out.println("So lets create your account!");
                System.out.println("First enter your email address Second, your nickname/name");
                String newUser_mail=scanner.nextLine();
                String newUser_nickname=scanner.nextLine();

                try{
                    FileWriter infoWrite=new FileWriter("login.txt",true);

                    infoWrite.write(newUser_nickname+"\t"+newUser_mail+"\n");




                    System.out.println("Successfully registered...");
                    System.out.println("Now you can login with your registered nickname!");
                    call.login();
                    callReads.reader();
                    infoWrite.close();
                } catch (IOException e) {
                    System.out.println("Could not write user information data");
                }


            }




        } catch (FileNotFoundException e) {

            System.out.println("Couldnt reach to Login class in account class...");
        }


    }


    public void writerClass() throws IOException {


    }
}