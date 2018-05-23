drop table if exists `nybj`.`user` ;
CREATE TABLE `nybj`.`user` (
    `id` INT NOT NULL AUTO_INCREMENT ,
    `username` VARCHAR(32) NULL,
    `password` VARCHAR(32) NULL,
    `ctime` BIGINT(20) NULL,
    `utime` BIGINT(20) NULL,
    UNIQUE INDEX `username_UNIQUE` (`username` ASC),
    PRIMARY KEY (`id`)
);

drop table if exists `nybj`.`user_role_association` ;
CREATE TABLE `nybj`.`user_role_association` (
    `id` BIGINT NULL AUTO_INCREMENT,
    `user_id` BIGINT NULL,
    `role_id` BIGINT NULL,
    `ctime` BIGINT NULL,
    `utime` BIGINT NULL,
    `uid` BIGINT NULL,
    UNIQUE `user_id_role_id_unique` (`user_id` , `role_id`),
    PRIMARY KEY (`id`)
);
