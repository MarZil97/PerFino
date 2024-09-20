package com.gondras.perfino.base.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="vendors")
public class Vendors {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "vendors_id_seq")
    private Long id;
    private String vendorName;
    private String description;
}
