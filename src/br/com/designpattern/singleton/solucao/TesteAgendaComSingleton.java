package br.com.designpattern.singleton.solucao;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TesteAgendaComSingleton {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        /*AgendaSingletonEAGER agenda1 = AgendaSingletonEAGER.getInstance();
        AgendaSingletonEAGER agenda2 = AgendaSingletonEAGER.getInstance();
        System.out.println(agenda1);
        System.out.println(agenda2);

        reservaDiaEAGER("Sexta");
        reservaDiaEAGER("Sabado");*/

        /*AgendaSingletonLAZY agenda1 = AgendaSingletonLAZY.getInstance();
        AgendaSingletonLAZY agenda2 = AgendaSingletonLAZY.getInstance();
        System.out.println(agenda1);
        System.out.println(agenda2);

        reservaDiaLAZY("Sexta");
        reservaDiaLAZY("Sabado");

        // reflection
        Constructor<AgendaSingletonLAZY> construtorTravesso = AgendaSingletonLAZY.class.getDeclaredConstructor();
        construtorTravesso.setAccessible(true);
        AgendaSingletonLAZY agendaTravessa = construtorTravesso.newInstance();
        AgendaSingletonLAZY agendaTravessa2 = construtorTravesso.newInstance();

        System.out.println(agendaTravessa);
        System.out.println(agendaTravessa2);

        //System.out.println(new AgendaSingletonEAGER());
        //System.out.println(new AgendaSingletonEAGER());

        //System.out.println(new AgendaSingletonLAZY());
        //System.out.println(new AgendaSingletonLAZY());*/

        AgendaSingletonEnum agenda1 = AgendaSingletonEnum.getInstance();
        AgendaSingletonEnum agenda2 = AgendaSingletonEnum.getInstance();
        System.out.println(agenda1.hashCode());
        System.out.println(agenda2.hashCode());

        reservaDiaEnum("Sexta");
        reservaDiaEnum("Sabado");

        // reflection
        Constructor<AgendaSingletonEnum> construtorTravesso = AgendaSingletonEnum.class.getDeclaredConstructor();
        construtorTravesso.setAccessible(true);
        AgendaSingletonEnum agendaTravessa = construtorTravesso.newInstance();
        AgendaSingletonEnum agendaTravessa2 = construtorTravesso.newInstance();

        System.out.println(agendaTravessa.hashCode());
        System.out.println(agendaTravessa2.hashCode());

        //System.out.println(new AgendaSingletonEAGER());
        //System.out.println(new AgendaSingletonEAGER());

        //System.out.println(new AgendaSingletonLAZY());
        //System.out.println(new AgendaSingletonLAZY());
    }

    public static void reservaDiaEAGER(String dia){
        AgendaSingletonEAGER agenda = AgendaSingletonEAGER.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }

    public static void reservaDiaLAZY(String dia){
        AgendaSingletonLAZY agenda = AgendaSingletonLAZY.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }

    public static void reservaDiaEnum(String dia){
        AgendaSingletonEnum agenda = AgendaSingletonEnum.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }
}
