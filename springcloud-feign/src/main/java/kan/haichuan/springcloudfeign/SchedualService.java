package kan.haichuan.springcloudfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 作者: 动力节点
 * 2019/11/14
 */
@FeignClient(value = "service-hi",fallback = SchedualServiceHystrix.class)
public interface SchedualService {

    @RequestMapping("hi")
    String sayHiFromClientOne(String name);
}
