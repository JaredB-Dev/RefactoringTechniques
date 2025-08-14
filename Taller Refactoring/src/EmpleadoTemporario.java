public class EmpleadoTemporario extends Empleado {

    public EmpleadoTemporario(String nombre, double salarioBase, int horasTrabajadas, String departamento, int mesesContrato, String genero) {
        super(nombre, salarioBase, horasTrabajadas, mesesContrato, departamento, genero);
    }

    // Más metodos
    public void imprimir(){
        imprimirDetalles();

    }
}
