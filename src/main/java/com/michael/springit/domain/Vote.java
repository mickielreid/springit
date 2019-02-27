package com.michael.springit.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Vote {
    @Id
    @GeneratedValue
    private int id;
    private int vote;

    //user
    //link


}
