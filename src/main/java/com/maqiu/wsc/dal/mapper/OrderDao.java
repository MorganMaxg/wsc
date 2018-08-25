package com.maqiu.wsc.dal.mapper;

import com.maqiu.wsc.dal.order.TBOrderDO;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderDao {

  @Insert("insert into tb_order ")
  int save(TBOrderDO order);

}
