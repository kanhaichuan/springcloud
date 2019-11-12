package kan.haichuan.springcloudribbon;

import org.springframework.beans.factory.annotation.Autowired;
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


    public String hiService(String name){
        return restTemplate.getForObject("http://SERVICE-HI?name="+name, String.class);
    }
}
