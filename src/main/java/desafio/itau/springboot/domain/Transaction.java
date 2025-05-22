package desafio.itau.springboot.domain;

import java.time.OffsetDateTime;


public class Transaction {

    private Double valor;

    private OffsetDateTime dataHora;

    public Transaction(OffsetDateTime dataHora, Double valor) {
        this.dataHora = dataHora;
        this.valor = valor;
    }

    public OffsetDateTime getDataHora() {
        return dataHora;
    }

    public Double getValor() {
        return valor;
    }
}
