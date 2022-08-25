package com.yubin.dao;

import com.yubin.entity.Notice;

import java.util.List;

public interface NoticeDao {

    Object insertNotice(Notice notice);

    Object deleteNotice(String id);

    Object updateNotice(Notice notice);

    Object selectAllNotice();

    Object selectNoticeById(String id);
}
