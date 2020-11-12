package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.SuccessKilled;

public interface SuccessKilledDao {
	
	//过滤重复（联合主键）
	int insertSuccessKilled(@Param("seckillId")long seckillId, @Param("userPhone")long userPhone);
	
	SuccessKilled queryByIdWithSeckill(@Param("seckillId")long seckillId, @Param("userPhone")long userPhone);

}
