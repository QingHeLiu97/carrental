package com.yubin.service;

import com.yubin.dao.NoticeDao;
import com.yubin.entity.Notice;
import com.yubin.mapper.NoticeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeService implements NoticeDao {

    @Autowired
    private NoticeMapper noticeMapper;

    @Override
    public int insertNotice(Notice notice) {
        return noticeMapper.insertNotice(notice);
    }

    @Override
    public int deleteNotice(String id) {
        return noticeMapper.deleteNotice(id);
    }

    @Override
    public int updateNotice(Notice notice) {
        return noticeMapper.updateNotice(notice);
    }

    @Override
    public List<Notice> selectAllNotice() {
        return noticeMapper.selectAllNotice();
    }

    @Override
    public Notice selectNoticeById(String id) {
        return noticeMapper.selectNoticeById(id);
    }
}
