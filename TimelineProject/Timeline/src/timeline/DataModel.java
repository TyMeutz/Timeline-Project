/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeline;
import java.util.*;
import sun.util.logging.PlatformLogger;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
/**
 *
 * @author ty.meutz
 */
public class DataModel {    
    
    static PrintWriter filewriter = null;
    
    public void FileMaker(TimelineComponent tlc){
        
        try{
        
        java.io.File nameFile = new java.io.File("src/Timeline/Timeline.txt");
        
        System.out.println("Your File Path: " + nameFile.getAbsolutePath());
        //connect our writer object with the file it writes to
        filewriter = new PrintWriter(nameFile);
        
        
        filewriter.println("Year " + tlc.year);
        filewriter.println("Manufacture " + tlc.manufacture);
        filewriter.println("Model " + tlc.model);
        filewriter.println("Model Number " + tlc.modelNum);
        filewriter.println("Price " + tlc.price);
        filewriter.println("Description:" + tlc.description);
        
            
        filewriter.flush();
        filewriter.close();
        
        Scanner fileScanner = new Scanner(nameFile);
        System.out.println(fileScanner.next());
        System.out.println(fileScanner.next());
        System.out.println(fileScanner.next());
        System.out.println(fileScanner.next());
        System.out.println(fileScanner.next());
        
        }catch (FileNotFoundException ex){    
            Logger.getLogger(DataModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
        
}
