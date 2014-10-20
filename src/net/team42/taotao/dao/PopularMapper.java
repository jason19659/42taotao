package net.team42.taotao.dao;

import net.team42.taotao.model.Popular;

public interface PopularMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Popular record);

    int insertSelective(Popular record);

    Popular selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Popular record);

    int updateByPrimaryKey(Popular record);
}