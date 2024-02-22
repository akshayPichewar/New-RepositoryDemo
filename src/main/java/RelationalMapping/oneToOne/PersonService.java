package RelationalMapping.oneToOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PersonService {

    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private PassbookRepository passbookRepository;


    @Transactional
    public void savePersonWithPassport(Person person) {
        personRepository.save(person);
    }


//    public void savePersonWithPassport() {
//        Person person = new Person();
//        person.setName("John Doe");
//
//        Passbook passbook = new Passbook();
//        passbook.setPassbookNumber("Ba123123");
//
//        passbook.setPerson(person);
//
//        person.setPassbook(passbook);
//
//        personRepository.save(person);
//   }
}

