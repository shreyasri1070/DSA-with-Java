package oops.interfaces;

public class Nicecar {
    private engine engg;
    private Media player=new CDplayer();
    public Nicecar(){
        engg=new powerEngine();
    }

    public Nicecar(engine engg) {
        this.engg = engg;
    }

    public void start(){
        engg.start();
    }
    public void stop(){
        engg.stop();
    }
    public  void startMusic(){
        player.start();
    }
    public void stopMusic(){
        player.start();
    }
    public void updrageElectric(){
        this.engg=new ElectricEngine();
    }
}
