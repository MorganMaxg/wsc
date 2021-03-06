-- 产品SKU表
create table PROD_SKU (
  SKU_ID        BIGINT PRIMARY KEY                                     AUTO_INCREMENT
  COMMENT 'SKU_ID',
  PROD_ID       VARCHAR(50)   NOT NULL DEFAULT '' COMMENT '产品编号',
  PROD_NUM      INT(20)     NOT NULL                                   DEFAULT 0
  COMMENT '产品数量,库存',
  PROD_PRICE    BIGINT      NOT NULL                                   DEFAULT 0
  COMMENT '产品价格,单位:分',
  PROD_OUT_CODE VARCHAR(100) NOT NULL                                  DEFAULT ''
  COMMENT '外部编码',
  STATUS        INT(5)       NOT NULL                                  DEFAULT 0
  COMMENT '状态',
  SKU_NAME      VARCHAR(100) NOT NULL                                  DEFAULT ''
  COMMENT 'SKU名称',
  PROP_STR      VARCHAR(1000) NOT NULL                                 DEFAULT ''
  COMMENT '属性字符串',
  BAR_CODE      VARCHAR(100)  NOT NULL                                 DEFAULT ''
  COMMENT '条形码',
  PROD_CODE     VARCHAR(100)  NOT NULL                                 DEFAULT ''
  COMMENT '产品码'
)