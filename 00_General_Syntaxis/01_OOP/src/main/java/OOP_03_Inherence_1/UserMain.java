package OOP_03_Inherence_1;

public class UserMain {
    private String nombreCompleto;
    private String edad;
    private String direccionVivienda;
    private String lugarTrabajo;
    private String fechaIngreso;
    private RoleClass role;  // Se usa un RoleClass para gestionar el rol del empleado

    public UserMain(String nombreCompleto, String edad, String direccionVivienda, String lugarTrabajo, 
    		String fechaIngreso, RoleClass role) {
        
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.direccionVivienda = direccionVivienda;
        this.lugarTrabajo = lugarTrabajo;
        this.fechaIngreso = fechaIngreso;
        this.role = role;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombreCompleto);
        System.out.println("Edad: " + edad);
        System.out.println("Direccion: " + direccionVivienda);
        System.out.println("Lugar de Trabajo: " + lugarTrabajo);
        System.out.println("Fecha de Ingreso: " + fechaIngreso);
        System.out.println("Rol: " + role.getNombreRole());
        System.out.println("Salario: $" + role.getSalario());
        System.out.println("Funciones: "+ role.realizarTarea());
    }
}
