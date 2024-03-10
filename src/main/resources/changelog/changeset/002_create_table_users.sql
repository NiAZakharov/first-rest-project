--liquibase formatted sql
--changeset alex:create-table-users
CREATE TABLE IF NOT EXISTS public.users (
    id uuid PRIMARY KEY DEFAULT uuid_generate_v4(),
    username VARCHAR(50) NOT NULL,
    email VARCHAR(50) UNIQUE NOT NULL
    );
