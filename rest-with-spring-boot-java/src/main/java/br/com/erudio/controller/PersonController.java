package br.com.erudio.controller;

import br.com.erudio.PersonService;
import br.com.erudio.model.Person;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController//Para a api entende que isso é um restcontroller
@RequestMapping("/person")
public class PersonController {

    @Autowired // Serve para injetar a instancia. Somente com o @Service
    private PersonService service;
    // private PersonService personService = new PersonService() * Se eunao utilizasse o @SErvice em person Service
    @RequestMapping(value = "/{id}" ,
        method = RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Person findById(@PathVariable("id") String id) {
        return service.findById(id);
    }
    @RequestMapping(
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public List<Person> findAll() {//add lista basica
        return service.findAll();
    }
    @RequestMapping(
            method = RequestMethod.POST, // Tipo
            consumes = MediaType.APPLICATION_JSON_VALUE, // consumindo JSON
            produces = MediaType.APPLICATION_JSON_VALUE // produzindo JSON
    )
    public Person create(@RequestBody Person person) {
        return service.create(person);
    }
    @RequestMapping(
            method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Person update(@RequestBody Person person) {
        return service.upadate(person);
    }
    @RequestMapping( value = "/{id}",
            method = RequestMethod.DELETE
    )
    public void delete(@PathParam("id") String id){
        service.delete(id);
    }
}

