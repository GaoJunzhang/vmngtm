package com.zero.vmngtm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zero.vmngtm.mapper.MediaMapper;
import com.zero.vmngtm.model.Media;
import com.zero.vmngtm.service.MediaService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.StringUtil;

import javax.annotation.Resource;
import java.util.List;

@Service("mediaService")
public class MediaServiceImpl extends BaseService<Media> implements MediaService {
    @Resource
    private MediaMapper mediaMapper;

    public PageInfo<Media> selectByPage(Media media, int start, int length){
        int page = start/length+1;
        Example example = new Example(Media.class);
        Example.Criteria criteria = example.createCriteria();
        //分页查询
        if (StringUtil.isNotEmpty(media.getName())) {
            criteria.andLike("name", "%" + media.getName() + "%");
        }
        PageHelper.startPage(page, length);
        List<Media> mediaList = selectByExample(example);
        return new PageInfo<>(mediaList);
    }

    public Media findByName(String name){
        return mediaMapper.findMediaByName(name);
    }

    @Override
    @Transactional(propagation= Propagation.REQUIRED,readOnly=false,rollbackFor={Exception.class})
    public int insertMedia(Media media){
        return mediaMapper.insertMedia(media);
    }

    public int totalMedia(int companyId){
        return mediaMapper.totalMedia(companyId);
    }
 /*   public int updateMedia(Integer playcount,Integer id){
        return mediaMapper.updateMedia(playcount,id);
    }

    public int sumPalyCount(Integer uid){
        return  mediaMapper.sumPalyCount(uid);
    }*/
 public List<Media> queryMediaByUid(int uid){
     return mediaMapper.queryMediaByUid(uid);
 }
}
