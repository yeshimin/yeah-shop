package com.yeshimin.yeahboot.admin.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.yeshimin.yeahboot.common.domain.base.ConditionBaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 订单表
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("s_banner")
public class BannerEntity extends ConditionBaseEntity<BannerEntity> {

    /**
     * 店铺ID
     */
    private Long shopId;

    /**
     * 图片URL
     */
    private String imageUrl;
}
