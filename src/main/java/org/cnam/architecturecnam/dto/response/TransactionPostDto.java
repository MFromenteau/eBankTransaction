package org.cnam.architecturecnam.dto.response;

import java.math.BigDecimal;
import java.util.UUID;

public class TransactionPostDto {
    private String message;
    private UUID idTransac;
    private UUID idEmetteur;
    private UUID idRecepteur;
    private BigDecimal amount;
    private String type;
    private  UUID idType;
}
