

/**
 * Write a description of class Matematico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Matematico
{
    private int numeroA, numeroB, numeroC;
    private int base;
    private int altura;
    private Calculadora calcular;
   Matematico(int numA,int numB,int numC, int base, int altura ){
       numeroA = numA;
       numeroB = numB;
       numeroC = numC;
       this.base = base;
       this.altura = altura;
      
    }
  public String mayor(){
       String respuesta;
       if(numeroA>numeroB && numeroA >numeroC){
        respuesta = "A es mayor";
        }else if(numeroB>numeroA && numeroB >numeroC){
        respuesta = "B es mayor";    
    } else if(numeroC>numeroB && numeroC >numeroA){
        respuesta = "C es mayor";
    }else{
        respuesta = "ninguno es mayor";
    }    
       return respuesta;
    }
  public String menor(){
       String respuesta;
       if(numeroA<numeroB && numeroA <numeroC){
        respuesta = "A es menor";
        }else if(numeroB<numeroA && numeroB <numeroC){
        respuesta = "B es menor";    
    } else if(numeroC<numeroB && numeroC <numeroA){
        respuesta = "C es menor";
    }else{
        respuesta = "ninguno es menor";
    }    
       return respuesta;
    }
  public String medio(){
       String respuesta;
     if(numeroA>numeroB && numeroA <numeroC){
        respuesta = "A es medio";
        }else if(numeroA<numeroB && numeroA > numeroC){
        respuesta = "A es medio";    
        }else if(numeroB>numeroA && numeroB <numeroC){
        respuesta = "B es medio";
    } else if(numeroB<numeroA && numeroB > numeroC){
        respuesta = "B es medio";
    } else if(numeroC>numeroB && numeroC <numeroA){
        respuesta = "C es medio";
    }else if(numeroC<numeroB && numeroC >numeroA){
        respuesta = "C es medio";
    }else{
        respuesta = "ninguno es menor";
    }    
       return respuesta;
    }
   public int areaCuadrado(){
     int area;
     area = base * altura;
     return area;
    }
   public double calcularDistanciaDePuntos( Punto p, Punto otro){
       double distancia;
       double nx;
       double ny;
       nx = Math.pow(p.getx() - otro.getx(), 2);
       ny = Math.pow(p.gety() - otro.gety(), 2);
       distancia = Math.sqrt(nx + ny);
       return distancia;
       
    } 
  public String cuadrante(Punto p){
       String cuadrante;
       if ((p.getx() > 0 )&&(p.gety() > 0)){
         cuadrante = "pertenece al cuadrante I";
        }else if((p.getx() < 0 )&&(p.gety() > 0)){
         cuadrante = "pertenece al cuadrante II";
        }else if((p.getx() < 0 )&&(p.gety() < 0)){
         cuadrante = "pertenece al cuadrante III";
        }else if((p.getx() > 0 )&&(p.gety() < 0)){
         cuadrante = "pertenece al cuadrante IV";
        }else{
         cuadrante = "no pertenece a ningun cuadrante";
        }
       return cuadrante;
    }
  public double calcularCateto(Calculadora c){
    double cateto;
    cateto = c.cateto();
    return cateto;
    }
  public double calcularValorX(Calculadora c){
    int valor;
    valor = c.devolverVloresDeX();
    return valor;
    }  
}
    
