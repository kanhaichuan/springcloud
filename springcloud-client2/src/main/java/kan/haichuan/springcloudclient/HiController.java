package kan.haichuan.springcloudclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 作者: 动力节点
 * 2019/11/12
 */
@Controller
public class HiController {

    @Value("${server.port}")
    String port;

    @RequestMapping("hi")
    @ResponseBody
    public String hi(String name){
        return "欢迎:" +name+"使用 springcloud,im from " + port ;
    }
}
