import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class writes {
    public void write(){
        try {
            FileWriter writeFile=new FileWriter("newDoc.txt");
            writeFile.write("1-Songs\n" +
                    "2-Films\n" +
                    "3-Exit");


            Scanner userInput=new Scanner(System.in);
            int userIn;
            userIn=userInput.nextInt();
            switch (userIn){
                case 1:
                    System.out.println("Am I Going Crazy? – Korn.\n" +
                            "Are You The Hypnotist? – Flaming Lips.\n" +
                            "Baby, Can I Hold You Tonight? – Tracy Chapman.\n" +
                            "Can't You Hear Me Knockin'? – Rolling Stones.\n" +
                            "Do You Believe In Life After Love? – ...\n" +
                            "Do You Believe In Rapture? – ...\n" +
                            "Do You Know The Way To San Jose? – ...\n" +
                            "Do You Love Me? –");
                    break;
                case 2:
                    System.out.println("The Shawshank Redemption (1994) 9.2.\n" +
                            "The Godfather (1972) 9.2.\n" +
                            "The Dark Knight (2008) 9.0.\n" +
                            "The Godfather Part II (1974) 9.0.\n" +
                            "12 Angry Men (1957) 8.9.\n" +
                            "Schindler's List (1993) 8.9.\n" +
                            "The Lord of the Rings: The Return of the King (2003) 8.9.\n" +
                            "Pulp Fiction (1994) 8.8.");
                    break;
                case 3:
                    System.exit(1);




            }








            writeFile.close();
            System.out.println("text successfuly written in .txt file...");

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("couldnt write on your newdoc file.txt");
        }


    }
}
