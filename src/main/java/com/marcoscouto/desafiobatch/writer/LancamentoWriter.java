package com.marcoscouto.desafiobatch.writer;

import com.marcoscouto.desafiobatch.data.Lancamento;
import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class LancamentoWriter {

    @Bean
    private ItemWriter<Lancamento> imprimeWriter() {
        return lancamentos -> lancamentos.stream().forEach(System.out::println);
    }

}
