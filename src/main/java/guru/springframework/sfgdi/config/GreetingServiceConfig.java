package guru.springframework.sfgdi.config;


import com.springframework.pets.DogPetService;
import com.springframework.pets.PetService;
import com.springframework.pets.PetServiceFactory;
import guru.springframework.sfgdi.repositories.EnglishGreetingRepository;
import guru.springframework.sfgdi.repositories.EnglishGreetingRepositoryImpl;
import guru.springframework.sfgdi.services.*;
import org.springframework.context.annotation.*;

@Configuration
public class GreetingServiceConfig {


    @Bean
    PetServiceFactory petServiceFactory(){
        return new PetServiceFactory();
    }

    @Bean
    @Profile({"DOG", "default"})
    PetService dogPetService(PetServiceFactory petServiceFactory){
        return petServiceFactory.getPetService("dog");
    }

    @Profile("CAT")
    @Bean
    PetService catPetService(PetServiceFactory petServiceFactory){
        return petServiceFactory.getPetService("cat");
    }


    @Profile("ES")
    @Bean("i18nService")
    I18nSpanishGreetingService i18nSpanishService(){
        return new I18nSpanishGreetingService();
    }


    @Bean
    EnglishGreetingRepository englishGreetingRepository(){
        return new EnglishGreetingRepositoryImpl();
    }


    @Profile({"EN", "default"})
    @Bean
    I18nEnglishGreetingService i18nService(EnglishGreetingRepository englishGreetingRepository){
        return new I18nEnglishGreetingService(englishGreetingRepository);
    }

    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService(){
        return new PrimaryGreetingService();
    }

    //A continuación se definen 3 beans en esta clase de configuración

    @Bean//Si ponemos este bean aquí, no es necesario anotar con @Service las implementaciones
        //Creación de instancia de ConstructorGreetingService
    ConstructorGreetingService constructorGreetingService(){
        return new ConstructorGreetingService();
    }

    @Bean//Se creó el bin con el nombre de propertyInjectedInjectedService, si o hubiera llamadopropertyInjectedInjectedService1212, ese sería el nombre del bean
        //Creación de instancia de PropertyInjectedGreetingService
    PropertyInjectedGreetingService propertyInjectedInjectedService(){
        return new PropertyInjectedGreetingService();
    }

    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService(){
        return new SetterInjectedGreetingService();
    }

}
