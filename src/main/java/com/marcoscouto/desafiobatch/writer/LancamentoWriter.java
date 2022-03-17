package com.marcoscouto.desafiobatch.writer;

import com.marcoscouto.desafiobatch.data.LancamentoEntity;
import com.marcoscouto.desafiobatch.repository.LancamentoRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class LancamentoWriter {

    private final LancamentoRepository repository;

    public LancamentoWriter(LancamentoRepository repository) {
        this.repository = repository;
    }

    @Bean
    private ItemWriter<LancamentoEntity> imprimeWriter() {
        return lancamentos -> lancamentos.stream().forEach(repository::save);
    }

}
