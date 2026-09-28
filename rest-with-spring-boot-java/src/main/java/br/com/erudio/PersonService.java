package br.com.erudio;

import br.com.erudio.model.Person;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
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
    public List<Person> findAll(){
        List<Person> persons = new ArrayList<Person>();
        for (int i = 0; i < 8; i++){
            Person person = mockPerson(i);
            persons.add(person);
        }
        return persons;
    }
    public Person create(Person person){
        logger.info("Creating a new Person!");
        return person;
    }
    public Person upadate(Person person){
        logger.info("Updating Person!");
        return person;
    }
    public void delete(String id){
        logger.info("Deleting Person!");

    }
    private Person mockPerson(int i){ // pessoa generica, somente para teste
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFistName("FirstName: " + i);
        person.setLastName("LastName: " + i);
        person.setAddress("Some in Brazil: " + i);
        person.setGender("M");
        return person;
    }
}
