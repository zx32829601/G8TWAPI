package com.example.demo.Entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "ConditionTable")
public class Condition {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @CreationTimestamp//Use Create time
    @Column(name = "time_stamp")
    @Nullable
    private Timestamp time_stamp;


    @Column(name = "heartrhythm")
    private int heartrhythm;

    @Column(name = "bloody_oxy")
    private float bloody_oxy;
    @Column(name = "longgps")
    private double longgps;
    @Column(name = "latigps")
    private double latigps;

    @Column(name = "state")
    private String state;

    @OneToOne
    @JoinColumn(name = "Elder")
    private Elder elder;


    Condition(int hr, float bo, double lng, double lat, String st) {
        this.heartrhythm = hr;
        this.bloody_oxy = bo;
        this.longgps = lng;
        this.latigps = lat;
        this.state = st;
    }


}
