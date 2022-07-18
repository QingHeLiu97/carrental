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
public class Appraise {

    //编号
    private int appr_id;
    //内容
    private String content;
    //创建人
    private String create_by;
    //创建时间
    private Date create_time;
    //更新时间
    private Date update_time;
    //评价等级
    private String level;
    //状态
    private int status;
}
