/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50554
Source Host           : localhost:3306
Source Database       : apartment

Target Server Type    : MYSQL
Target Server Version : 50554
File Encoding         : 65001

Date: 2018-05-27 03:33:18
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for room
-- ----------------------------
DROP TABLE IF EXISTS `room`;
CREATE TABLE `room` (
  `continent` varchar(50) NOT NULL DEFAULT '',
  `country` varchar(50) NOT NULL DEFAULT '',
  `status` varchar(50) NOT NULL DEFAULT '',
  `location` varchar(50) NOT NULL DEFAULT '',
  `type` varchar(50) NOT NULL DEFAULT '',
  `bed` int(10) NOT NULL DEFAULT '0',
  `bathroom` int(10) NOT NULL DEFAULT '0',
  `price` int(10) NOT NULL DEFAULT '0',
  `imageURL` varchar(100) NOT NULL DEFAULT '',
  PRIMARY KEY (`continent`,`country`,`status`,`location`,`type`,`bed`,`bathroom`,`price`,`imageURL`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of room
-- ----------------------------
INSERT INTO `room` VALUES ('Africa', 'Ethiopia', 'New Houses', 'Florida 5, Pinecrest, FL', 'Villa', '4', '3', '5500', 'http://eugeneliu.top:81/img/1.jpg');
INSERT INTO `room` VALUES ('Africa', 'Ghana', 'Old Houses', 'Florida 5, Pinecrest, FL', 'Apartment', '3', '2', '4500', 'http://eugeneliu.top:81/img/4.jpg');
INSERT INTO `room` VALUES ('Africa', 'South Africa', 'Uncompleted', '109 Bollywood Boulevard', 'Villa', '5', '4', '350', 'http://eugeneliu.top:81/img/2.jpg');
INSERT INTO `room` VALUES ('Asia', 'China', 'New Houses', '60 Merrick Way, Miami', 'Apartment', '2', '4', '2500', 'http://eugeneliu.top:81/img/1.jpg');
INSERT INTO `room` VALUES ('Asia', 'Japan', 'Old Houses', 'Florida 5, Pinecrest, FL', 'Town House', '5', '3', '7500', 'http://eugeneliu.top:81/img/3.jpg');
INSERT INTO `room` VALUES ('Asia', 'South Korea', 'For rent', 'Florida 5, Pinecrest, FL', 'Villa', '4', '5', '5500', 'http://eugeneliu.top:81/img/1.jpg');
INSERT INTO `room` VALUES ('Asia', 'Thailand', 'Uncompleted', '109 Bollywood Boulevard', 'Town Houses', '5', '3', '9500', 'http://eugeneliu.top:81/img/2.jpg');
INSERT INTO `room` VALUES ('Australia and Oceania', 'Australia', 'Old Houses', '109 Bollywood Boulevard', 'Apartment', '3', '3', '3500', 'http://eugeneliu.top:81/img/2.jpg');
INSERT INTO `room` VALUES ('Australia and Oceania', 'papua new guinea', 'New Houses', '109 Bollywood Boulevard', 'Town House', '4', '5', '6500', 'http://eugeneliu.top:81/img/5.jpg');
INSERT INTO `room` VALUES ('Europe', 'Britain', 'Uncompleted', 'Florida 5, Pinecrest, FL', 'Town House', '2', '4', '6500', 'http://eugeneliu.top:81/img/4.jpg');
INSERT INTO `room` VALUES ('Europe', 'Finland', 'For rent', 'Florida 5, Pinecrest, FL', 'Apartment', '3', '3', '6200', 'http://eugeneliu.top:81/img/3.jpg');
INSERT INTO `room` VALUES ('Europe', 'France', 'For rent', 'Florida 5, Pinecrest, FL', 'Town House', '3', '4', '4500', 'http://eugeneliu.top:81/img/3.jpg');
INSERT INTO `room` VALUES ('Europe', 'Germany', 'Old Houses', 'Florida 5, Pinecrest, FL', 'Villa', '4', '3', '5500', 'http://eugeneliu.top:81/img/3.jpg');
INSERT INTO `room` VALUES ('Middle East', 'Dubai', 'New Houses', 'Florida 5, Pinecrest, FL', 'Villa', '3', '2', '6500', 'http://eugeneliu.top:81/img/5.jpg');
INSERT INTO `room` VALUES ('Middle East', 'Qatar', 'Old Houses', 'Florida 5, Pinecrest, FL', 'Apartment', '5', '5', '6500', 'http://eugeneliu.top:81/img/5.jpg');
INSERT INTO `room` VALUES ('North America', 'America', 'Uncompleted', 'Florida 5, Pinecrest, FL', 'Town House', '4', '3', '4700', 'http://eugeneliu.top:81/img/4.jpg');
INSERT INTO `room` VALUES ('North America', 'Canada', 'For rent ', 'Florida 5, Pinecrest, FL', 'Villa', '5', '3', '6700', 'http://eugeneliu.top:81/img/5.jpg');
INSERT INTO `room` VALUES ('North America', 'Jamaica', 'Old Houses', 'Florida 5, Pinecrest, FL', 'Apartment', '4', '3', '7200', 'http://eugeneliu.top:81/img/4.jpg');
INSERT INTO `room` VALUES ('South America', 'Brazil', 'For rent', 'Florida 5, Pinecrest, FL', 'Town House', '4', '3', '6600', 'http://eugeneliu.top:81/img/5.jpg');
INSERT INTO `room` VALUES ('South America', 'Venezuela', 'Uncompleted', 'Florida 5, Pinecrest, FL', 'Town House', '4', '3', '8500', 'http://eugeneliu.top:81/img/4.jpg');
