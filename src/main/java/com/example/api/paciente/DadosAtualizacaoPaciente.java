package com.example.api.paciente;

import com.example.api.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoPaciente (
        @NotNull
    Long id,
        String nome,
        String telefone,
        DadosEndereco endereco){
}
