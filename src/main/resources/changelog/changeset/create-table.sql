--liquibase formatted sql
--changeset alex:create-extension

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

CREATE SCHEMA public;

ALTER SCHEMA public OWNER TO postgres;

COMMENT ON SCHEMA public IS 'standard public schema';

SET default_tablespace = '';
DROP TABLE IF EXISTS request_status;
CREATE TABLE public.request_status (
                                       id integer NOT NULL,
                                       status character varying(50) NOT NULL
);

ALTER TABLE public.request_status OWNER TO postgres;


CREATE SEQUENCE public.request_status_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

ALTER TABLE public.request_status_id_seq OWNER TO postgres;

ALTER SEQUENCE public.request_status_id_seq OWNED BY public.request_status.id;

ALTER TABLE ONLY public.request_status ALTER COLUMN id SET DEFAULT nextval('public.request_status_id_seq'::regclass);


INSERT INTO public.request_status VALUES (1, 'CREATED');
INSERT INTO public.request_status VALUES (2, 'ACCEPTED');
INSERT INTO public.request_status VALUES (3, 'IN_WORK');
INSERT INTO public.request_status VALUES (4, 'COMPLETED');
INSERT INTO public.request_status VALUES (5, 'CANCELED');
INSERT INTO public.request_status VALUES (6, 'REJECTED');

SELECT pg_catalog.setval('public.request_status_id_seq', 6, true);

ALTER TABLE ONLY public.request_status
    ADD CONSTRAINT request_status_pkey PRIMARY KEY (id);


ALTER TABLE ONLY public.request_status
    ADD CONSTRAINT request_status_status_key UNIQUE (status);



