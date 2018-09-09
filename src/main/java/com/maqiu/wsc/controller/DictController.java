package com.maqiu.wsc.controller;

import com.maqiu.wsc.constant.Constant;
import com.maqiu.wsc.controller.request.DictSaveRequest;
import com.maqiu.wsc.controller.response.BaseResponse;
import com.maqiu.wsc.dal.dao.DictDao;
import com.maqiu.wsc.dal.other.BaseDict;
import com.maqiu.wsc.util.HashUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/dict")
public class DictController {

    @Resource
    private DictDao dictDao;

    @RequestMapping("/add")
    public String add(Map<String, Object> response){
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

    @ResponseBody
    @GetMapping("/all/{userId}")
    public BaseResponse<Map<String, List<BaseDict>>> all(@PathVariable Long userId){
        Map<String, List<BaseDict>> result = new HashMap<>();
        result.put("INNER_BOX", dictDao.selectByParentKey(userId, "INNER_BOX"));
        result.put("OUTER_BOX", dictDao.selectByParentKey(userId, "OUTER_BOX"));
        result.put("MATERIAL", dictDao.selectByParentKey(userId, "MATERIAL"));
        result.put("PROD_STYLE", dictDao.selectByParentKey(userId, "PROD_STYLE"));
        BaseResponse<Map<String, List<BaseDict>>> response = new BaseResponse<>();
        response.setData(result);
        return response;
    }

    private void convertDictSaveRequest2DO(DictSaveRequest request, BaseDict dictDO){
        if (request != null && dictDO != null){
            dictDO.setDictKey(request.getDictKey());
            dictDO.setDictName(request.getDictName());
            dictDO.setDictValue(request.getDictKey());
            dictDO.setUserId(request.getUserNo());
            dictDO.setParentDictKey(request.getParentKey());
        }
    }
}
