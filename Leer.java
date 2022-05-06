import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.io.FileNotFoundException;
public class Leer
{
    // instance variables - replace the example below with your own
    public static void main(String args[])
    {
       
    String contenido="";
    int c;
    try
{        
FileReader leer= new FileReader("Testing.txt");

c= leer.read();

while(c!=-1)
{
  contenido+= (char)c;
  c= leer.read();
}
}
catch(FileNotFoundException ex)
{
    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
}
catch(IOException ex)
{
    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
}
System.out.println("el contenido es"+ contenido);    
}

}
