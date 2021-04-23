
/**
 * Write a description of class Calculadora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Calculadora
{
  private int a,b,c;
  private double hipotenusa;
  private double cateto;
  private int x,y;
  Calculadora(int a,int b,int c,double hip, double cat){
    this.a = a;
    this.b = b;
    this.c = c;
    hipotenusa = hip;
    cateto = cat;
    }
  public int devolverVloresDeX(){
    int valorX; 
    valorX = (-c -b)/ a;
    
    return valorX;
    }
  private int pendiente(Punto p, Punto otro){
      int m;
      m = (otro.gety()- p.gety()) / (otro.getx()- p.getx());
      return m;
    }
  public double cateto(){
    double res;
    res = Math.sqrt(Math.pow(hipotenusa, 2) - Math.pow(cateto, 2));
    return res;
    }
}
