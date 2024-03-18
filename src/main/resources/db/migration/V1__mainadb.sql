CREATE TABLE `userset` (
	`user_id` SERIAL NOT NULL COMMENT 'userid' ,
	`name` VARCHAR(32)  NOT NULL,
	`address` VARCHAR(250)  NOT NULL,
	`phone_number` VARCHAR(20)  NOT NULL,
	`password` VARCHAR(32) ,
	PRIMARY KEY (`user_id`)
) ENGINE=InnoDB;