delete from category;
delete from city;
delete from restaurant;
delete from level_price;
delete from user;
INSERT INTO category(id,name) VALUES(1000,'Comida rápida');
INSERT INTO category(id,name) VALUES(1001,'Desayuno');
INSERT INTO category(id,name) VALUES(1002,'Almuerzo');
INSERT INTO category(id,name) VALUES(1003,'Cena');

INSERT INTO city(id,name) VALUES(1001,'Santa Cruz');
INSERT INTO city(id,name) VALUES(1002,'La Paz');
INSERT INTO city(id,name) VALUES(1000,'Cochabamba');

INSERT INTO level_price(id,descripcion) VALUES(1000,'Lujo');
INSERT INTO level_price(id,descripcion) VALUES(1001,'Economico');
INSERT INTO level_price(id,descripcion) VALUES(1002,'Moderado');


INSERT INTO user(id,username,lastname,firstname,city_id,role,password,password_confirm) VALUES(1000,'admin','admin','admin',1000,'ADMIN','$2a$10$AaYF3ZXtGphYmdr47HFy4.w9BCee4YHymOK2hHnV5h14B5T1aUi9C','123');




INSERT INTO restaurant(id,direction,name,phone,score,category_id,city_id,level_price_id) VALUES(1000,'San Martin','Chicken Kingdom',4232312,0,1000,1000,1001);
INSERT INTO restaurant(id,direction,name,phone,score,category_id,city_id,level_price_id) VALUES(1001,'Prado','Burger King',4452219,0,1000,1000,1002);

