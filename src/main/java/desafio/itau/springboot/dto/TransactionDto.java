package desafio.itau.springboot.dto;

import jakarta.validation.constraints.NotNull;

import java.time.OffsetDateTime;

public class TransactionDto {

    @NotNull
    private @NotNull Double valor;

    @NotNull
    private @NotNull OffsetDateTime dataHora;

    public TransactionDto(@NotNull Double valor, @NotNull OffsetDateTime dataHora) {
        this.valor = valor;
        this.dataHora = dataHora;
    }

    public @NotNull @NotNull OffsetDateTime getDataHora() {
        return dataHora;
    }

    public @NotNull @NotNull Double getValor() {
        return valor;
    }
}
