package org.cnam.architecturecnam.service;

import org.cnam.architecturecnam.domain.Sample;
import org.cnam.architecturecnam.model.SampleModel;
import org.cnam.architecturecnam.repository.SampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleService {

    @Autowired
    SampleRepository sampleRepository;

    public Sample createNewSample(String data){
        SampleModel sampleModel = new SampleModel(data);
        SampleModel sampleModelSaved = sampleRepository.save(sampleModel);
        return new Sample(sampleModelSaved.getId(),sampleModelSaved.getData());

    }

    public Sample getSample(long id) {
        SampleModel sampleModelFound = sampleRepository.getOne(id);
        return new Sample(sampleModelFound.getId(),sampleModelFound.getData());
    }
}
