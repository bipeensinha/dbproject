package com.example.demo.model;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Transaction {
        @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
                private Long id;
                    private BigDecimal amount;
                        private LocalDate date;
                            private String type;

                                // Getters and setters
                                }

