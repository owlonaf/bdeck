package com.imukov.bdeck.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "social_table")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SocialEntity {
    @Id
    @Column(name = "user")
    private String user;
    @Column(name = "vk")
    private String vk;
    @Column(name = "inst")
    private String inst;
    @Column(name = "tg")
    private String tg;
    @Column(name = "yt")
    private String yt;
}
