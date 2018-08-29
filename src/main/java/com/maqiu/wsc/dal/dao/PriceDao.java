package com.maqiu.wsc.dal.dao;

import com.maqiu.wsc.dal.other.BasePrice;

import org.apache.ibatis.annotations.Param;

public interface PriceDao {

  BasePrice selectByHASH(@Param("userId") long userId,@Param("hash") String hash);
}
