/*
Navicat MySQL Data Transfer

Source Server         : local_mysql
Source Server Version : 50553
Source Host           : localhost:3306
Source Database       : myblog

Target Server Type    : MYSQL
Target Server Version : 50553
File Encoding         : 65001

Date: 2017-08-18 16:56:56
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for g_manager
-- ----------------------------
DROP TABLE IF EXISTS `g_manager`;
CREATE TABLE `g_manager` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(32) NOT NULL COMMENT '用户名',
  `password` char(32) NOT NULL COMMENT '密码',
  `salt` char(10) NOT NULL COMMENT '盐',
  `status` tinyint(1) NOT NULL DEFAULT '1' COMMENT '状态 1启用 0禁用',
  `last_login_time` datetime DEFAULT NULL COMMENT '上次登录时间',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='管理员表';

-- ----------------------------
-- Records of g_manager
-- ----------------------------
INSERT INTO `g_manager` VALUES ('1', 'admin', 'admin', '123', '1', '2017-08-18 10:56:55', '2017-08-18 10:25:50');

-- ----------------------------
-- Table structure for g_manager_role
-- ----------------------------
DROP TABLE IF EXISTS `g_manager_role`;
CREATE TABLE `g_manager_role` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `manager_id` int(10) unsigned NOT NULL COMMENT '管理员id',
  `role_id` int(10) unsigned NOT NULL COMMENT '角色id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='管理员-角色表';

-- ----------------------------
-- Records of g_manager_role
-- ----------------------------

-- ----------------------------
-- Table structure for g_permission
-- ----------------------------
DROP TABLE IF EXISTS `g_permission`;
CREATE TABLE `g_permission` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `pid` int(10) unsigned NOT NULL COMMENT '上级id',
  `name` varchar(32) NOT NULL COMMENT '权限名称',
  `url` varchar(100) NOT NULL COMMENT 'url地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='管理员权限表';

-- ----------------------------
-- Records of g_permission
-- ----------------------------

-- ----------------------------
-- Table structure for g_role
-- ----------------------------
DROP TABLE IF EXISTS `g_role`;
CREATE TABLE `g_role` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(32) NOT NULL COMMENT '角色名称',
  `description` varchar(100) NOT NULL COMMENT '角色描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='管理员角色表';

-- ----------------------------
-- Records of g_role
-- ----------------------------

-- ----------------------------
-- Table structure for g_role_permission
-- ----------------------------
DROP TABLE IF EXISTS `g_role_permission`;
CREATE TABLE `g_role_permission` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `role_id` int(10) unsigned NOT NULL COMMENT '角色id',
  `permission` int(10) unsigned NOT NULL COMMENT '权限id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色-权限表';

-- ----------------------------
-- Records of g_role_permission
-- ----------------------------

-- ----------------------------
-- Table structure for g_user_login
-- ----------------------------
DROP TABLE IF EXISTS `g_user_login`;
CREATE TABLE `g_user_login` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `mobile` varchar(20) NOT NULL COMMENT '手机号码/登录账号',
  `email` varchar(50) NOT NULL COMMENT '邮箱/登录账号',
  `password` char(32) NOT NULL COMMENT '密码',
  `status` tinyint(1) NOT NULL DEFAULT '1' COMMENT '用户状态 1启用 0禁用',
  `last_login_time` datetime NOT NULL COMMENT '最后登录时间',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of g_user_login
-- ----------------------------
INSERT INTO `g_user_login` VALUES ('1', '18281774033', 'iamgpj@163.com', '111111', '1', '2017-08-14 19:27:48', '2017-08-14 19:27:48');
INSERT INTO `g_user_login` VALUES ('3', '18281774034', 'iamgpj2@163.com', '111111', '1', '2017-08-14 19:28:57', '2017-08-14 19:28:57');
INSERT INTO `g_user_login` VALUES ('4', '18281774034', 'iamgpj2@163.com', '111111', '0', '2017-08-14 19:30:41', '2017-08-14 19:30:41');
