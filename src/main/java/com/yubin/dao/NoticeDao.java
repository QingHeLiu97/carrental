package com.yubin.dao;

import com.yubin.entity.Notice;

import java.util.List;

public interface NoticeDao {

    int insertNotice(Notice notice);

    int deleteNotice(String id);

    int updateNotice(Notice notice);

    List<Notice> selectAllNotice();

    Notice selectNoticeById(String id);
}
