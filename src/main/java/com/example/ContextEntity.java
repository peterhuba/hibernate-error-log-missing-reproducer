package com.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "fraud_context")
@NoArgsConstructor
@Getter
public class ContextEntity {

    @Id
    @Column(name = "context_id")
    @GeneratedValue
    private long contextId;

    @Column(name = "other_id")
    private String otherId;
}
