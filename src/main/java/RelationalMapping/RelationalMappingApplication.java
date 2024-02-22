package RelationalMapping;

import RelationalMapping.oneToOne.Passbook;
import RelationalMapping.oneToOne.Person;
import RelationalMapping.oneToOne.PersonRepository;
import RelationalMapping.oneToOne.PersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class RelationalMappingApplication implements CommandLineRunner {
//    @Autowired
//	PersonService personService;
//	@Autowired
//	PersonRepository personRepository;
//
//
//
//	private Logger logger= LoggerFactory.getLogger(RelationalMappingApplication.class);
//	public static void main(String[] args) {
//		SpringApplication.run(RelationalMappingApplication.class, args);
////		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
////
////
////		// Get the PersonService bean from the context
////		PersonService personService = context.getBean(PersonService.class);
////
////		// Call the savePersonWithPassport method
////		personService.savePersonWithPassport();
//	//}
@SpringBootApplication
public class RelationalMappingApplication {
	public static void main(String[] args) {
		SpringApplication.run(RelationalMappingApplication.class, args);

////
////

//	}
//
//	@Override
//	public void run(String... args) throws Exception {
//		Passbook passbook = new Passbook();
//		passbook.setPassbookNumber("ca123456");
//
//		Person person = new Person();
//		person.setName("Ajay");
//
//		person.setPassbook(passbook);
//		//impotant becouse foreign key present in passbook
//		passbook.setPerson(person);
//
//		// First, save the Passbook
//		//personService.savePassbook(passbook);
//
//		// Now, save the Person
//		personRepository.save(person);
//
//		logger.info("saved person :{} ",person.getName());
//
//	}
	}
}