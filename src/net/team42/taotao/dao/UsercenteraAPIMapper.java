package net.team42.taotao.dao;

import net.team42.taotao.model.UsercenteraAPI;

public interface UsercenteraAPIMapper {
    int deleteByPrimaryKey(Integer taotaoUserId);

    int insert(UsercenteraAPI record);

    int insertSelective(UsercenteraAPI record);

    UsercenteraAPI selectByPrimaryKey(Integer taotaoUserId);

    int updateByPrimaryKeySelective(UsercenteraAPI record);

    int updateByPrimaryKey(UsercenteraAPI record);
}