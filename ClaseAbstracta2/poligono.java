public abstract class poligono {
    public int numeroLados;
    public poligono(int numeroLados){ //Constructor de objetos
        this.numeroLados=numeroLados;
    }
    public int getLado(){ //Getter
        return numeroLados;
    }
    public String toString() {
        return "\nNumero de lados: " + numeroLados;
    }

    public abstract double area();
}