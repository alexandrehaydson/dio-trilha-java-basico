//import java.util.Scanner;
import javax.swing.JFrame;

public class Usuario {
    
    Boolean power = false;
    int channel = 10;
    int volume = 12;
    public static void main(String[] args) throws Exception {
        Usuario usr = new Usuario();
        SmartTv smartTV = new SmartTv(usr);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);

        MeuKeyListener kl = new MeuKeyListener(smartTV, usr);
        frame.addKeyListener(kl);
        //System.out.println("Power " + (power ? "ON" : "OFF"));
    }
}

