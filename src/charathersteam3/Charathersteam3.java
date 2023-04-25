package charathersteam3;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author AS
 */
public class Charathersteam3 {

    
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("data.txt");
            BufferedWriter output = new BufferedWriter(file);
            output.write("Hello world");
            output.write("Welcome JAVA");
            output.close();
        } catch (IOException e) {
            Logger.getLogger(Charathersteam3.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            FileReader file = new FileReader("data.txt");
            BufferedReader input = new BufferedReader(file);
            String s;
           while ((s=input.readLine()) != null){
               System.out.println(s);
           }
        } catch (FileNotFoundException e) {
            Logger.getLogger(Charathersteam3.class.getName()).log(Level.SEVERE, null, e);
        } catch (IOException e) {
            Logger.getLogger(Charathersteam3.class.getName()).log(Level.SEVERE, null, e);
        }


    }
}