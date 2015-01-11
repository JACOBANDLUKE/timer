
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chad
 */
class PanMain extends JPanel{
    
    PanOut panOut = new PanOut();
    PanTimer pantimer = new PanTimer(panOut);
    PanChar panchar = new PanChar();
    PanText pantext = new PanText(panchar);
     
    
     public PanMain() { 
       
        setLayout(new BorderLayout());
        add(pantimer, BorderLayout.EAST);
        add(panOut, BorderLayout.EAST);
        add(pantext, BorderLayout.SOUTH);
        add(panchar, BorderLayout.CENTER);
                
        
        
}
}
