package LunarLander;

import javax.swing.*;
import java.awt.*;

public class LunarModule extends JPanel {
    LunarModule() {

    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.setColor(Color.GREEN);
        g2D.fillOval(Game.WIDTH/2,Game.HEIGHT/2,10,10);
    }
}
