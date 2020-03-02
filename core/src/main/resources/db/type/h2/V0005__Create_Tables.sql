CREATE TABLE STAFFMEMBER(
    id BIGINT NOT NULL,
    modificationCounter INTEGER NOT NULL,
    name VARCHAR(255),
    firstname VARCHAR(255),
    lastname VARCHAR(255)
   
);

insert into staffmember(id, modificationCounter, firstname, lastname, name)
values(1, 1, 'admin', 'admin', 'admin');