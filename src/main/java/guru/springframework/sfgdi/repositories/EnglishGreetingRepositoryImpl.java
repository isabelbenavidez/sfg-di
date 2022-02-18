package guru.springframework.sfgdi.repositories;

import guru.springframework.sfgdi.services.GreetingService;

public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {

    @Override
    public String getGreeting() {
        return "Hello World - EN";
    }
}
