import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MeuKeyListener implements KeyListener {
    private SmartTv smartTV;
    private Usuario usr;

    public MeuKeyListener(SmartTv smartTV, Usuario usr) {
        this.smartTV = smartTV;
        this.usr = usr;
    }
    
    @Override
    public void keyPressed(KeyEvent event) {
        if (event.getKeyCode() == KeyEvent.VK_ENTER) {
            smartTV.alterOnOff();
            if (usr.power) { 
            System.out.println("Welcome! Your TV's on!");
            } else System.out.println("Happy to help! Turning the TV off!");
        } else if (usr.power) {
            if (event.getKeyCode() == KeyEvent.VK_LEFT) {
                smartTV.alterVolume(false);
                System.out.println("Volume: " + usr.volume);
            } else if (event.getKeyCode() == KeyEvent.VK_RIGHT) {
                smartTV.alterVolume(true);
                System.out.println("Volume: " + usr.volume);
            } else if (event.getKeyCode() == KeyEvent.VK_UP) {
                smartTV.alterChannel(true);
                System.out.println("Channel: " + usr.channel);
            } else if (event.getKeyCode() == KeyEvent.VK_DOWN) {
                smartTV.alterChannel(false);
                System.out.println("Channel: " + usr.channel);
            }
        } else System.out.println("Press 'Enter' to turn the TV on first!");
    }

    @Override
    public void keyReleased(KeyEvent event) {
        // Não faz nada
    }

    @Override
    public void keyTyped(KeyEvent event) {
        // Não faz nada
    }
}