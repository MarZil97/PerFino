package com.gondras.perfino.base.entities;

import com.gondras.perfino.base.entities.domain.TypeOfExpense;
import com.gondras.perfino.base.entities.domain.TypeOfIncome;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="transaction_line")
public class TransactionLine {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "transaction_line_id_seq")
    private Long id;

    private String transactionDescription;
    private TypeOfExpense typeOfExpense;
    private TypeOfIncome typeOfIncome;
    private Float lineValue;

    @ManyToOne
    @JoinColumn(name="id")
    private TransactionHeader transactionHeader;
}
