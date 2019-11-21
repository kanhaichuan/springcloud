package kan.haichuan.springcloudfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 作者: 动力节点
 * 2019/11/14
 */
@Component
public class SchedualServiceHystrix implements SchedualService{


    @Override
    public String sayHiFromClientOne(String name) {
        return "soory " + name;
    }
}
