package com.fcy.service.impl;

import com.fcy.pojo.Goods;
import com.fcy.mapper.GoodsMapper;
import com.fcy.service.IGoodsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品表 服务实现类
 * </p>
 *
 * @author fcy
 * @since 2022-06-26
 */
@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements IGoodsService {

}
