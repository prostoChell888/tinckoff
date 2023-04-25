CREATE TABLE chat
(
    chat_id    BIGINT GENERATED ALWAYS AS IDENTITY NOT NULL,
    tg_chat_id BIGINT                           NOT NULL UNIQUE,


    CONSTRAINT PK_chat_chat_id PRIMARY KEY (chat_id)
);

