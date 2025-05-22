package desafio.itau.springboot.controller;

import desafio.itau.springboot.domain.Transaction;
import desafio.itau.springboot.dto.TransactionDto;
import desafio.itau.springboot.service.TransactionService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.OffsetDateTime;

@RestController
@RequestMapping("/transacao")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping
    public ResponseEntity<Void> createTransaction(@Valid @RequestBody TransactionDto data) {
        if (data.getDataHora().isAfter(OffsetDateTime.now()) || data.getValor() < 0 ) {
            return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).build();
        }
        transactionService.addTransaction(new Transaction(data.getDataHora(), data.getValor()));
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping
    public ResponseEntity<Void> clearTransactions() {
        transactionService.clearTransactions();
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
