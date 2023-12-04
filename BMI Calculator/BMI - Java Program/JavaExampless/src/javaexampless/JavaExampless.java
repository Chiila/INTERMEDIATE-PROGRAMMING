package javaexampless;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;

public class JavaExampless {

    JavaExampless(){
        JFrame f = new JFrame();//creating instance of JFrame
        f.getContentPane().setBackground(Color.PINK);
        
        JLabel lbl = new JLabel("Height(Cm): ");
        
        lbl.setBounds (20, 20, 100, 40);//x axis, y axis, width, height
        f.add(lbl);//adding component in JFrame
        
        JLabel lb2 = new JLabel("Weight(Kg): ");
        lb2.setBounds(20, 60, 100, 40);//x axis, y axis, width, height
        f.add(lb2);//adding component in JFrame
        
        JLabel lbResult = new JLabel ("BMI Calculator in JAVA GUI");
        lbResult.setBounds(95, 90, 300, 40);//x axis, y axis, width, height
        f.add(lbResult);//addding component in JFrame
        
        JTextField txtHeight = new JTextField("");
        txtHeight.setBounds(120, 20, 200, 40);//x axis, y axis, width, height
        f.add(txtHeight);//adding component in JFrame
        
        JTextField txtWeight = new JTextField ("");
        txtWeight.setBounds(120, 60, 200, 40);//x axis, y axis, width, height
        f.add(txtWeight);//adding component in JFrame
        
        JButton btn = new JButton ("BMI Calculator in JAVA GUI (CALCULATE)");//creating instnace of JButton
        btn.setBounds(20, 130, 300, 40);//x axis, y axis, width, height
        btn.setBackground(Color.WHITE);
        
        JLabel lbName = new JLabel ("Cilla Adlawan");
        lbName.setBounds(140, 230, 300, 40);//x axis, y axis, width, height
        f.add(lbName);//addding component in JFrame
        
        //Event
        btn.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            
            double w = Double.parseDouble(txtWeight.getText());
            double h = Double.parseDouble(txtHeight.getText());
            
            double weight = w * 2.20462262;
            double height = h / 2.54;
            
            double bmi = weight / Math.pow (height, 2) * 703;
            
            if (bmi < 18.5){
                lbResult.setText("underweight - BMI : "+bmi);
            } else if (bmi < 25){
                lbResult.setText("normal - BMI : "+bmi);
            } else if (bmi < 30){
                lbResult.setText("overweight - BMI : "+bmi);
            } else {
                lbResult.setText("obese - BMI : "+bmi);
            }
        }
    });
            
     f.add(btn);//adding button in JFrame
     
     f.setSize (400, 300);
     f.setLayout(null);
     f.setVisible(true);      
           
    }
    
    public static void main(String[] args) {
        new JavaExampless();
    }
    
}
