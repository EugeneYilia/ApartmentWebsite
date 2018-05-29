/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50554
Source Host           : localhost:3306
Source Database       : apartment

Target Server Type    : MYSQL
Target Server Version : 50554
File Encoding         : 65001

Date: 2018-05-27 11:51:02
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for donator
-- ----------------------------
DROP TABLE IF EXISTS `donator`;
CREATE TABLE `donator` (
  `first_name` varchar(50) DEFAULT NULL,
  `last_name` varchar(50) DEFAULT NULL,
  `card_type` varchar(50) DEFAULT NULL,
  `card_number` varchar(50) DEFAULT NULL,
  `code` varchar(50) DEFAULT NULL,
  `amount` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of donator
-- ----------------------------
