import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld be = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(be.getMessage());
        System.out.println(bean.getMessage());
        System.out.println(be.equals(bean));
        System.out.println();

        ApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
        Cat beans = (Cat) app.getBean("cat");
        Cat bea = (Cat) app.getBean("cat");
        System.out.println(bea.getMessage());
        System.out.println(beans.getMessage());
        System.out.println(bea.equals(beans));


    }
}