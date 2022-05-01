package com.imukov.bdeck.vo;

import com.imukov.bdeck.domain.PersonEntity;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
public class PersonVo {
    private UUID id;
    private String name;
    private String nickname;
    private String password;

    public PersonVo(PersonEntity person){
        this.id = person.getId();
        this.name = person.getName();
        this.nickname = person.getNickname();
        this.password = person.getPassword();
    }
}
