--drop databse fotonetdb;

CREATE DATABASE fotonetdb;
USE fotonetdb;

CREATE TABLE user (
    id INT NOT NULL AUTO_INCREMENT ,
    version INT NULL ,
    user_name varchar(255) NOT NULL ,
    subscription_id DOUBLE NOT NULL ,
    PRIMARY KEY (id)
);


CREATE TABLE photo (
    id int NOT NULL AUTO_INCREMENT ,
    path varchar(255) ,
    photo_name varchar(255) NOT NULL ,
    uploader_id int NOT NULL ,
    created_on datetime NOT NULL ,
	modified_on datetime NULL ,
	version int ,
    PRIMARY KEY (id)
);


CREATE  TABLE album (
  id INT NOT NULL AUTO_INCREMENT ,
  album_name varchar(255) NOT NULL ,
  uploader_id INT NOT NULL ,
  created_on DATETIME NOT NULL ,
  modified_on DATETIME NULL ,
  version INT NULL ,
  PRIMARY KEY (id) 
 );
 
 CREATE TABLE media_settings (
    id int NOT NULL AUTO_INCREMENT ,
    album_id int NOT NULL ,
    photo_id int NOT NULL ,
    settings varchar(255) ,
	version int ,
    PRIMARY KEY (id)
);


CREATE TABLE tag (
    id INT NOT NULL AUTO_INCREMENT ,
    version INT NULL ,
    PRIMARY KEY (id)
);

CREATE TABLE comment (
    id INT NOT NULL AUTO_INCREMENT ,
    version INT NULL ,
    comment varchar(255) ,
    PRIMARY KEY (id)
);

ALTER TABLE photo ADD CONSTRAINT FK_photo_user FOREIGN    KEY (uploader_id)  REFERENCES user(id);      
ALTER TABLE album ADD CONSTRAINT FK_album_user FOREIGN    KEY (uploader_id)  REFERENCES user(id);
ALTER TABLE media_settings ADD CONSTRAINT FK_media_settings_photo FOREIGN    KEY (photo_id)  REFERENCES photo(id);
ALTER TABLE media_settings ADD CONSTRAINT FK_media_settings_album FOREIGN    KEY (album_id)  REFERENCES album(id);

insert into user (user_name, subscription_id, version) values('shalini',111, 1);
insert into photo (version, path, photo_name, uploader_id, created_on) values(1, 'abc/def','sg.jpg', '1', '2012-09-14 4:30:00');
insert into album (version, album_name, uploader_id, created_on) values(1, 'kraizzee','1', '2012-09-14 4:30:00');