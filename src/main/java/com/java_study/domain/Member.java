package com.java_study.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@Getter
@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Java primitive types, String, Java serializable types, enums
    private Long age;
    private String name;
    private Date date;
    private Calendar calendar;
    private LocalDateTime localDateTime;
    private Types types;  // enums

    // embeddable classes
    @Embedded
    private Address address;

    // entity types
    @OneToOne
    private One one;

    @ManyToOne
    private Team team;

    // collections of basic and embeddable types, enums
    @ElementCollection
    private List<Long> longList = new ArrayList<>();

    @ElementCollection
    private List<String> stringList = new ArrayList<>();

    @ElementCollection
    private List<Address> embeddableList = new ArrayList<>();

    @ElementCollection
    private List<Types> enumsList = new ArrayList<>();

    // collections of entity types
    @OneToMany
    private List<Team> teamList = new ArrayList<>();

}
