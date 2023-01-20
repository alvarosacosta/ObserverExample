package youtube;

public class Suscriber implements Observer {
    private String name;
    private Channel canal;
    private String ultimoVideoVisto;
    
    private void showNewVideo(){
        this.ultimoVideoVisto = canal.getVideo();
        System.out.println(this.ultimoVideoVisto);
    }
    
    public void subcribirse(Channel canal){
        this.canal = canal;
        canal.addSuscriber(this);
        
        showNewVideo();
    }
    
    @Override
    public void updateCha() {
        showNewVideo();
    }
    
    
}
