-- Table: public.usu_usuario

-- DROP TABLE IF EXISTS public.usu_usuario;

CREATE TABLE IF NOT EXISTS public.usu_usuario
(
    usu_nr_id integer NOT NULL,
    usu_dt_cadastro timestamp without time zone NOT NULL,
    usu_tx_login character varying(20) COLLATE pg_catalog."default" NOT NULL,
    usu_tx_nome character varying(100) COLLATE pg_catalog."default" NOT NULL,
    usu_tx_senha text COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT usu_usuario_pkey PRIMARY KEY (usu_nr_id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.usu_usuario
    OWNER to postgres;

-- Table: public.ins_inscricao

-- DROP TABLE IF EXISTS public.ins_inscricao;

CREATE TABLE IF NOT EXISTS public.ins_inscricao
(
    ins_nr_id integer NOT NULL,
    cat_nr_id integer,
    usu_nr_id1 integer,
    usu_nr_id2 integer,
    CONSTRAINT ins_inscricao_pkey PRIMARY KEY (ins_nr_id),
    CONSTRAINT fk6gg205kgp3vvc6yi81o1oo6ro FOREIGN KEY (cat_nr_id)
        REFERENCES public.cat_categoria (cat_nr_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT fk972324mg74scg50gm2fjgjuil FOREIGN KEY (usu_nr_id1)
        REFERENCES public.usu_usuario (usu_nr_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT fkrqa66d9bqo530d76gsnl1nd0u FOREIGN KEY (usu_nr_id2)
        REFERENCES public.usu_usuario (usu_nr_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.ins_inscricao
    OWNER to postgres;

-- Table: public.cat_categoria

-- DROP TABLE IF EXISTS public.cat_categoria;

CREATE TABLE IF NOT EXISTS public.cat_categoria
(
    cat_nr_id integer NOT NULL,
    cat_tx_nome character varying(100) COLLATE pg_catalog."default" NOT NULL,
    torneio_id integer NOT NULL,
    CONSTRAINT cat_categoria_pkey PRIMARY KEY (cat_nr_id),
    CONSTRAINT fkf5h029afq1tmadu8mrus6hh2 FOREIGN KEY (torneio_id)
        REFERENCES public.tor_torneio (tor_nr_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.cat_categoria
    OWNER to postgres;

-- Table: public.tor_torneio

-- DROP TABLE IF EXISTS public.tor_torneio;

CREATE TABLE IF NOT EXISTS public.tor_torneio
(
    tor_nr_id integer NOT NULL,
    tor_tx_nome character varying(100) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT tor_torneio_pkey PRIMARY KEY (tor_nr_id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.tor_torneio
    OWNER to postgres;





