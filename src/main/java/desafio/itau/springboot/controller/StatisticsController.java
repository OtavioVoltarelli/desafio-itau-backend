package desafio.itau.springboot.controller;

import desafio.itau.springboot.dto.StatisticsDto;
import desafio.itau.springboot.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/estatistica")
public class StatisticsController {

    @Autowired
    TransactionService transactionService;

    @GetMapping
    public ResponseEntity<StatisticsDto> getStatistics() {
        StatisticsDto statisticsDto = new StatisticsDto(transactionService.getStatistics());
        return ResponseEntity.status(HttpStatus.OK).body(statisticsDto);
    }
}
