package youtube;

public class Youtube {

    public static void main(String[] args) {
        Channel willy = new Channel();
        
        willy.newVideo("Matando a Vegetta");
        
        Suscriber alvaro = new Suscriber();
        alvaro.subcribirse(willy);
        
        willy.newVideo("Vegetta me la mama");
        
    }
    
}
