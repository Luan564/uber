import java.lang.Math;

public class Cost {
    private Double travel;
    private Double travelM;
    

    public Cost(Point pOrigin, Point pUser, Point pDestiny){
        travel = Math.sqrt(Math.pow((pOrigin.getX()-pUser.getX()), 2)+Math.pow((pOrigin.getY()-pUser.getY()), 2))+
         Math.sqrt(Math.pow((pUser.getX()-pDestiny.getX()), 2)+Math.pow((pUser.getY()-pDestiny.getY()), 2));
 
     }
 
 
     public double getCost(){
         return travel;
     }

     public double getCostM(){
        travelM = travel*Config.COST_MOTO;
        return travelM;
    }

    
    
}
