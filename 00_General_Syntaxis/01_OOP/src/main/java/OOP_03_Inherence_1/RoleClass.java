package OOP_03_Inherence_1;


public abstract class RoleClass {
    protected String roleNombre;
    protected double Salario;
    
    public RoleClass (String roleNombre, double Salario ) {
        this.roleNombre = roleNombre;
        this.Salario = Salario;
    }
    // settings and getter methods
    public String getNombreRole() {
        return roleNombre;
    }

    public double getSalario() {
        return Salario;
    }
    
    public abstract String realizarTarea();
}


