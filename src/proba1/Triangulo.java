
package proba1;


public class Triangulo {
  private float base;
  private  float altura;
  
  public Triangulo(float base,float altura){
      this.base=base ;
      this.altura=altura;
  }
  public float  calcularArea(){
      return base*altura/2 ;
  }
  
}
