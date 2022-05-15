package com.example.demo.Entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Blob;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Electrocardiography {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "graph")
    private Blob graph;

    @OneToOne
    @JoinColumn(name = "elder")
    private Elder elder;

}
