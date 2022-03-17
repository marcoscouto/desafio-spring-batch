--liquibase formatted sql

--changeset mcouto:create_table_lancamento
CREATE TABLE spring_batch.lancamento (
    id SERIAL PRIMARY KEY,
	codigo_natureza_despesa INT,
	descricao_natureza_despesa TEXT,
	descricao_lancamento TEXT,
	data_lancamento DATE,
	valor_lancamento DOUBLE
);
--rollback drop table lancamento;