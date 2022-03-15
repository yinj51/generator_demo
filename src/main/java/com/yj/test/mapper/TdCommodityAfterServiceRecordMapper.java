package com.yj.test.mapper;

import com.yj.test.entity.TdCommodityAfterServiceRecord;

public interface TdCommodityAfterServiceRecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TdCommodityAfterServiceRecord record);

    int insertSelective(TdCommodityAfterServiceRecord record);

    TdCommodityAfterServiceRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TdCommodityAfterServiceRecord record);

    int updateByPrimaryKey(TdCommodityAfterServiceRecord record);
}