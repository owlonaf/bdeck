package com.imukov.bdeck.vo;

import com.imukov.bdeck.domain.PersonEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonVo {
//    private UUID id;
//    private String name;
    private String username;
    private String password;

    public PersonVo(PersonEntity person){
//        this.id = person.getId();
//        this.name = person.getName();
        this.username = person.getUsername();
        this.password = person.getPassword();
    }
}
