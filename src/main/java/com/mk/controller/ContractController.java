package com.mk.controller;

import com.mk.common.Response;
import com.mk.common.StringUtils;
import com.mk.entity.Contract;
import com.mk.service.ContractService;
import org.apache.http.entity.StringEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
public class ContractController {

    @Autowired
    private ContractService contractService;

    /**
     * 修改合同融资状态
     * @param param
     * @param
     * @return
     */
    @RequestMapping(value = "/updateFinancStatus.do",method = RequestMethod.POST)
    @ResponseBody
    public Response updateContractStatus(@RequestBody Param param){
        Response response = null;
        if(StringUtils.isNotEmpty(param.getContractguid()) && StringUtils.isNotEmpty(param.getFinancStatus().toString())){
            Contract contract = contractService.getContractByContractGuid(param.getContractguid());
            if(!org.springframework.util.StringUtils.isEmpty(contract)){
                Map<String,Object> map = new HashMap<>();
                map.put("contractguid",param.getContractguid());
                map.put("financStatus",param.getFinancStatus());
                try {
                    contractService.updateContractFinancStatus(map);
                    response = new Response(0,"成功");
                }catch (Exception e){
                    e.printStackTrace();
                    response = new Response(1,"失败");
                }
            }else{
                response = new Response(1,"未查到对应的合同信息，失败");
            }

        }else{
            response = new Response(1,"合同id或融资状态为空，失败！");
        }

        return response;
    }
}
