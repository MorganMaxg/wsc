-- 计量属性表
create table BASE_USER (
  USER_ID       BIGINT PRIMARY KEY                   AUTO_INCREMENT
  COMMENT 'ID',
  USER_NAME     VARCHAR(50)  NOT NULL                 DEFAULT ''
  COMMENT '用户名称',
  USER_PASSWORD VARCHAR(200) NOT NULL                DEFAULT ''
  COMMENT '用户密码',
  STATUS        INT(2)       NOT NULL                DEFAULT 0
  COMMENT '状态',
  CREATE_AT     TIMESTAMP    NOT NULL                DEFAULT CURRENT_TIMESTAMP
  COMMENT '创建时间'
)
)