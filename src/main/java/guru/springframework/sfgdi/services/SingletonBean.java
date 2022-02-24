package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {

    public SingletonBean() {
        System.out.println("Creando un Singleton Bean!!!");
    }

    public String getMyScope(){
        return "Im a Singleton";
    }


}
