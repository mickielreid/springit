package com.michael.springit.domain;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
@Entity
//this class will be a table
@NoArgsConstructor // consturctor
@Data  // getter setter

public class Link extends Auditable{
    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    private String title;
    @NonNull
    private String url;


    //comments
    @OneToMany(mappedBy =  "link")
    private List<Comment> comment = new ArrayList<>();
}
