package persona;
import javax.swing.JOptionPane;

public class PruebaPersona {
    public static void main(String[] args) {
        // Solicitud de datos persona 1
        var n1 = JOptionPane.showInputDialog("Inrese su nombre");
        var a1 = JOptionPane.showInputDialog("Ingrese su apellido");
        var obj1 = new Persona();

        // Asignacion de valores
        obj1.setNombre(n1);
        obj1.setApellido(a1);
        obj1.mostrar1();

        // solicitud de datos persona 2
        var n2 = JOptionPane.showInputDialog("Ingresa tu nombre");
        var a2 = JOptionPane.showInputDialog("Ingresa tu apellido");
        var obj2 = new Persona();

        // Asignacion de valores
        obj2.setNombre(n2);
        obj2.setApellido(a2);
        obj2.mostrar2();
    }
}
