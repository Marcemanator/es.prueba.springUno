package springUno;

public class directorEmpleado implements Empleados {

    // creacion de campo tipo creacionInforme

    private creacionInforme informeNuevo;


    // creacion del constructor que inyecta la dependencia

    public directorEmpleado(creacionInforme informeNuevo){

        this.informeNuevo=informeNuevo;
    }

    public String getTareas() {
        return "Cosas que hace el director";
    }

    @Override
    public String getInforme() {
        return "Creacion de informe hecho por el director" + informeNuevo.getInforme();
    }




}



