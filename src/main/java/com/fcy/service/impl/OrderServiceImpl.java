package com.fcy.service.impl;

import com.fcy.pojo.Order;
import com.fcy.mapper.OrderMapper;
import com.fcy.service.IOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author fcy
 * @since 2022-06-26
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {

}
