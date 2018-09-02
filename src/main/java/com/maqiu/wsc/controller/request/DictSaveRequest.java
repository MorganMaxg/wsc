package com.maqiu.wsc.controller.request;

import com.maqiu.wsc.constant.Constant;
import lombok.Data;

import java.io.Serializable;

@Data
public class DictSaveRequest implements Serializable {

    private long userNo = Constant.DEFAULT_USER_ID;

    private String dictName;

    private String dictKey;

    private String parentKey;
}
