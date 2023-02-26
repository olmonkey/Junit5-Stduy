package com.study.junit5study;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
public class Sample {
    @Id
    @GeneratedValue
    private Long id;

    private Integer number;

    private String nation;
}
