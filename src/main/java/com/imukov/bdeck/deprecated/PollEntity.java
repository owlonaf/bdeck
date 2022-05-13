package com.imukov.bdeck.deprecated;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "poll")
public class PollEntity {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "id")
    private UUID id;
    @Column(name = "first_var")
    private Boolean firstVar;
    @Column(name = "second_var")
    private Boolean secondVar;
    @Column(name = "third_var")
    private Boolean thirdVar;
    @Column(name = "fourth_var")
    private Boolean fourthVar;

    public PollEntity(Boolean firstVar, Boolean secondVar, Boolean thirdVar, Boolean fourthVar) {
        this.firstVar = firstVar;
        this.secondVar = secondVar;
        this.thirdVar = thirdVar;
        this.fourthVar = fourthVar;
    }
}
