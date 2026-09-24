package br.com.erudio;

import br.com.erudio.model.Person;
import org.springframework.stereotype.Service;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service // addd para que seja possivel injetar, para que disponivel.
public class PersonService {

    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonService.class.getName()); // utilizei o Logger para que o codigo pudesse informar logs para a classe getName.

    public Person findById(String id){
        logger.info("Finding one Person!");

        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFistName("Joao");
        person.setLastName("Rodrigo");
        person.setAddress("Uberlandia");
        person.setGender("M");
        return person;
    }
}
