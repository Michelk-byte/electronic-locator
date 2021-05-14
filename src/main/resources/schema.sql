Drop table if exists items;

Create Table items(
    id SERIAL ,
    name varchar(50),
    type Varchar(50),
    price varchar(70),
    description varchar (1000),
    img varchar(200), PRIMARY KEY (id)
);



Create TABLE IF NOT EXISTS clients(
    idC SERIAL,
    email VARCHAR(1000),
    password varchar(50),
    firstN VARCHAR(50),
    lastN VARCHAR(50),
    primary key (idC)
);


drop table  if exists cart;
CREATE TABLE  cart(
    id SERIAL,
    idC BIGINT,
    idI BIGINT,
    img varchar(50),
    name varchar(100),
    price BIGINT,
    qty BIGINT,
    primary key (id)
);

CREATE TABLE IF NOT EXISTS purchased(
            id SERIAL,
            idC BIGINT,
            idI BIGINT,
            img varchar(50),
            name varchar(100),
            price BIGINT,
            qty BIGINT,
            primary key (id)
);

Create TABLE if not exists isLogged(
    id SERIAL,
    idC      BIGINT,
    email    VARCHAR(1000),
    password varchar(50),
    firstN   VARCHAR(50),
    lastN    VARCHAR(50),
    primary key (id)
);

Create TABLE IF NOT EXISTS feedback(
    id SERIAL,
    idC BIGINT,
    fname varchar(100),
    lname varchar(100),
    email varchar(1000),
    num varchar(50),
    feedback varchar(2000),
    primary key (id)
);
