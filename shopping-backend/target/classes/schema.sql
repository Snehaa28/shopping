create table product (
       id bigint not null,
        billing_address varchar(255),
        category varchar(255),
        description varchar(255),
        image_file blob,
        name varchar(255),
        quantity integer,
        seller_id varchar(255),
        seller_name varchar(255),
        tc integer,
        unit_price varchar(255),
        primary key (id)
);

create table user (
    id bigint not null,
    address varchar(255),
    alt_phone bigint,
    country varchar(255),
    customer_name varchar(255),
    email varchar(255),
    password varchar(255),
    phone bigint,
    state varchar(255),
    user_name varchar(255),
    zip_code varchar(255),
    primary key (id)
);

CREATE SEQUENCE IF NOT EXISTS USER_SEQ START WITH 50 INCREMENT BY 1;
CREATE SEQUENCE IF NOT EXISTS PRODUCT_SEQ START WITH 1 INCREMENT BY 1;