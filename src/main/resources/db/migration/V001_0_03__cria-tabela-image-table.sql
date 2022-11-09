CREATE TABLE image_table (
    id SERIAL,
    name_image VARCHAR(100) NOT NULL,
    link_image VARCHAR(400) NOT NULL,
    user_id bigint,
    post_id bigint,
    FOREIGN KEY (user_id) REFERENCES user_table(id),
    FOREIGN KEY (post_id) REFERENCES post_table(id),
    PRIMARY KEY(id)
);