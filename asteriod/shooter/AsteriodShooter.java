package asteriod.shooter;

import asteriod.shooter.GameComponents.panelGame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AsteriodShooter extends JFrame {
    
    public AsteriodShooter(){
        init();
    }

    public void init(){
        setTitle("Asteriod Shooter");
        setSize(1366,768);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(new BorderLayout());
        panelGame panelGame = new panelGame();
        add(panelGame);
        addWindowListener(new WindowAdapter(){
            @Override
            public void windowOpened(WindowEvent we){
             panelGame.start();
            }
        });
    }
    
    public static void main(String[] args) {
        AsteriodShooter obj = new AsteriodShooter();
        obj.setVisible(true);
    }
    
}
