
import javax.swing.JPanel;
import java.util.Random;
import javax.swing.JLabel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chad
 */
class PanChar extends JPanel {

    public static JLabel lblNumb = new JLabel();

    public PanChar() {
        add(lblNumb);
        Random rand = new Random();
        int nNum = rand.nextInt(9);
        char c = (char) (rand.nextInt(26) + 'a');
        String sch = Character.toString(c);
        lblNumb.setText(sch);
        int nSelect = rand.nextInt(2);
        if (nSelect == 0) {
            lblNumb.setText(sch);
        } else if (nSelect == 1) {
            lblNumb.setText(Integer.toString(nNum));
        }

    }
}
