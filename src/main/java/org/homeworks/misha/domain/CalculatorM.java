package org.homeworks.misha.domain;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
public class CalculatorM {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String valueOne;
    String valueTwo;
    String sign;
}
