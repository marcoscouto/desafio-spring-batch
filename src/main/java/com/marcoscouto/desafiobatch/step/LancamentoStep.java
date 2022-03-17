package com.marcoscouto.desafiobatch.step;

import com.marcoscouto.desafiobatch.data.LancamentoDTO;
import com.marcoscouto.desafiobatch.data.LancamentoEntity;
import com.marcoscouto.desafiobatch.reader.LancamentoReader;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.function.FunctionItemProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class LancamentoStep {

    private final StepBuilderFactory stepBuilderFactory;
    private final FlatFileItemReader reader;
    private final ItemWriter writer;
    public final FunctionItemProcessor processor;

    public LancamentoStep(StepBuilderFactory stepBuilderFactory, FlatFileItemReader reader, ItemWriter writer, FunctionItemProcessor processor) {
        this.stepBuilderFactory = stepBuilderFactory;
        this.reader = reader;
        this.writer = writer;
        this.processor = processor;
    }

    @Bean
    public Step executaStep() {
        return stepBuilderFactory
                .get("executaStep")
                .<LancamentoDTO, LancamentoEntity>chunk(1)
                .reader(reader)
                .processor(processor)
                .writer(writer)
                .build();
    }

}
