--liquibase formatted sql
--changeset alex:insert-data-to-users-001
INSERT INTO public.users (username, email)
values ('Alex', 'alex-101@yandex.ru'), ('Olga', 'olga-102@mail.ru');
