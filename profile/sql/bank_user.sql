/*
 Navicat Premium Data Transfer

 Source Server         : project
 Source Server Type    : MySQL
 Source Server Version : 50720
 Source Host           : localhost:3306
 Source Schema         : project

 Target Server Type    : MySQL
 Target Server Version : 50720
 File Encoding         : 65001

 Date: 05/11/2018 21:30:42
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for bank_user
-- ----------------------------
DROP TABLE IF EXISTS `bank_user`;
CREATE TABLE `bank_user`  (
  `user_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '银行用户主键',
  `username` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '银行用户名称',
  `birthday` date DEFAULT NULL COMMENT '银行用户生日',
  `address` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '银行用户地址',
  `age` int(2) DEFAULT NULL COMMENT '银行用户年龄',
  `sex` int(1) DEFAULT NULL COMMENT '银行用户性别',
  `phone_number` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '银行用户手机号码',
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '银行用户邮箱',
  `idcard` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '银行用户身份证号码',
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 36611 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '银行用户' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
