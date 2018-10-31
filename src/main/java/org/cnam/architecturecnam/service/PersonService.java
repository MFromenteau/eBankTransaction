package org.cnam.architecturecnam.service;

import org.cnam.architecturecnam.domain.Person;
import org.cnam.architecturecnam.model.PersonModel;
import org.cnam.architecturecnam.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public List<Person> savePerson(final Person person){
        final PersonModel personModel = new PersonModel();
        personModel.setName(person.name);

        personRepository.save(personModel);
        final List<PersonModel> personModelList = personRepository.findAll();

        return personModelList.stream()
                .map(it -> new Person(it.getName()))
                .collect(Collectors.toList());
    }
}
