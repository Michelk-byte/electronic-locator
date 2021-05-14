Drop table if exists items;

Create Table items(
    id SERIAL ,
    name varchar(50),
    type Varchar(50),
    price varchar(70),
    description varchar (1000),
    img varchar(200), PRIMARY KEY (id)
);


