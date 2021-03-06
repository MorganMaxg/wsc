-- 字典表
create table BASE_DICT (
  DICT_ID bigint primary key auto_increment COMMENT 'ID',
  USER_ID bigint NOT NULL DEFAULT 0 COMMENT '商户号',
  DICT_KEY VARCHAR (40) DEFAULT '' COMMENT '字典KEY',
  DICT_NAME VARCHAR (40) NOT NULL DEFAULT '' COMMENT '字典名称',

  DICT_VALUE VARCHAR (40) NOT NULL DEFAULT '' COMMENT '字典值',
  PARENT_DICT_KEY VARCHAR (40) DEFAULT '' COMMENT '父字典',
  STATUS INT(2) NOT NULL DEFAULT 0 COMMENT '状态',
  CREATE_AT TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间'
)