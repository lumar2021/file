import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.io.FileNotFoundException;

public class Main
{
 public static void main(String args[])
 {

try(FileWriter hoja= new FileWriter("Testing.txt", true))
{        
hoja.write("\n sopa ");
}
catch(IOException ex)
{
    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
}
}


}
