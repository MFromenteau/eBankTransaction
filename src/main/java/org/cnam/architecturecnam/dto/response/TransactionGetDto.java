package org.cnam.architecturecnam.dto.response;

import org.cnam.architecturecnam.domain.Transac;

import java.util.List;
import java.util.UUID;

public class TransactionGetDto {
    private UUID idCompte;
    private List<Transac> allTransac;
}
