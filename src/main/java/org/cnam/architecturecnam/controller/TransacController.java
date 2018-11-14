package org.cnam.architecturecnam.controller;

import org.cnam.architecturecnam.domain.Transac;
import org.cnam.architecturecnam.dto.request.TransactionGetDto;
import org.cnam.architecturecnam.dto.response.TransactionPostDto;
import org.cnam.architecturecnam.service.TransacService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/transac/")
public class TransacController {

    @Autowired
    private TransacService transacService;

}
