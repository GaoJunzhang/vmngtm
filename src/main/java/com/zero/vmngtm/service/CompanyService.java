package com.zero.vmngtm.service;

import com.github.pagehelper.PageInfo;
import com.zero.vmngtm.model.Company;

/**
 * Created by user on 2018/10/19.
 */
public interface CompanyService extends IService<Company> {
    PageInfo<Company> selectByPage(Company company, int start, int length);
}
