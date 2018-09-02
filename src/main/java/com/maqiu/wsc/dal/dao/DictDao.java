package com.maqiu.wsc.dal.dao;

import com.maqiu.wsc.dal.other.BaseDict;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DictDao {

  List<BaseDict> selectByParentKey(@Param("userId")long userId, @Param("key")String parentDictKey);

  BaseDict selectByKey(@Param("userId")long userId, @Param("key")String key);

  int save(BaseDict dict);

}
