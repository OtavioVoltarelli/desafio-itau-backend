package desafio.itau.springboot.service;

import desafio.itau.springboot.domain.Transaction;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;

@Service
public class TransactionService {

    List<Transaction> transactions = new ArrayList<>();

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public void clearTransactions() {
        transactions.clear();
    }

    public DoubleSummaryStatistics getStatistics() {
        OffsetDateTime initialTime = OffsetDateTime.now().minusSeconds(60);
        return transactions.stream()
                .filter(t ->
                        t.getDataHora().isAfter(initialTime) || t.getDataHora().equals(initialTime))
                .mapToDouble(Transaction::getValor)
                .summaryStatistics();

    }



}
