package com.yubin.mapper;

import com.yubin.entity.Notice;

import java.util.List;

public interface NoticeMapper {

    int insertNotice(Notice notice);

    int deleteNotice(String id);

    int updateNotice(Notice notice);

    List<Notice> selectAllNotice();

    List<Notice> selectNoticeByUser();

    Notice selectNoticeById(String id);
}
