package RelationalMapping.oneToOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    PersonService personService;
    @PostMapping("/")
    public ResponseEntity<String>createPersonWithPassword(@RequestBody Person person){

        personService.savePersonWithPassport(person);
        return ResponseEntity.ok("Person with Passport saved successfully.");
    }
}
