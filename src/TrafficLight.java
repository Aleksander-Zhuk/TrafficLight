import javax.swing.*;
import java.awt.*;

public class TrafficLight extends Canvas {

    public void paint(Graphics g){

        setBackground(Color.WHITE);

                // верхняя шапка
        g.setColor(Color.BLACK);
        g.fillArc(270, 158, 60, 40,0,180);
        g.setColor(Color.white);
        int[] xp = {270,270,278};
        int[] yp = {178,170,186};
        g.fillPolygon(xp, yp, 3);
        int[] xp2 = {332,324,332};
        int[] yp2 = {178,178,170};
        g.fillPolygon(xp2, yp2, 3);

                 // основной прямоугольник
        g.setColor(Color.BLACK);
        g.fillRoundRect(250, 180, 100, 292, 15, 15);

                 // красный фонарь
        g.setColor(Color.WHITE);
        g.fillOval(260,188,80, 80 );
        g.setColor(Color.black);
        g.fillOval(256,197,88, 88);
        g.setColor(Color.RED);
        g.fillOval(265,204,70,70);

                  // желтый фонарь
        g.setColor(Color.WHITE);
        g.fillOval(260,281,80, 80 );
        g.setColor(Color.black);
        g.fillOval(256,290,88, 88);
        g.setColor(Color.orange);
        g.fillOval(265,296,70,70);

                   // зелёный фонарь
        g.setColor(Color.WHITE);
        g.fillOval(260,374,80, 80 );
        g.setColor(Color.black);
        g.fillOval(256,383,88, 88);
        g.setColor(Color.GREEN);
        g.fillOval(265,389,70,70);

                   // нижний прямоугольник
        g.setColor(Color.BLACK);
        g.fillRoundRect(280, 475, 40, 60, 10, 10);

                   // левые треугольники
        g.fillRoundRect(196,204, 50, 10, 10, 10);
        g.fillRoundRect(236,204, 10, 50, 10, 10);
        int[] xp3= {196,240,239};
        int[] yp3= {211,207,254};
        g.fillPolygon(xp3,yp3,3);
        g.fillRoundRect(196,297, 50, 10, 10, 10);
        g.fillRoundRect(236,297, 10, 50, 10, 10);
        int[] xp4= {196,240,239};
        int[] yp4= {304,300,347};
        g.fillPolygon(xp4,yp4,3);
        g.fillRoundRect(196,390, 50, 10, 10, 10);
        g.fillRoundRect(236,390, 10, 50, 10, 10);
        int[] xp5= {196,240,239};
        int[] yp5= {397,393,440};
        g.fillPolygon(xp5,yp5,3);

                   // правые треугольники
        g.fillRoundRect(354,204, 50, 10, 10, 10);
        g.fillRoundRect(354,204, 10, 50, 10, 10);
        int[] xp6= {404,358,361};
        int[] yp6= {211,207,254};
        g.fillPolygon(xp6,yp6,3);
        g.fillRoundRect(354,297, 50, 10, 10, 10);
        g.fillRoundRect(354,297, 10, 50, 10, 10);
        int[] xp7= {404,358,361};
        int[] yp7= {304,300,347};
        g.fillPolygon(xp7,yp7,3);
        g.fillRoundRect(354,390, 50, 10, 10, 10);
        g.fillRoundRect(354,390, 10, 50, 10, 10);
        int[] xp8= {404,358,361};
        int[] yp8= {397,393,440};
        g.fillPolygon(xp8,yp8,3);

    }
    public static void main(String[] args) {

        JFrame jFrame = new JFrame("Светофор");
        TrafficLight t = new TrafficLight();
        jFrame.add(t);

        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(600, 700);
        jFrame.setLocation(900, 50);

    }
}
