CREATE TABLE IF NOT EXISTS todo (
    id BIGSERIAL PRIMARY KEY,
    message TEXT,
    author VARCHAR(64)
);
