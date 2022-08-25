package com.yubin.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Result {

    private String code;


    private String message;

    private Object result;

    private int totals;

    public static Result success() {
        return success(null);
    }

    public static Result success(Object data) {
        Result rb = new Result();
        rb.setCode(CommonEnum.SUCCESS.getResultCode());
        rb.setMessage(CommonEnum.SUCCESS.getResultMsg());
        rb.setResult(data);
        return rb;
    }

//    public static Result success(String message) {
//        Result result = new Result();
//        result.setCode("0");
//        result.setMessage("操作成功");
//        result.setResult(message);
//        return result;
//    }

    public static Result error(String code, String message) {
        Result result = new Result();
        result.setCode(code);
        result.setMessage(message);
        result.setResult(null);
        return result;
    }

    public static Result error(String message) {
        Result result = new Result();
        result.setCode(CommonEnum.SUCCESS.getResultCode());
        result.setMessage(CommonEnum.SUCCESS.getResultMsg());
        result.setResult(message);
        return result;
    }

    public static  Result error(){
        return error(null);
    }


}
