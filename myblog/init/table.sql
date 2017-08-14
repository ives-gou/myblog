/*表结构插入*/

DROP TABLE IF EXISTS `g_user_login`;

CREATE TABLE g_user_login (
	id bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT,
	mobile VARCHAR(20) NOT NULL COMMENT '手机号码/登录账号',
	email VARCHAR(50) NOT NULL COMMENT '邮箱/登录账号',
	password CHAR(32) NOT NULL COMMENT '密码',
	status TINYINT(1) NOT NULL DEFAULT 1 COMMENT '用户状态 1启用 0禁用',
	last_login_time datetime NOT NULL COMMENT '最后登录时间',
	create_time datetime NOT NULL COMMENT '创建时间'
	PRIMARY KEY pk_user_login(id)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8;