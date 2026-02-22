CREATE TABLE USERS
(
    id bigint NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name varchar(255) NOT NULL,
    email varchar(255) NOT NULL,
    password varchar(255) NOT NULL
);

CREATE TABLE ADDRESSES
(
    id     bigint auto_increment primary key,
    street varchar(255) not null,
    city   varchar(255) not null,
    zip    varchar(255) not null,
    user_id bigint       not null,
    CONSTRAINT addresses_users_fk FOREIGN KEY (user_id) REFERENCES USERS (id)
);
