package vn.edu.iuh.fit.demospring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import vn.edu.iuh.fit.demospring.models.Clazz;
import vn.edu.iuh.fit.demospring.models.Student;
import vn.edu.iuh.fit.demospring.services.ClazzService;
import vn.edu.iuh.fit.demospring.services.StudentService;

@SpringBootApplication
public class DemoSpringApplication {
    @Autowired
    private ClazzService clazzService;
    @Autowired
    private StudentService studentService;
    public static void main(String[] args) {
        SpringApplication.run(DemoSpringApplication.class, args);
    }


    @Bean
    CommandLineRunner test_1(){
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                Clazz clazz =  new Clazz("DHKTPM16A");
                clazzService.insert(clazz);
                for (int i = 1; i < 3; i++) {
                    Student student = new Student("Name "+i,clazzService.getById(1L));
                    studentService.insert(student);
                }
            }
        };
    }

}
