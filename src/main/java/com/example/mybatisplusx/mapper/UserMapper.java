package com.example.mybatisplusx.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.example.mybatisplusx.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @Entity com.example.mybatisplusx.pojo.User
 */
public interface UserMapper extends BaseMapper<User> {

    int insertSelective(User user);

    int deleteById(@Param("id") Long id);

    int updateAgeAndEmailById(@Param("age") Integer age, @Param("email") String email, @Param("id") Long id);

    List<User> selectAgeAndNameById(@Param("id") Long id);
}




