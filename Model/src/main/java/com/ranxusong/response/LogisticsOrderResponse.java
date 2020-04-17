package com.ranxusong.response;



import com.ranxusong.entity.Clist;

import com.ranxusong.model.response.ResponseResult;
import com.ranxusong.model.response.ResultCode;
import lombok.Data;

@Data
public class LogisticsOrderResponse extends ResponseResult {
    private Clist data;

    public LogisticsOrderResponse(ResultCode resultCode, Clist data) {
        super(resultCode);
        this.data = data;
    }
}
