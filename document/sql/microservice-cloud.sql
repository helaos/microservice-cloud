DROP DATABASE IF EXISTS `cloud_db_01`;
CREATE DATABASE `cloud_db_01` CHARACTER SET utf8mb4;

USE `cloud_db_01`;

DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept`  (
  `dept_no` bigint(20) NOT NULL AUTO_INCREMENT,
  `d_name` varchar(60) NULL DEFAULT NULL,
  `db_source` varchar(60) NULL DEFAULT NULL,
  PRIMARY KEY (`dept_no`) USING BTREE
);

INSERT INTO `dept`(`d_name`, `db_source`) VALUES ('开发部', DATABASE());
INSERT INTO `dept`(`d_name`, `db_source`) VALUES ('人事部', DATABASE());
INSERT INTO `dept`(`d_name`, `db_source`) VALUES ('财务部', DATABASE());
INSERT INTO `dept`(`d_name`, `db_source`) VALUES ('市场部', DATABASE());
INSERT INTO `dept`(`d_name`, `db_source`) VALUES ('运维部', DATABASE());

DROP DATABASE IF EXISTS `cloud_db_02`;
CREATE DATABASE `cloud_db_02` CHARACTER SET utf8mb4;

USE `cloud_db_02`;

DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept`  (
  `dept_no` bigint(20) NOT NULL AUTO_INCREMENT,
  `d_name` varchar(60) NULL DEFAULT NULL,
  `db_source` varchar(60) NULL DEFAULT NULL,
  PRIMARY KEY (`dept_no`) USING BTREE
);

INSERT INTO `dept`(`d_name`, `db_source`) VALUES ('开发部', DATABASE());
INSERT INTO `dept`(`d_name`, `db_source`) VALUES ('人事部', DATABASE());
INSERT INTO `dept`(`d_name`, `db_source`) VALUES ('财务部', DATABASE());
INSERT INTO `dept`(`d_name`, `db_source`) VALUES ('市场部', DATABASE());
INSERT INTO `dept`(`d_name`, `db_source`) VALUES ('运维部', DATABASE());

DROP DATABASE IF EXISTS `cloud_db_03`;
CREATE DATABASE `cloud_db_03` CHARACTER SET utf8mb4;

USE `cloud_db_03`;

DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept`  (
  `dept_no` bigint(20) NOT NULL AUTO_INCREMENT,
  `d_name` varchar(60) NULL DEFAULT NULL,
  `db_source` varchar(60) NULL DEFAULT NULL,
  PRIMARY KEY (`dept_no`) USING BTREE
);

INSERT INTO `dept`(`d_name`, `db_source`) VALUES ('开发部', DATABASE());
INSERT INTO `dept`(`d_name`, `db_source`) VALUES ('人事部', DATABASE());
INSERT INTO `dept`(`d_name`, `db_source`) VALUES ('财务部', DATABASE());
INSERT INTO `dept`(`d_name`, `db_source`) VALUES ('市场部', DATABASE());
INSERT INTO `dept`(`d_name`, `db_source`) VALUES ('运维部', DATABASE());
