package LunarLander;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

public class GameGraphics extends JPanel implements ActionListener {
    Timer timer = new Timer(1000,this);
    OpenSimplexNoise noise;
    int[] terrain;
    int second = 0;
    int x = 0;
    int y = 0;
    int velX = 1;
    int velY = 1;

    public GameGraphics() {
        timer.start();
        noise = new OpenSimplexNoise(new Random().nextLong());


    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.black);
        Graphics2D g2D = (Graphics2D) g;
        //g2D.setColor(Color.gray);
        //g2D.fillOval(x,y,100,100);
            ;
        //g2D.drawPolyline();
        terrain = new int[Game.WIDTH];
        for(int w = 0; w<Game.WIDTH; w++){
            terrain[w] = Game.HEIGHT/3+(int)(Game.HEIGHT/4*noise.eval(second,(float)w* ((float)second)*0.001) );
        }
        System.out.println(Arrays.toString(terrain));
        for (int x = 1; x<Game.WIDTH;x++){
            g2D.drawLine(x-1,terrain[x-1],x,terrain[x]);
        }
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        second++;
        x=x+velX;
        y+=velY;
        repaint();

    }
}
