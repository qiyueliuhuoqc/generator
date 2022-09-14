package com.fcy.service.impl;

import com.fcy.pojo.App;
import com.fcy.mapper.AppMapper;
import com.fcy.service.IAppService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 应用表 服务实现类
 * </p>
 *
 * @author fcy
 * @since 2022-09-14
 */
@Service
public class AppServiceImpl extends ServiceImpl<AppMapper, App> implements IAppService {

}
