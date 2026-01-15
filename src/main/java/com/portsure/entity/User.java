package com.portsure.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
public class User {

    @Id
    private String id;

    private String name;
    private String email;
    private String password;
    private String mobile;

    private String role;
}
