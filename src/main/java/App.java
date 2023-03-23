import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);          // создаём сам контекст
        HelloWorld bean =
                applicationContext.getBean("helloworld", HelloWorld.class);       /////
        HelloWorld bean1 =                                                             //
                applicationContext.getBean("helloworld", HelloWorld.class);         //
        Cat bean2 =                                                                    //  Вызываем бины
                applicationContext.getBean("cat", Cat.class);                       //
        Cat bean3 =                                                                    //
                applicationContext.getBean("cat", Cat.class);                     ////
        boolean comparison = bean==bean1;
        boolean comparison2 = bean2==bean3;
        System.out.println(comparison);
        System.out.println(comparison2);


    }
}