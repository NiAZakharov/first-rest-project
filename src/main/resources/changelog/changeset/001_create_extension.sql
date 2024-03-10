--liquibase formatted sql
--changeset alex:create-extension

CREATE EXTENSION IF NOT EXISTS "uuid-ossp";
