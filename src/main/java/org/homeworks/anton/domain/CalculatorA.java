package org.homeworks.anton.domain;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
public class CalculatorA {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "calc_id")
    int id;
   String valueOne;
    String valueTwo;
    String sign;
}
