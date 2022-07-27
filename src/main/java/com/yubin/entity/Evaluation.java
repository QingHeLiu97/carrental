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
public class Evaluation {


    private int eva_id;

    private String user_id;

    private String data;

    private Date create_time;

    private Date update_time;

    private int status;
}
