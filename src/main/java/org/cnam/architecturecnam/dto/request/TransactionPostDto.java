package org.cnam.architecturecnam.dto.request;

import java.math.BigDecimal;
import java.util.UUID;

public class TransactionPostDto {
    private UUID idEmetteur;
    private UUID idRecepteur;
    private BigDecimal amount;
    private String type;
    private UUID idType;
}
