package SpringBoot.ReactDataRest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component // automagically picked up by @SpringbootApplication
public class DatabaseLoader implements CommandLineRunner /* gets run after all the beans are created*/ {
    private final EmployeeRepository repository;
    @Autowired // constructor injector
    public DatabaseLoader(EmployeeRepository repository){
        this.repository = repository;
    }

    @Override //run() method invoked with command line arguments then loads up data
    public void run(String... args) throws Exception {
        this.repository.save(new Employee("Frodo","Baggins","ring bearer"));

    }
}
