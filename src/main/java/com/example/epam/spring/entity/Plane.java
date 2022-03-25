package com.example.epam.spring.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Plane {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column
    private String name;
    @Column
    private Integer places;
    @Column
    private LocalDate depart;
    @Column
    private String from;
    @Column
    private String to;
    @Column
    private List<Ticket> tickets;
    @Column
    private boolean isDeleted;

}
