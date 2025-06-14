package com.yeshimin.yeahboot.admin.controller;

import com.yeshimin.yeahboot.admin.entity.MerchantEntity;
import com.yeshimin.yeahboot.admin.mapper.MerchantMapper;
import com.yeshimin.yeahboot.admin.repository.MerchantRepo;
import com.yeshimin.yeahboot.admin.service.MerchantService;
import com.yeshimin.yeahboot.common.controller.base.CrudController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 商家表
 */
@RestController
@RequestMapping("/merchant")
public class MerchantController extends CrudController<MerchantMapper, MerchantEntity, MerchantRepo> {

    @Autowired
    private MerchantService service;

    public MerchantController(MerchantRepo repo) {
        // 由于lombok方案无法实现构造方法中调用super，只能显式调用
        super(repo);
    }

    // ================================================================================
}
