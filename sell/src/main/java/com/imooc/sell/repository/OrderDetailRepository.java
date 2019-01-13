package com.imooc.sell.repository;

import com.imooc.sell.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetail,String> {
    OrderDetail save(OrderDetail orderDetail);
}
