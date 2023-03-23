import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration              // Настроечный класс
public class AppConfig {
 
    @Bean(name="helloworld")                              //содержится метод, помеченный аннотацией как бин,
    public HelloWorld getHelloWorld() {                   // этот метод будет выполнен при запуске и его результат
        HelloWorld helloWorld = new HelloWorld();         // станет объектом, управляемым Спрингом.
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }
    @Bean(name="cat")
    @Scope("prototype")
    public Cat getCat(){
        Cat cat = new Cat();
        cat.setMessage("Cat!");
        return cat;
    }

}