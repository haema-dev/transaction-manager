CREATE TABLE product (
     id BIGINT PRIMARY KEY,
     name VARCHAR(255)
);

CREATE TABLE orders (
    id BIGINT PRIMARY KEY,
    product_id BIGINT,
    quantity INT,

);