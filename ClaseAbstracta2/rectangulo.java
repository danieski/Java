public class rectangulo extends poligono {
    private double lado1;
    private double lado2;
    public rectangulo (int lado1,int lado2){
        super(2);//Numero de lados
        this.lado1=lado1;
        this.lado2=lado2;
    }
    public double getLado1(){
        return lado1;
    }
    public double getLado2(){
        return lado2;
    }

    public String toString(){
        return "Rectangulo: \n" + super.toString()+"\nlado1= " + lado1 + ", lado2= " + lado2;
    }
    public double area() {
        return lado1*lado2;
    }
}
