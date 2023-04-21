
/**
 * Write a description of class furgoneta here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class furgoneta extends Coche
{
    private int plazas_extra;
    private int capacidad_carga;
    
    public furgoneta(int plazas_extra,int capacidad_carga){
    
        super();
        this.plazas_extra=plazas_extra;
        this.capacidad_carga=capacidad_carga;
        
    
    }
    
    public String dameInfoFurgo(){
        return "Numero de plazas extra: " + plazas_extra + " plazas extra y capacidad de carga de " + capacidad_carga + " Kilos ";
        
    }
}
