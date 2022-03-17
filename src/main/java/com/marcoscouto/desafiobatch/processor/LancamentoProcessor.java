package com.marcoscouto.desafiobatch.processor;

import com.marcoscouto.desafiobatch.data.LancamentoDTO;
import com.marcoscouto.desafiobatch.data.LancamentoEntity;
import org.springframework.batch.item.function.FunctionItemProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class LancamentoProcessor {

    @Bean
    public FunctionItemProcessor<LancamentoDTO, LancamentoEntity> parOuImparProcessor(){
        return new FunctionItemProcessor<LancamentoDTO, LancamentoEntity>(LancamentoDTO::toEntity);
    }

}
