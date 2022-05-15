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
@Table(name = "Guardian")
public class Guardian {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "Telephonenumber")
    private String Telephonenumber;

    @OneToOne
    @JoinColumn(name = "Elderid", referencedColumnName = "id")
    private Elder elder;

}
