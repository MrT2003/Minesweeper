package gameDisplay;

import javax.swing.JFrame;

import model.LoadData;

public class GameFrame extends JFrame {
    private LoadData loadData;

    public GameFrame() {
        loadData = new LoadData();
        setIconImage(loadData.getListImage().get("title"));
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GameFrame();
    }
}
