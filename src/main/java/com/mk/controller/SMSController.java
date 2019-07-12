package com.mk.controller;

import com.mk.common.Response;
import com.mk.common.UUIDGenerator;
import com.mk.entity.SendMessage;
import com.mk.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 短信验证码插入
 */
@Controller
public class SMSController {

    @Autowired
    private MessageService messageService;

    @RequestMapping(value = "/intersertMessage.do")
    @ResponseBody
    public Response insertMessage(HttpServletResponse servletResponse,SendMessage message) throws Exception{
        System.out.println("手机号："+message.getMobile()+"=====内容:"+message.getContent());
        servletResponse.setContentType("text/html;charset=utf-8");
        String  content = new String( message.getContent().getBytes("iso-8859-1") , "utf-8");
        System.out.println("内容："+content);
        Response response = null;
        Pattern p = Pattern.compile("^((13[0-9])|(15[^4])|(18[0,2,3,5-9])|(17[0-8])|(147))\\d{8}$"); // 验证手机号
        Matcher m = p.matcher(message.getMobile());
        if(m.matches()){
            message.setMessageguid(UUIDGenerator.randomUUID());
            message.setIssend(0);
            message.setContent(content);
            message.setSendtime(new Date(System.currentTimeMillis()));
            message.setSenduser("系统管理员");
            try{
                messageService.insertMessage(message);
                response = new Response(0,"短信发送成功");
            }catch (Exception e){
                e.printStackTrace();
                response = new Response(0,"短信发送失败");
            }

        }else{
            response = new Response(1,"手机号码格式有误");
        }
        return response;
    }
}
