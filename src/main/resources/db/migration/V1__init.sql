create table students (
    id          bigserial primary key,
    name        varchar(255) not null,
    age         int not null
);

insert into students (name, age) values
('Ivan', 19),
('Bob', 21),
('John', 23),
('Egor', 18),
('Kate', 18),
('Anna', 19),
('Patric', 25),
('Jane', 20),
('Joseph', 20),
('Tamara', 23),
('Amber', 17),
('Tom', 18),
('Jerry', 18),
('Jack', 22);
