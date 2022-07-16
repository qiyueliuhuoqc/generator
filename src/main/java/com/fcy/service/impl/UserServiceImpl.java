package com.fcy.service.impl;

import com.fcy.pojo.User;
import com.fcy.mapper.UserMapper;
import com.fcy.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author fcy
 * @since 2022-06-25
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
