package com.example.demoorc.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "LENDBIZ")
@ToString

public class Cache {
    @Id
    @Column(name = "ID")
    private Long ID;
    @Column(name = "NAME")
    private String name;
}
