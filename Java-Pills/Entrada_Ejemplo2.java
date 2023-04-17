import javax.swing.*;
public class Entrada_Ejemplo2 {
    
    public static void main(String[] args) {
        
        String nombre_usuario=JOptionPane.showInputDialog("Introduce tu nombre porfavor");
        
        String edad=JOptionPane.showInputDialog("Introduce edad, pls");
        
        int edad_usuario=Integer.parseInt(edad);
        
        System.out.println("Hola " + nombre_usuario + ". Ella era una mentiroasa" + (edad_usuario + 1) + "edad");
    }
    
}