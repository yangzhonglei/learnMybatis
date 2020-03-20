package study.yzl.com.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import study.yzl.com.model.User;

public interface UserMapper extends BaseMapper<User> {

    public Integer selectMaxAge();

}
