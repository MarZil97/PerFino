package com.gondras.perfino.base.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="transaction_header")
public class TransactionHeader {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "transaction_header_id_seq")
    private Long id;
    private Boolean transactionType;

    @ManyToOne
    @JoinColumn(name="id")
    private Vendors vendor;

    @ManyToOne
    @JoinColumn(name="id")
    private SourceOfIncome sourceOfIncome;

    private Float transactionValue;

    @ManyToOne
    @JoinColumn(name="id")
    private AccountInformation accountInformation;

    @OneToMany(mappedBy = "transactionHeader", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private ArrayList<TransactionLine> transactionLines;

}
