package com.marcoscouto.desafiobatch.step;

import com.marcoscouto.desafiobatch.reader.LancamentoReader;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class LancamentoStep {

    private final StepBuilderFactory stepBuilderFactory;
    private final FlatFileItemReader reader;
    private final ItemWriter writer;

    public LancamentoStep(StepBuilderFactory stepBuilderFactory, FlatFileItemReader reader, ItemWriter writer) {
        this.stepBuilderFactory = stepBuilderFactory;
        this.reader = reader;
        this.writer = writer;
    }

    @Bean
    public Step executaStep() {
        return stepBuilderFactory
                .get("executaStep")
                .chunk(1)
                .reader(reader)
//                .processor(parOuImparProcessor())
                .writer(writer)
                .build();
    }

}
