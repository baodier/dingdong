/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50611
Source Host           : localhost:3306
Source Database       : gaokao

Target Server Type    : MYSQL
Target Server Version : 50611
File Encoding         : 65001

Date: 2015-08-03 20:01:10
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for student_admit_result
-- ----------------------------
DROP TABLE IF EXISTS `student_admit_result`;
CREATE TABLE `student_admit_result` (
  `id` int(32) NOT NULL,
  `school` varchar(32) DEFAULT NULL,
  `department` varchar(32) DEFAULT NULL,
  `school_priority` tinyint(2) DEFAULT NULL,
  `department_priority` tinyint(2) DEFAULT NULL,
  `isadmited` tinyint(2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for student_baseinfo
-- ----------------------------
DROP TABLE IF EXISTS `student_baseinfo`;
CREATE TABLE `student_baseinfo` (
  `id` int(32) NOT NULL,
  `name` varchar(32) DEFAULT NULL,
  `sex` tinyint(2) DEFAULT NULL,
  `score_big` tinyint(8) DEFAULT NULL,
  `score_small` tinyint(8) DEFAULT NULL,
  `score_add` tinyint(8) DEFAULT NULL,
  `district` varchar(32) DEFAULT NULL,
  `school` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for student_plan_school
-- ----------------------------
DROP TABLE IF EXISTS `student_plan_school`;
CREATE TABLE `student_plan_school` (
  `id` int(32) NOT NULL,
  `school1` varchar(32) DEFAULT NULL,
  `school2` varchar(32) DEFAULT NULL,
  `school3` varchar(32) DEFAULT NULL,
  `school4` varchar(32) DEFAULT NULL,
  `school5` varchar(32) DEFAULT NULL,
  `school6` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for student_plan_school_department
-- ----------------------------
DROP TABLE IF EXISTS `student_plan_school_department`;
CREATE TABLE `student_plan_school_department` (
  `id` int(32) NOT NULL,
  `school` varchar(32) DEFAULT NULL,
  `depa1` varchar(32) DEFAULT NULL,
  `depa2` varchar(32) DEFAULT NULL,
  `depa3` varchar(32) DEFAULT NULL,
  `depa4` varchar(32) DEFAULT NULL,
  `depa5` varchar(32) DEFAULT NULL,
  `depa6` varchar(32) DEFAULT NULL,
  `canadjust` tinyint(2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
