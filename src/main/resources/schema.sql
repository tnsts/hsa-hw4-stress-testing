CREATE TABLE IF NOT EXISTS record
(
    id         SERIAL,
    value      VARCHAR(64) NOT NULL,
    created_at TIMESTAMP   NOT NULL DEFAULT now(),
    PRIMARY KEY (id)
);