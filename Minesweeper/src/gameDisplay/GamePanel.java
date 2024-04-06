package gameDisplay;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GamePanel extends JPanel{
    private JButton[][] arrayButton;
    private JPanel p1, p2, p11, p12, p13;
    private JButton btSmile;
    private JLabel lbTime, lbBoom;

    public GamePanel(int width, int height,int boom) {
        arrayButton = new JButton[width][height];
        setLayout(new BorderLayout(20, 20));
        add(p1 = new JPanel(new BorderLayout()), BorderLayout.NORTH);
        p1.setBorder(BorderFactory.createLoweredBevelBorder());     /*Khiến cho layout lún xuống */
        p1.add(p11 = new JPanel(), BorderLayout.WEST);
        p1.add(p12 = new JPanel(), BorderLayout.EAST);
        p1.add(p13 = new JPanel(), BorderLayout.CENTER);
        p11.add(lbBoom = new JLabel("Số Boom"));
        p12.add(lbTime = new JLabel("Time"));
        p13.add(btSmile = new JButton("Smile"));

        add(p2 = new JPanel(new GridLayout(width, height)), BorderLayout.CENTER);
        p2.setBorder(BorderFactory.createLoweredBevelBorder());
        for(int i = 0; i < arrayButton.length; i++) {
            for(int j = 0; j < arrayButton.length; j++) {
                p2.add(arrayButton[i][j] = new JButton());
                arrayButton[i][j].setPreferredSize(new Dimension(30, 30));          /*Dimension giúp quản lý kích thước, but có cũng được không có cũng được */
            }
        }
    }   
}
