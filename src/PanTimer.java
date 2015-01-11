/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chad
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanTimer extends JPanel { // panel definition
    PanOut panOut;
    private int nCount;
    private String sCount;
    Timer timer;

    public PanTimer(PanOut _panOut) {
        panOut = _panOut;
        timer = new Timer(1000, updateTask);
        // this Panel will contain all of the output, therefore called PanDisp for display
        // It will be in the CENTRE of PanMain
        nCount = 60;
        timer.start();
    }
    ActionListener updateTask = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evt) {
            nCount--;
             panOut.UpdateLabel(nCount);
        }
    };
}
