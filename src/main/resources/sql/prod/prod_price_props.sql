-- 产品计量属性表
create table PROD_PRICE_PROPS (
  ID BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT 'ID',
  PROD_ID VARCHAR (50) NOT NULL DEFAULT '' COMMENT '产品ID',
  PRICED_PROP_ID BIGINT NOT NULL DEFAULT 0 COMMENT '计量属性ID',
  CREATE_AT TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间'
)