public class SmartTv {
    private Usuario usr;

    public SmartTv(Usuario usr) {
        this.usr = usr;
    }
    
    public void alterVolume (boolean up) {
        if (up) {
            usr.volume = usr.volume + 1;
        } else {
            usr.volume--;
        }
    }

    public void alterChannel (boolean up) {
        if (up) {
           usr.channel++;
        } else {
           usr.channel--;
        }
    }

    public void alterOnOff () {
        usr.power = !usr.power;
    }
}
