package org.cnam.architecturecnam.controller;

import org.cnam.architecturecnam.domain.Sample;
import org.cnam.architecturecnam.dto.NewSampleDto;
import org.cnam.architecturecnam.dto.SampleDto;
import org.cnam.architecturecnam.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/sample/")
public class SampleController {

    @Autowired
    private SampleService sampleService;

    @PostMapping("/create")
    @ResponseBody
    public SampleDto createNewSample(@RequestBody NewSampleDto newSampleDto){
        Sample sample = sampleService.createNewSample(newSampleDto.getData());


        return new SampleDto(sample.getId(),newSampleDto.getData());
    }

    @GetMapping("/get/{id}")
    @ResponseBody
    public SampleDto getSample(@PathVariable long id){
        Sample sample = sampleService.getSample(id);

        return new SampleDto(id,sample.getData());
    }
}
