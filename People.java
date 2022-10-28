class People{
    private String nombre;
    private Point p;  
    
    public People(String nombre, final Point p){
        this.nombre=nombre;
        this.p=p;
    }

    public String getNombre(){
        return nombre;
    }
    public Point getP(){
        return p;
    }
}