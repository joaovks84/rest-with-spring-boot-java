package br.com.erudio.controller;

import br.com.erudio.PersonService;
import br.com.erudio.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
}

