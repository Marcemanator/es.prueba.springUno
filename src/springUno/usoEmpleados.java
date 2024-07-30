package springUno;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class usoEmpleados {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext.xml");


        jefeEmpleado Luis=contexto.getBean("empleadoJefe", jefeEmpleado.class);
      /*
        System.out.println(Marce.getTareas());
        System.out.println(Marce.getInforme());
        System.out.println(Luis.getTareas());
        System.out.println(Luis.getInforme());
*/
        secretarioEmpleado Maria=contexto.getBean("miSecretario", secretarioEmpleado.class);
        secretarioEmpleado Jorge= contexto.getBean("miSecretario", secretarioEmpleado.class);

        System.out.println("Luis"+Luis.getCorporateName());
        System.out.println("Luis"+Luis.getEmail());

        System.out.println(Maria.getInforme()+Maria.getTareas());

        System.out.println(Jorge.getCorporateName());
        System.out.println(Jorge.getEmail());
        contexto.close();

    }
}
