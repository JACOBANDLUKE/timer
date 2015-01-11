/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chad
 */
import javax.swing.JLabel;
import javax.swing.JPanel;
public class PanOut extends JPanel{


    int nCount;
    String sCount;
    private final JLabel lblCount;

    public PanOut() {
        lblCount = new JLabel("60");
        add(lblCount);

    }

    void UpdateLabel(int _nCount) {
        nCount = _nCount;
        sCount = Integer.toString(nCount);
        lblCount.setText(sCount);
    }
}
