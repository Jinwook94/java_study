package com.java_study.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Many {
    // 테스트

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Member member;

}
