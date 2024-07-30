package springUno;

public class secretarioEmpleado implements Empleados{

    private creacionInforme informeNuevo;


    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getCorporateName() {
        return CorporateName;
    }

    public void setCorporateName(String corporateName) {
        CorporateName = corporateName;
    }

    public void setInformeNuevo(creacionInforme informeNuevo) {
        this.informeNuevo = informeNuevo;
    }

    public String getTareas() {

        return "Cosas relativas a los secretarios";
    }

    @Override
    public String getInforme() {
        return "creacion del  informe de secretario" +informeNuevo.getInforme() ;
    }

    private String CorporateName;

    private String Email;
}