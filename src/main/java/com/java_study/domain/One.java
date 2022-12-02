package com.java_study.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class One {

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    private Member member;

}
