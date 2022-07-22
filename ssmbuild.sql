/*
 Navicat Premium Data Transfer

 Source Server         : My
 Source Server Type    : MySQL
 Source Server Version : 80021
 Source Host           : 127.0.0.1:3306
 Source Schema         : ssmbuild

 Target Server Type    : MySQL
 Target Server Version : 80021
 File Encoding         : 65001

 Date: 22/07/2022 11:03:25
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for books
-- ----------------------------
DROP TABLE IF EXISTS `books`;
CREATE TABLE `books`  (
  `bookID` int(0) NOT NULL AUTO_INCREMENT COMMENT '书id',
  `bookName` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '书名',
  `bookCounts` int(0) NOT NULL COMMENT '数量',
  `detail` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '描述',
  INDEX `bookID`(`bookID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of books
-- ----------------------------
INSERT INTO `books` VALUES (1, 'Java从入门到精通', 15, '从入门到放弃3');
INSERT INTO `books` VALUES (2, 'MySQL', 12, '从删库到跑路');
INSERT INTO `books` VALUES (3, 'Linux', 23, '从进门到进牢');
INSERT INTO `books` VALUES (4, 'C++程序设计基础', 50, '从开门到锁门');
INSERT INTO `books` VALUES (5, '网页设计基础', 11, '从好看到难看');
INSERT INTO `books` VALUES (9, 'Java入门经典', 23, '从秀发到头秃');

SET FOREIGN_KEY_CHECKS = 1;
