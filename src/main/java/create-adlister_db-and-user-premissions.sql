CREATE DATABASE adlister_db;

CREATE USER 'john'@'localhost' IDENTIFIED BY 'password';

GRANT ALL ON adlister_db.* TO 'john'@'localhost';