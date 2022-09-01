package com.yubin.service;

import com.yubin.common.Result;
import com.yubin.dao.NoticeDao;
import com.yubin.entity.Notice;
import com.yubin.mapper.NoticeMapper;
import org.aspectj.weaver.ast.Not;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class NoticeService implements NoticeDao {

    @Autowired(required = false)
    private NoticeMapper noticeMapper;

    @Override
    public Object insertNotice(Notice notice) {
        int i =  noticeMapper.insertNotice(notice);
        if (i == 0){
            return new Result().error("添加失败，请重试！");
        }else{
            return new Result().success("添加成功！");
        }
    }

    @Override
    public Object deleteNotice(String noticeId) {
        int i = noticeMapper.deleteNotice(noticeId);
        if (i == 0){
            return new Result().error("删除失败，请重试!");
        }else{
            return new Result().success("删除成功！");
        }
    }

    @Override
    public Object updateNotice(Notice notice) {
        notice.setUpdateTime(new Date());
        int i =  noticeMapper.updateNotice(notice);
        if (i == 0){
            return new Result().error("更新失败，请重试");
        }else{
            return new Result().success("更新成功");
        }
    }

    @Override
    public Object selectAllNotice() {
        List<Notice> notices = noticeMapper.selectAllNotice();
        if (notices.size()>0){
            return new Result().success(notices);
        }else{
            return new Result().error("查询失败，请重试!");
        }

    }

    @Override
    public Object selectNoticeById(String noticId) {
        Notice notice =  noticeMapper.selectNoticeById(noticId);
        if (notice==null){
            return new Result().error("查找失败，该信息不存在!");
        }else{
            return new Result().success(notice);
        }
    }
}
