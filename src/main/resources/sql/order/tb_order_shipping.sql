-- 订单配送表
create table tb_order_shipping (
      SHIPPING_ID BIGINT PRIMARY KEY AUTO_INCREMENT COMMENT '配送ID',
      ORDER_ID VARCHAR(50) NOT NULL DEFAULT '' COMMENT '订单号',
      SHIPPINT_CODE VARCHAR(50) NOT NULL DEFAULT '' COMMENT '物流单号',
      RECEIVER_NAME VARCHAR(20) NOT NULL DEFAULT '' COMMENT '收货人全名',
      RECEIVER_PHONE VARCHAR(20) NOT NULL DEFAULT '' COMMENT '固定电话',
      RECEIVER_MOBILE VARCHAR(30) NOT NULL DEFAULT '' COMMENT '移动电话',
      RECEIVER_STATE VARCHAR(10) NOT NULL DEFAULT '' COMMENT '省份',
      RECEIVER_CITY VARCHAR(10) NOT NULL DEFAULT '' COMMENT '城市',
      RECEIVER_DISTRICT VARCHAR(20) NOT NULL DEFAULT '' COMMENT '区/县',
      RECEIVER_ADDRESS VARCHAR(200) NOT NULL DEFAULT '' COMMENT '收货地址, 如: xx路xx号',
      RECEIVER_ZIP VARCHAR(6) NOT NULL DEFAULT '' COMMENT '邮政编码, 如310000',
      CREATE_AT TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
      UPDATE_AT TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间'
)