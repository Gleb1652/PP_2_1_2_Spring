import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld beanHello1 = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanHello2 = (HelloWorld) applicationContext.getBean("helloworld");

        Cat beanCat1 = (Cat) applicationContext.getBean("cat");
        Cat beanCat2 = (Cat) applicationContext.getBean("cat");

        System.out.println("Сравнение HelloWorld " + (beanHello1 == beanHello2));
        System.out.println("Сравнение Cat " + (beanCat1 == beanCat2));
    }
}