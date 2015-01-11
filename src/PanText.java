
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chad
 */
class PanText extends JPanel{ 
    public static JTextField txtbox = new JTextField(20);
    public static JButton btnenter = new JButton("Enter");
    PanChar panchar;
    
    public PanText(PanChar _panchar){
        add(txtbox);
        add(btnenter);
        panchar = _panchar;
        
        class Check implements ActionListener {
            public void actionPerformed(ActionEvent event) {
    }
        }
    }
}
        
