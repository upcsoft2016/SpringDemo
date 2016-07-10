package cn.net.wangchenyu.springapidemo1.models;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by cheneyveron on 7/7/16.
 */
public interface CreateFoodDao extends CrudRepository<CreateFood,Long> {
}
