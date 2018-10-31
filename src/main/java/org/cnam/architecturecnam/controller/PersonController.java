package org.cnam.architecturecnam.controller;

import org.cnam.architecturecnam.domain.Person;
import org.cnam.architecturecnam.dto.SavePersonRequest;
import org.cnam.architecturecnam.dto.SavePersonResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/person")
public class PersonController {

 //   @PostMapping()
//    public List<SavePersonResponse> savePerson (final SavePersonRequest){
//        final Person person = new Person(savePersonRequest.name);
//        final List<Person> personList = personService.savePerson(person);

//        return personList.stream()
//                .map(it -> new SavePersonResponse(it.name))
//                .collect(Collectors.toList());
//    }
}
