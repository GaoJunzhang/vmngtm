package com.zero.vmngtm.mapper;

import com.zero.vmngtm.model.Media;
import com.zero.vmngtm.util.MyMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MediaMapper extends MyMapper<Media> {
    public Media findMediaByName(@Param("name") String name);

    public int insertMedia(Media media);

//    public Integer updateMedia(@Param("playcount") Integer playcount,@Param("id") Integer id);

//    int sumPalyCount(Integer uid);//用户总的播放次数
    int totalMedia(@Param("companyId") int companyId);

    public List<Media> queryMediaByUid(@Param("uid") int uid);
}