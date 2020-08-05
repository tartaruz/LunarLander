package LunarLander;
import javax.swing.*;
import java.awt.*;

public class Game extends JFrame {
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    GameGraphics graphic = new GameGraphics();
    final static int WIDTH = 700;
    final static int HEIGHT = 500;


    public Game() {
        this.setSize(WIDTH, HEIGHT);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setUndecorated(true);
        this.add(graphic);
        this.setVisible(true);
    }


    public static void main(String[] args) {
        System.setProperty("sun.java2d.opengl","True");

        Game g = new Game();


    }
}