CREATE TABLE post_table (
    id SERIAL,
    title VARCHAR(100) UNIQUE NOT NULL,
    link_github VARCHAR(200) NOT NULL,
    views int,
    created_at TIMESTAMP WITH TIME ZONE,
    user_id bigint,
    FOREIGN KEY (user_id) REFERENCES user_table(id),
    PRIMARY KEY(id)
);