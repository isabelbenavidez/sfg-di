package guru.springframework.sfgdi.services;

//@Primary //Bean primario se eliminan para utlizar el primary en el arcihvo de config "GreetingServiceConfig"
//@Service
public class PrimaryGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello world-From the PRIMARY Bean";
    }
}
