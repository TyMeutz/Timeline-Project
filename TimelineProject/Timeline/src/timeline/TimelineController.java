/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeline;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author ty.meutz
 */
public class TimelineController {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new ViewModel();
        //Creates the window
        frame.setTitle("Timeline");
        frame.setSize(650, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        //TimeLineComponent Object
        TimelineComponent tlc = new TimelineComponent();
        try{    
            
            //DataModel Object
            DataModel DM = new DataModel();
            
            //Calls class DataModel method FileMaker
            DM.FileMaker(tlc);
            
            }catch (InputMismatchException ex) {
                System.out.println("Invalid Input");
            }
    }
    
}
