public class ProductorGrande extends Productor {

    public ProductorGrande(String nombre,double extensionTotal) {
        super(nombre,extensionTotal);
    }

    @Override
    public boolean esGrande() {
        return true;
    }
}
