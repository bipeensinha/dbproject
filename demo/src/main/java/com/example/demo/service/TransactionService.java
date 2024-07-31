package com.example.demo.service;
import com.example.demo.model.Transaction;
import com.example.demo.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TransactionService {
    @Autowired    
    private TransactionRepository transactionRepository;
    
        public List<Transaction> getAllTransactions() 
        {
                    return transactionRepository.findAll();
                    }

                        public Transaction saveTransaction(Transaction transaction)
                         {
                                    return transactionRepository.save(transaction);
                                        }
                                   

                                    }       
      