package kan.haichuan.springcloudfeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 作者: 动力节点
 * 2019/11/14
 */
@RestController
public class HiController {

    @Autowired
    SchedualService schedualService;


    @RequestMapping("hi")
    String sayHi(String name){
        return schedualService.sayHiFromClientOne(name);
    }
}
