package org.cnam.architecturecnam.service;

import org.cnam.architecturecnam.domain.Sample;
import org.cnam.architecturecnam.dto.NewSampleDto;
import org.cnam.architecturecnam.dto.SampleDto;
import org.cnam.architecturecnam.model.SampleModel;
import org.cnam.architecturecnam.repository.SampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

@Service
public class SampleService {
    @Autowired
    SampleRepository sampleRepository;

    @Value("${application.transaction.url}")
    private String clientApplication;

    @Value("${application.transaction.features.create}")
    private String createNewClientPath;

    public Sample createNewSample(String data){
        SampleModel sampleModel = new SampleModel(data);
        SampleModel sampleModelSaved = sampleRepository.save(sampleModel);
        return new Sample(sampleModelSaved.getId(),sampleModelSaved.getData());

    }

    public Sample getSample(long id) {
        SampleModel sampleModelFound = sampleRepository.getOne(id);
        return new Sample(sampleModelFound.getId(),sampleModelFound.getData());
    }

    public String createNewSampleExternal(String data){
        RestTemplate restTemplate = new RestTemplate();
        NewSampleDto myRequest = new NewSampleDto(data);

        SampleDto myResponse = restTemplate.postForObject(clientApplication+ createNewClientPath, myRequest, SampleDto.class);
        LOGGER.info(myResponse.toString());
        return myResponse.data;
    }
}
