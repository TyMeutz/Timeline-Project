/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeline;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.text.*;

/**
 *
 * @author ty.meutz
 */
public class ViewModel extends JFrame implements ActionListener{
    private final static String newline = "\n";
    JPanel plButtons = new JPanel();
    JPanel jpTextField = new JPanel();
    JPanel jpArea = new JPanel();
    
    JLabel lblYear = new JLabel("Year");
    JLabel lblManufacture = new JLabel("Manufacture");
    JLabel lblModel = new JLabel("Model");
    JLabel lblModelNum = new JLabel("Model Number");
    JLabel lblPrice = new JLabel("Price");
    JLabel lblDescription = new JLabel("Description: ");
    
    JButton btnClose = new JButton("Close");
    JButton btnCreate = new JButton("Create");
    
    JTextArea description;
    JTextField jtManuf,jtModel,jtModelNum,jtPrice,jtYear;
    
    public ViewModel(){
        // Setting The TextFields
        jtManuf = new JTextField(15);
        jtModel = new JTextField(15);
        jtModelNum = new JTextField(10);
        jtPrice = new JTextField(10);
        jtYear = new JTextField(4);
        description = new JTextArea(20,20);
        
        //Creates all labels and text Fields
        jpTextField.add(lblYear);
        jpTextField.add(jtYear);
        jpTextField.add(lblManufacture);
        jpTextField.add(jtManuf);
        jpTextField.add(lblModel);
        jpTextField.add(jtModel);
        jpTextField.add(lblModelNum);
        jpTextField.add(jtModelNum);
        jpTextField.add(lblPrice);
        jpTextField.add(jtPrice);
        jpTextField.add(lblDescription);
        jpArea.add(description);
        
        plButtons.add(btnCreate);
        plButtons.add(btnClose);
        
        btnCreate.addActionListener(this);
        btnClose.addActionListener(this);
        
        //Adds Buttons to Frame
        setLayout(new GridLayout(3,2));
        add(jpTextField);
        add(jpArea);
        add(plButtons);
        
          
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == btnCreate){
            getTimelineInfo();
        }
        if(e.getSource() == btnClose){System.exit(0);}
    }
    public void getTimelineInfo(){
        
        TimelineComponent tlc = new TimelineComponent();
        tlc.year = jtYear.getText();
        tlc.manufacture = jtManuf.getText();
        tlc.model = jtModel.getText();
        tlc.modelNum = jtModelNum.getText();
        tlc.price = jtPrice.getText();
        tlc.description = description.getText();

        DataModel DM = new DataModel();
    
        //Calls class DataModel method FileMaker
        DM.FileMaker(tlc);
        
    }

    
}
