package springUno;

public class jefeEmpleado implements Empleados{

    private creacionInforme informeNuevo;

    public String getCorporateName() {
        return CorporateName;
    }

    public void setCorporateName(String corporateName) {
        CorporateName = corporateName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public jefeEmpleado(creacionInforme informeNuevo) {
        this.informeNuevo = informeNuevo;
    }

    public String getTareas(){
       return "Gestiono las cuestiones relativas a los empleados";
   }

    @Override
    public String getInforme() {
        return "Informe de Jefe "+ informeNuevo.getInforme();
    }
    private String CorporateName;

    private String Email;

}
