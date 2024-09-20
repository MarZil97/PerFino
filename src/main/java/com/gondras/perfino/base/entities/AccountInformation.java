package com.gondras.perfino.base.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="account_information")
public class AccountInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "account_info_id_seq")
    private Long id;
    private String accountName;
    private String accountNumber;
    private Float ballance;
}
