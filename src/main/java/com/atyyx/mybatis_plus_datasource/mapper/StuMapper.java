package com.atyyx.mybatis_plus_datasource.mapper;
import org.apache.ibatis.annotations.Param;

import com.atyyx.mybatis_plus_datasource.pojo.Stu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @Entity com.atyyx.mybatis_plus_datasource.pojo.Stu
 */
public interface StuMapper extends BaseMapper<Stu> {
    int insertSelective(Stu stu);
}




