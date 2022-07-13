package com.yubin.service;

import com.yubin.dao.NoticeDao;
import com.yubin.entity.Notice;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeService implements NoticeDao {

    @Override
    public int insertNotice(Notice notice) {
        return 0;
    }

    @Override
    public int deleteNotice(String id) {
        return 0;
    }

    @Override
    public int updateNotice(Notice notice) {
        return 0;
    }

    @Override
    public List<Notice> selectAllNotice() {
        return null;
    }

    @Override
    public Notice selectNoticeById(String id) {
        return null;
    }
}
