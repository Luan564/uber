public class User extends People {
    private Point destiny;

    public User(String nombre, final Point p, final Point destiny){
        super(nombre, p);
        this.destiny=destiny;
    }

        
    public Point getDestiny(){
    return destiny;
    }
}
