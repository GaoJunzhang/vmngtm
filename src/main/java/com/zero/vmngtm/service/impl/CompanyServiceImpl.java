package com.zero.vmngtm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zero.vmngtm.mapper.CompanyMapper;
import com.zero.vmngtm.model.Company;
import com.zero.vmngtm.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * Created by user on 2018/10/19.
 */
@Service("companyService")
public class CompanyServiceImpl extends BaseService<Company> implements CompanyService {
    @Autowired
    private CompanyMapper companyMapper;

    @Override
    public PageInfo<Company> selectByPage(Company company, int start, int length) {
        int page = start / length + 1;
        Example example = new Example(Company.class);
        //分页查询
        PageHelper.startPage(page, length);
        List<Company> companies = selectByExample(example);
        return new PageInfo<>(companies);
    }
}
