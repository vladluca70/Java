import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        File file = new File("message.txt");

        if(file.exists())
        {
            System.out.println("The file exists!");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            //file.delete();
        }
        else
        {
            System.out.println("The file doesn't exist");
        }


        //scriem intr-un fisier
       try
       {
        FileWriter writer = new FileWriter("message.txt");
        writer.write("Hello \n");
        writer.close();
       }
       catch(IOException e)
       {
            e.printStackTrace();
       }


       //citim dintr-un fisier
       try{
       FileReader reader = new FileReader("message.txt");
        int data = reader.read();

        while(data != -1)
        {
            System.out.print((char)data);
            data = reader.read();
        }
       reader.close();
       }
       catch(FileNotFoundException e)
       {
            e.printStackTrace();
       }
       catch(IOException e)
       {
        e.printStackTrace();
       }
    }
}