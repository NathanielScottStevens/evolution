package evolution;

import java.lang.*;
import javax.swing.JFrame;
import asciiPanel.AsciiPanel;

import java.util.concurrent.TimeUnit;

public class Application extends JFrame {
    private AsciiPanel terminal;
    private World world;

    public Application(){
        super();
        terminal = new AsciiPanel(24, 24);
        world = new World();
        world.addAgent(new Agent('a', new Point(2, 2)));
        world.addAgent(new Agent('b', new Point(5, 5)));
        world.addAgent(new Agent('c', new Point(7, 7)));
        add(terminal);
        pack();
    }

    public void repaint(){
        terminal.clear();
        world.draw(terminal);
        super.repaint();
    }

    public void run(){
        try {
            while(true){
                TimeUnit.MILLISECONDS.sleep(500);
                world.update();
                repaint();
            }
        } catch (InterruptedException e) {

        }
    }

    public static void main(String[] args) {
        Application app = new Application();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
        app.run();
    }
}
