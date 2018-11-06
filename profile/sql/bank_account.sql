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

 Date: 05/11/2018 21:30:33
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for bank_account
-- ----------------------------
DROP TABLE IF EXISTS `bank_account`;
CREATE TABLE `bank_account`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '账户主键',
  `user_id` int(11) NOT NULL COMMENT '所属用户ID',
  `bank` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '账户所属银行',
  `create_time` datetime(0) NOT NULL COMMENT '账户创建时间',
  `update_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '账户最近更新时间',
  `score` int(11) DEFAULT NULL COMMENT '账户积分',
  `rank` int(4) DEFAULT NULL COMMENT '账户等级',
  `money` decimal(13, 2) DEFAULT NULL COMMENT '账户余额',
  `active` tinyint(1) DEFAULT NULL COMMENT '账户激活状态，1：激活；0：未激活',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `account_bank_rank`(`bank`, `rank`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 36607 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '银行账户' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
