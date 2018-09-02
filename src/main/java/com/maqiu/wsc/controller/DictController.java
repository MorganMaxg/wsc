package com.maqiu.wsc.controller;

import com.maqiu.wsc.constant.Constant;
import com.maqiu.wsc.controller.request.DictSaveRequest;
import com.maqiu.wsc.controller.response.BaseResponse;
import com.maqiu.wsc.dal.dao.DictDao;
import com.maqiu.wsc.dal.other.BaseDict;
import com.maqiu.wsc.util.HashUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

@Controller
@RequestMapping("/dict")
public class DictController {

    @Resource
    private DictDao dictDao;

    @RequestMapping("/add")
    public String add(Map<String, Object> response){
        response.put("outer_box", dictDao.selectByParentKey(Constant.DEFAULT_USER_ID, "outer_box"));
        response.put("inner_box", dictDao.selectByParentKey(Constant.DEFAULT_USER_ID, "inner_box"));
        response.put("material", dictDao.selectByParentKey(Constant.DEFAULT_USER_ID, "material"));
        response.put("prod_style", dictDao.selectByParentKey(Constant.DEFAULT_USER_ID, "prod_style"));

        return "dictAdd";
    }

    @ResponseBody
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public BaseResponse<Long> save(DictSaveRequest request){
        BaseResponse<Long> response = new BaseResponse<>();
        BaseDict dictDO = new BaseDict();
        convertDictSaveRequest2DO(request, dictDO);
        dictDao.save(dictDO);
        response.setData(dictDO.getDictId());
        return response;
    }

    private void convertDictSaveRequest2DO(DictSaveRequest request, BaseDict dictDO){
        if (request != null && dictDO != null){
            String hash = HashUtils.hash(dictDO.getDictName());
            dictDO.setDictKey(hash);
            dictDO.setDictName(request.getDictName());
            dictDO.setDictValue(hash);
            dictDO.setUserId(request.getUserNo());
        }
    }
}
