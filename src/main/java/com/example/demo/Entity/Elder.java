package com.example.demo.Entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "Elder")
public class Elder {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "age")
    private int age;

    @Column(name = "name")
    private String name;

    @Column(name = "precondition")
    private String precondition;

    @OneToOne
    @JoinColumn(name = "Guardian")
    private Guardian guardian;


}
