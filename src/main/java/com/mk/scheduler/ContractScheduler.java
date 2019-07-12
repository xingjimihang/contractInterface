package com.mk.scheduler;

import com.mk.entity.Contract;
import com.mk.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@EnableScheduling
public class ContractScheduler {

    @Autowired
    private ContractService contractService;

    /**
     * 每隔一分钟调度一次
     */
//    @Scheduled(cron="0 */1 * * * ?")
    public void autoSchedulerUpdateContract(){
        System.out.println("调度开始");
        long begin = System.currentTimeMillis();
        List<Contract> list = contractService.getContractList();
        if(list.size()>0){
            contractService.updateContractInfo();
        }
        long end = System.currentTimeMillis();
        System.out.println("调度结束,总耗时："+((end-begin)/1000)+"秒");
    }
}
