package ejecutable;
import modelo.Coordenada;

public class Test {
    public static void main(String[] args) {
        Coordenada c1 = new Coordenada();
        Coordenada c2 = new Coordenada(1.3,5.3);
        Coordenada c3 = c1;
        Coordenada c4 = c2;

        System.out.println("Primera coordenada: " + c1.toString());
        System.out.println("Segunda coordenada: " + c2.toString());
        System.out.println("Tercera coordenada: " + c3.toString());
        System.out.println("Cuarta coordenada: " + c4.toString());
        Coordenada distancia = new Coordenada();
        System.out.println("La distancia entre los puntos (0,0) y (4.4,7.9) es: "+ distancia.Distancia(0.0, 0.0, 4.4, 7.9));

    if(c1.equals(c2)){
        System.out.println("Las coordenadas son iguales");
        }
        else{
            System.out.println("Las coordenadas son diferentes");
        }
    }
}
