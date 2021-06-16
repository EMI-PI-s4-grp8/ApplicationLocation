**Déploiement  :**

**L’application Principale :**

[**https://fin-tbat.herokuapp.com/**](https://fin-tbat.herokuapp.com/)

**L’application Client de l’architecture Client/Server :**

 [**https://logement-app-front-end.herokuapp.com/**](https://logement-app-front-end.herokuapp.com/)
 
**Instalation :**
 *git clone url
 *from eclipse : import the project as 'existing project maven'
 *create database Mysql location [see .properties]
 *run project to generate tables
 *run those requests : 
 *******************
 create table if not exists persistent_logins ( 
     username varchar(100) not null, 
     series varchar(64) primary key, 
     token varchar(64) not null, 
     last_used timestamp not null
);


delete from  users_roles;


delete from  roles;


delete from  users;



INSERT INTO roles (id, name) VALUES 
(1, 'ROLE_ADMIN'),
(2, 'ROLE_PROPRIETAIRE'),
(3, 'ROLE_USER');


INSERT INTO users (id, email, password, first_name) VALUES 
(1, 'admin@gmail.com', '$2a$10$hKDVYxLefVHV/vtuPhWD3OigtRyOykRLDdUAp80Z1crSoS1lFqaFS', 'Admin'),
(3, 'user@gmail.com', '$2a$10$ByIUiNaRfBKSV6urZoBBxe4UbJ/sS6u1ZaPORHF9AtNWAuVPVz1by', 'User');

insert into users_roles(user_id, role_id) values
(1,1),
(1,2),
(1,3),
(3,2);
  *******************
*relunch the project 
*Voilaaa !
 
![1](https://user-images.githubusercontent.com/59047199/121256324-54ede280-c8a4-11eb-99cd-8021058b23b6.png)
![2](https://user-images.githubusercontent.com/59047199/121256351-5e774a80-c8a4-11eb-92c3-775b7194279e.png)
![3](https://user-images.githubusercontent.com/59047199/121256380-659e5880-c8a4-11eb-979d-b99f3208cf9a.png)
![4](https://user-images.githubusercontent.com/59047199/121256393-6a630c80-c8a4-11eb-8e43-2bdfdc9f77e2.png)
![5](https://user-images.githubusercontent.com/59047199/121256408-6f27c080-c8a4-11eb-93c2-bb03dc44477b.png)
