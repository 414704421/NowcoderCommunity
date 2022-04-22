package com.nowcoder.community.dao;


import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {

    List<DiscussPost> selectDiscussPosts(int userId,int offset, int limit);//分页查看个人帖子

    int selectDiscussPostRows(@Param("userId") int userId);//动态SQL只有一个参数必须加此注解，@Param用于给参数取别名

}
