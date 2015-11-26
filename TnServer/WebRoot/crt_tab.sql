CREATE TABLE DDGL
	(
	DDID   BIGINT NOT NULL generated by default as identity,
	DDRQ   VARCHAR (10),
	SPID   BIGINT,
	USERID BIGINT,
	SPSL   INTEGER,
	DZID   BIGINT,
	DDZT   VARCHAR (2),
	BYZD1  VARCHAR (30),
	BYZD2  VARCHAR (30),
	PRIMARY KEY (DDID)
	);

COMMENT ON TABLE DDGL IS '订单管理表';

COMMENT ON COLUMN DDGL.DDID IS '订单id';
COMMENT ON COLUMN DDGL.DDRQ IS '订单日期';
COMMENT ON COLUMN DDGL.SPID IS '商品id';
COMMENT ON COLUMN DDGL.USERID IS '用户id';
COMMENT ON COLUMN DDGL.SPSL IS '商品数量';
COMMENT ON COLUMN DDGL.DZID IS '地址id';
COMMENT ON COLUMN DDGL.DDZT IS '订单状态';
COMMENT ON COLUMN DDGL.BYZD1 IS '备用字段1';
COMMENT ON COLUMN DDGL.BYZD2 IS '备用字段2';


CREATE TABLE DZB
	(
	USERID BIGINT,
	AAC031 VARCHAR (8),
	XXDZ   VARCHAR (50),
	DZID   BIGINT NOT NULL generated by default as identity,
	BYZD1  VARCHAR (30),
	BYZD2  VARCHAR (30),
	PRIMARY KEY (DZID)
	);

COMMENT ON TABLE DZB IS '地址表';

COMMENT ON COLUMN DZB.USERID IS '用户id';
COMMENT ON COLUMN DZB.AAC031 IS '地址编号';
COMMENT ON COLUMN DZB.XXDZ IS '详细地址';
COMMENT ON COLUMN DZB.DZID IS '地址id';
COMMENT ON COLUMN DZB.BYZD1 IS '备用字段1';
COMMENT ON COLUMN DZB.BYZD2 IS '备用字段2';


CREATE TABLE SPB
	(
	SPID  BIGINT NOT NULL generated by default as identity,
	SPDJ  DECIMAL (12,2),
	KCL   INTEGER,
	SPMS  VARCHAR (100),
	SPTP  VARCHAR (100),
	BYZD1 VARCHAR (30),
	BYZD2 VARCHAR (30),
	PRIMARY KEY (SPID)
	);

COMMENT ON TABLE SPB IS '产品表';

COMMENT ON COLUMN SPB.SPID IS '产品id';
COMMENT ON COLUMN SPB.SPDJ IS '产品单价';
COMMENT ON COLUMN SPB.KCL IS '产品库存量';
COMMENT ON COLUMN SPB.SPMS IS '产品描述';
COMMENT ON COLUMN SPB.SPTP IS '产品图片';
COMMENT ON COLUMN SPB.BYZD1 IS '备用字段1';
COMMENT ON COLUMN SPB.BYZD2 IS '备用字段2';


CREATE TABLE USERTB
	(
	USERID   BIGINT NOT NULL GENERATED BY DEFAULT AS IDENTITY,
	USERNAME VARCHAR (20),
	PWD      VARCHAR (100),
	DHHM     VARCHAR (20),
	JF       INTEGER,
	MAILAD   VARCHAR (26),
	ROLEID   VARCHAR (2),
	ZT       VARCHAR (1),
	BYZD1    VARCHAR (30),
	BYZD2    VARCHAR (30),
	XLDJ     VARCHAR (1),
	BYXX     VARCHAR (50),
	zyjb     VARCHAR(2),
	zyzw 	VARCHAR(20),
	sfxmjl 	VARCHAR(20),
	zyzy 	VARCHAR(20),
	zyzc 	VARCHAR(20),
	rzrq 	VARCHAR(10),
	zzrq 	VARCHAR(10),
	lrr 	VARCHAR(10),
	zjhm 	VARCHAR(40),
	cwcs 	VARCHAR(2),
	yxbz 	VARCHAR(1),
	zjlb 	VARCHAR(40),
	PRIMARY KEY (USERID)
	);
COMMENT ON TABLE USERTB IS '用户信息表';
COMMENT ON COLUMN USERTB.USERID IS '用户id';
COMMENT ON COLUMN USERTB.USERNAME IS '用户名';
COMMENT ON COLUMN USERTB.PWD IS '密码';
COMMENT ON COLUMN USERTB.DHHM IS '电话号码';
COMMENT ON COLUMN USERTB.JF IS '积分';
COMMENT ON COLUMN USERTB.MAILAD IS '邮箱地址';
COMMENT ON COLUMN USERTB.ROLEID IS '用户级别';
COMMENT ON COLUMN USERTB.zyzw IS '职员职务';
COMMENT ON COLUMN USERTB.zyjb IS '职员级别';
COMMENT ON COLUMN USERTB.sfxmjl IS '是否项目经理';
COMMENT ON COLUMN USERTB.zyzy IS '专业';
COMMENT ON COLUMN USERTB.zyzc IS '职称';
COMMENT ON COLUMN USERTB.rzrq IS '入职日期';
COMMENT ON COLUMN USERTB.zzrq IS '转正日期';
COMMENT ON COLUMN USERTB.zjlb IS '证件类别';
COMMENT ON COLUMN USERTB.lrr IS '录入人姓名*';
COMMENT ON COLUMN USERTB.zjhm IS '证件号码';
COMMENT ON COLUMN USERTB.cwcs IS '错误登陆次数';
COMMENT ON COLUMN USERTB.yxbz IS '有效标志（0/1/2/*）';
COMMENT ON COLUMN USERTB.ZT IS '用户状态';
COMMENT ON COLUMN USERTB.BYZD1 IS '备用字段1';
COMMENT ON COLUMN USERTB.BYZD2 IS '备用字段2';
COMMENT ON COLUMN USERTB.XLDJ IS '学历等级';
COMMENT ON COLUMN USERTB.BYXX IS '毕业学校';




CREATE TABLE YHKB
	(
	YHKH   VARCHAR (36) NOT NULL,
	USERID BIGINT,
	BYZD   VARCHAR (30),
	PRIMARY KEY (YHKH)
	);

COMMENT ON TABLE YHKB IS '银行卡表';

COMMENT ON COLUMN YHKB.YHKH IS '银行卡号';
COMMENT ON COLUMN YHKB.USERID IS '用户id';
COMMENT ON COLUMN YHKB.BYZD IS '备用字段';


CREATE TABLE ZHD
	(
	USERID BIGINT,
	SCRQ   VARCHAR (10),
	CZE    DECIMAL (12,2),
	XFE    DECIMAL (12,2),
	JSJG   DECIMAL (12,2),
	ZHDID  BIGINT NOT NULL generated by default as identity,
	PRIMARY KEY (ZHDID)
	);

COMMENT ON TABLE ZHD IS '账单表';

COMMENT ON COLUMN ZHD.USERID IS '用户id';
COMMENT ON COLUMN ZHD.SCRQ IS '账单日期';
COMMENT ON COLUMN ZHD.CZE IS '充值金额';
COMMENT ON COLUMN ZHD.XFE IS '消费金额';
COMMENT ON COLUMN ZHD.JSJG IS '结算结果';
COMMENT ON COLUMN ZHD.ZHDID IS '账单id';

CREATE TABLE YZXXB
	(
	USERID BIGINT,
	SCJM   VARCHAR (100),
	DTTM   VARCHAR (20),
	YZID   BIGINT NOT NULL,
	PRIMARY KEY (YZID)
	);

COMMENT ON TABLE YZXXB IS '验证信息表';
COMMENT ON COLUMN YZXXB.USERID IS '用户id';
COMMENT ON COLUMN YZXXB.SCJM IS '生成简码';
COMMENT ON COLUMN YZXXB.DTTM IS '登录时间';
COMMENT ON COLUMN YZXXB.YZID IS '验证id';

CREATE TABLE QQBW
	(
	BWBH   VARCHAR (20) NOT NULL,
	DRBWXH BIGINT,
	BWHEAD VARCHAR (400),
	BWTI   VARCHAR (2500),
	PRIMARY KEY (BWBH)
	);

CREATE TABLE ydBW
	(
	BWBH   VARCHAR (20) NOT NULL,
	DRBWXH BIGINT,
	BWHEAD VARCHAR (400),
	BWTI   VARCHAR (2500),
	PRIMARY KEY (BWBH)
	);

COMMENT ON TABLE ydBW IS '请求报文';

COMMENT ON COLUMN ydbw.BWBH IS '报文编号';
COMMENT ON COLUMN ydBW.DRBWXH IS '当日报文序号';
COMMENT ON COLUMN ydBW.BWHEAD IS '报文头';
COMMENT ON COLUMN ydBW.BWTI IS '报文体';
COMMENT ON TABLE QQBW IS '请求报文';

COMMENT ON COLUMN QQBW.BWBH IS '报文编号';
COMMENT ON COLUMN QQBW.DRBWXH IS '当日报文序号';
COMMENT ON COLUMN QQBW.BWHEAD IS '报文头';
COMMENT ON COLUMN QQBW.BWTI IS '报文体';

CREATE TABLE jsdyb(
ID INT NOT NULL,
jsmc VARCHAR(60),
roleid VARCHAR(2),
zt VARCHAR(1),
PRIMARY KEY(id)
);
COMMENT ON TABLE jsdyb IS '角色定义表';

COMMENT ON COLUMN jsdyb.id IS '角色id';
COMMENT ON COLUMN jsdyb.jsmc IS '角色名称';
COMMENT ON COLUMN jsdyb.roleid IS '权限代码';
COMMENT ON COLUMN jsdyb.zt IS '角色状态';
