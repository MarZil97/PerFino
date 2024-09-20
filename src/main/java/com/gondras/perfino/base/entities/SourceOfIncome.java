package com.gondras.perfino.base.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="source_of_income")
public class SourceOfIncome {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "source_of_income_id_seq")
    private Long id;
    private String soiName;
    private String description;
}
