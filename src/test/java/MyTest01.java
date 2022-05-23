import com.liusiqi.model.Classes;
import com.liusiqi.model.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest01 {

    private ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

    @Test
    public void test01() {
        Student student = (Student) context.getBean("student");
        System.out.println(student);
        Classes classes1 = (Classes) context.getBean("classes");
        Classes classes2 = context.getBean("classes2",Classes.class);
        System.out.println(classes1);
        System.out.println(classes2);
    }
}
