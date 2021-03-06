package com.zero.vmngtm.service;

import com.github.pagehelper.PageInfo;
import com.zero.vmngtm.model.Media;

import java.util.List;

public interface MediaService extends IService<Media> {

    public PageInfo<Media> selectByPage(Media media, int start, int length);

    public Media findByName(String name);


    public int insertMedia(Media media);

   /* public int sumPalyCount(Integer uid);

    public int updateMedia(Integer playcount, Integer id);*/
   public int totalMedia(int companyId);

    public List<Media> queryMediaByUid(int uid);


}
