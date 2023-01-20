package youtube;

import java.util.ArrayList;

public class Channel {
    
    String newVideo;
    ArrayList<Observer> suscriptores = new ArrayList<>();
    
    public void newVideo(String video){
        this.newVideo = video;
        notifySus();
    }
    
    public String getVideo(){
        return this.newVideo;
    }
    
    public void addSuscriber(Suscriber s){
        suscriptores.add(s);
    }
    
    public void notifySus(){
        for (Observer sus : suscriptores) {
            sus.updateCha();
        }
    }
    
    
    
}
