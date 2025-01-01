create table Ingredient (
    id varchar(4) not null primary key,
    name varchar(25) not null,
    type varchar(10) not null
);

create table Shaurma_Order (
    id serial primary key,
    delivery_Name varchar(50) not null,
    delivery_Street varchar(50) not null,
    delivery_City varchar(50) not null,
    delivery_State varchar(2) not null,
    delivery_Zip varchar(10) not null,
    cc_number varchar(16) not null,
    cc_expiration varchar(5) not null,
    cc_cvv varchar(3) not null,
    placed_at timestamp not null
);

create table Shaurma (
    id serial primary key,
    name varchar(50) not null,
    shava_order bigint not null,
    shava_order_key bigint not null,
    created_at timestamp not null
);

create table Ingredient_Ref (
    ingredient varchar(4) not null,
    shava bigint not null,
    shava_key bigint not null
);

-- Добавление внешних ключей после создания всех таблиц
alter table Shaurma
 add foreign key (shava_order) references Shaurma_Order(id);

alter table Ingredient_Ref
 add foreign key (ingredient) references Ingredient(id);
