package org.cnam.architecturecnam.service;

import org.cnam.architecturecnam.domain.Transac;
import org.cnam.architecturecnam.dto.NewTransacDto;
import org.cnam.architecturecnam.dto.TransacDto;
import org.cnam.architecturecnam.model.TransacModel;
import org.cnam.architecturecnam.repository.TransacRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

@Service
public class TransacService {
    @Autowired
    TransacRepository transacRepository;

    @Value("${application.transaction.url}")
    private String clientApplication;

    @Value("${application.transaction.features.create}")
    private String createNewClientPath;

    public Transac createNewTransac(String data){
        TransacModel transacModel = new TransacModel(data);
        TransacModel transacModelSaved = transacRepository.save(transacModel);
        return new Transac(transacModelSaved.getId(),transacModelSaved.getData());

    }

    public Transac getTransac(long id) {
        TransacModel transacModelFound = transacRepository.getOne(id);
        return new Transac(transacModelFound.getId(),transacModelFound.getData());
    }

    public String createNewTransacExternal(String data){
        RestTemplate restTemplate = new RestTemplate();
        NewTransacDto myRequest = new NewTransacDto(data);

        TransacDto myResponse = restTemplate.postForObject(clientApplication+ createNewClientPath, myRequest, TransacDto.class);
        LOGGER.info(myResponse.toString());
        return myResponse.data;
    }
}
