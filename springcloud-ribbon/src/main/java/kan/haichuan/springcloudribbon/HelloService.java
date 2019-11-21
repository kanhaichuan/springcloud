package kan.haichuan.springcloudribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

/**
 * 作者: 动力节点
 * 2019/11/12
 */
@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;


    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name){
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }



    public String hiError(String name){
        return "oh " + name + "出错了，请稍后重试！";
    }
}
