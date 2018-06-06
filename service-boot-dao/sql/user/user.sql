drop table if exists `nybj`.`auth_user` ;
CREATE TABLE `nybj`.`auth_user` (
    `id` BIGINT NOT NULL AUTO_INCREMENT ,
    `username` VARCHAR(32) NULL,
    `password` VARCHAR(78) NULL,
    `ctime` BIGINT(20) NULL,
    `utime` BIGINT(20) NULL,
    UNIQUE INDEX `username_UNIQUE` (`username` ASC),
    PRIMARY KEY (`id`)
);
drop table if exists `nybj`.`auth_user_role_association` ;
CREATE TABLE `nybj`.`auth_user_role_association` (
    `id` BIGINT NULL AUTO_INCREMENT,
    `auth_user_id` BIGINT NULL comment '用户id' ,
    `auth_role_id` BIGINT NULL comment '角色id' ,
    `ctime` BIGINT NULL,
    `utime` BIGINT NULL,
    `uid` BIGINT NULL,
    UNIQUE `user_id_role_id_unique` (`auth_user_id` , `auth_role_id`),
    PRIMARY KEY (`id`)
);
drop table if exists `nybj`.`auth_role`;
CREATE TABLE `nybj`.`auth_role` (
  `id` BIGINT NULL AUTO_INCREMENT,
  `name` VARCHAR(32) NULL COMMENT '角色名称',
  `ctime` BIGINT NULL,
  `utime` BIGINT NULL,
  `uid` BIGINT NULL,
  `gid` BIGINT NULL,
  PRIMARY KEY (`id`),
  INDEX `index_gid` (`gid` ASC))
COMMENT = '角色表';
drop table if exists `nybj`.`auth_group`;
CREATE TABLE `nybj`.`auth_group` (
  `id` BIGINT NULL AUTO_INCREMENT,
  `name` VARCHAR(32) NULL COMMENT '租户名称',
  `ctime` BIGINT NULL,
  `utime` BIGINT NULL,
  `uid` BIGINT NULL,
  PRIMARY KEY (`id`))
COMMENT = '租户表';
drop table if exists `nybj`.`auth_user_group_association`;
CREATE TABLE `nybj`.`auth_user_group_association` (
  `id` BIGINT NULL AUTO_INCREMENT,
  `auth_user_id` BIGINT NULL,
  `auth_group_id` BIGINT NULL,
  `ctime` BIGINT NULL,
  `utime` BIGINT NULL,
  `uid` BIGINT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `unique_user_id_group_id` (`auth_user_id` ASC, `auth_group_id` ASC))
COMMENT = '用户租户关联表';
drop table if exists `nybj`.`auth_function`;
CREATE TABLE `nybj`.`auth_function` (
  `id` BIGINT NULL AUTO_INCREMENT,
  `name` VARCHAR(32) NULL COMMENT '页面、操作名称',
  `url` VARCHAR(255) NULL COMMENT '页面、方法url，不包含域名',
  `type` INT NULL COMMENT '功能类型。\n1：页面。2：方法',
  `ctime` BIGINT NULL,
  `utime` BIGINT NULL,
  `uid` BIGINT NULL,
  PRIMARY KEY (`id`))
COMMENT = '操作表';
drop table if exists `nybj`.`auth_role_function_association`;
CREATE TABLE `nybj`.`auth_role_function_association` (
  `id` BIGINT NULL AUTO_INCREMENT,
  `auth_role_id` BIGINT NULL,
  `auth_function_id` BIGINT NULL,
  `ctime` BIGINT NULL,
  `utime` BIGINT NULL,
  `uid` BIGINT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `unique_role_function_id` (`auth_role_id` ASC, `auth_function_id` ASC))
COMMENT = '角色权限表';
