import java.applet.Applet;
import java.awt.Graphics;

/*
<applet code="DemoApplet.class" width="400" height="300">
</applet>
*/

public class DemoApplet extends Applet {

    public void paint(Graphics g) {

        g.drawString("Welcome to Java Applet!", 100, 100);

        g.drawString("This is my first Applet Program", 80, 130);
    }
}
