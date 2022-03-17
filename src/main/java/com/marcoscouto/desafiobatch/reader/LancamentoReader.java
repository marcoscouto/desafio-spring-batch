package com.marcoscouto.desafiobatch.reader;

import com.marcoscouto.desafiobatch.data.Lancamento;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

@Configuration
public class LancamentoReader {

    @Bean
    @StepScope
    public FlatFileItemReader<Lancamento> leituraDeArquivoDeLancamento(
            @Value("#{jobParameters['arquivosLancamentos']}") Resource resource) {
        return new FlatFileItemReaderBuilder<Lancamento>()
                .name("leituraDeArquivoDeLancamento")
                .resource(resource)
                .delimited()
                .names("codigoNaturezaDespesa", "descricaoNaturezaDespesa", "descricaoLancamento", "dataLancamento", "valorLancamento")
                .targetType(Lancamento.class)
                .build();
    }

}
