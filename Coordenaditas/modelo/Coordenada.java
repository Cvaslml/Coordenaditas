package modelo;

public class Coordenada{

    private double x;
    private double y;
    private double x2;
    private double y2;
    private double d;
    public Coordenada()

    {
        this.x = 0;
        this.y = 0;
    }

    public Coordenada(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double getX()
    {
        return x;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public double getY()
    {
        return y;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    public String toString(){
        return x +","+ y;
    }

    public boolean equals(Object o){
        Coordenada distinta = (Coordenada)o;
        return (x==distinta.x) && (y==distinta.y);
    }
    
    public double Distancia(double x, double y, double x2, double y2){
        this.x = x;
        this.y = y;
        this.x2 = x2;
        this.y2 = y2;
         if(x<x2 & y<y2){
            d = Math.sqrt(((x2-x)*(x2-x))+((y2-y)*(y2-y)));
        }else if(x>x2 & y<y2){
            d = Math.sqrt(((x-x2)*(x-x2))+((y2-y)*(y2-y)));
        }else if(x>x2 & y>y2){
            d = Math.sqrt(((x-x2)*(x-x2))+((y-y2)*(y-y2)));
        }else{
            d = Math.sqrt(((x2-x)*(x2-x))+((y-y2)*(y-y2)));
        }
        return d;
    }
}