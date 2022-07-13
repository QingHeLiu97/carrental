package com.yubin.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Notice {
    //编号
    private  int notice_id;
    //内容
    private String content;
    //发布人
    private String autor;
    //创建时间
    private Date creat_time;
    //更新时间
    private Date update_time;
    //状态
    private int status;
}
