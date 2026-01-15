package com.portsure.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Portfolio {

    @Id
    private String portfolioId;

    private String name;
    private int equities;
    private int bonds;
    private int derivatives;

    private String status;
    private String userId;
}
