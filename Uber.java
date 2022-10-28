import java.util.Scanner;

public class Uber {
    public static void main (String args[]){
        Point pOrigin = new Point(24, 30);
        
       
        //User usuario = new User("Juan Anderson", pUser, pDestiny);
        People chofi = new People("Pedro Palacios", pOrigin);

       
        Scanner input =new Scanner (System.in);
        System.out.println("Hola servicio de Uber ¿Cual es su nombre?... ");
        System.out.print("Ingrese su nombre aqui: ");
        String name = input.next();

        System.out.println("¿Cual es su ubicaion actual?");
        System.out.print("Ingrese su direccion aqui: ");
        int ubiX = input.nextInt();
        int ubiY = input.nextInt();
        Point pUser = new Point(ubiX, ubiY);


        System.out.println("¿Cual es su destino?");
        System.out.print("Ingrese su destino aqui: ");
        int desX = input.nextInt();
        int desY = input.nextInt();
        Point pDestiny = new Point(desX, desY);

        User pasajero = new User(name, pUser, pDestiny);
        Cost price = new Cost(pOrigin, pUser, pDestiny);
        
        System.out.println("Hola: "+pasajero.getNombre());
        System.out.println("Su metodo de viaje será:");
        System.out.println("1.- Carro");
        System.out.println("2.- Moto");

        System.out.println("Seleccione uno...");

        int vehicle = input.nextInt();

        if(vehicle == 1){
        System.out.println("Su viaje ha sido aceptado por "+chofi.getNombre());
        System.out.println("El precio del viaje será: "+price.getCost());
        }

        if(vehicle == 2){
        System.out.println("Su viaje ha sido aceptado por "+chofi.getNombre());
        System.out.println("El precio del viaje será: "+price.getCostM());
        }

    };
}
