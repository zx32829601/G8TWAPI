package Entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Builder
@AllArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "Condition")
public class Condition {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @CreationTimestamp//Use Create time
    @Column(name = "time_stamp")
    private Timestamp time_stamp;

    @Column(name = "Heartrhythm")
    private int Heartrhythm;
    @Column(name = "Bloody_oxy")
    private float Bloody_oxy;
    @Column(name = "longgps")
    private double longgps;
    @Column(name = "latigps")
    private double latigps;
    @Column(name = "state")
    private String state;

    Condition() {

    }

    Condition(int hr, float bo, double lng, double lat, String st) {
        this.Heartrhythm = hr;
        this.Bloody_oxy = bo;
        this.longgps = lng;
        this.latigps = lat;


    }


}
