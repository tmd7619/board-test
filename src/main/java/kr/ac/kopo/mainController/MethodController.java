package kr.ac.kopo.mainController;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MethodController {

    // 요청 url 주소 //
    @RequestMapping(value = "/method/method.do", method = RequestMethod.GET)
    // 객체를 넘길 필요가 없다면, 단순 String 메서드를 이용해 넘긴다.
    public String callGet(){
        // project directory 경로 // 앞에 경로와 .jsp 는 생략 가능(spring-mvc.xml에서 설정을 했기에)
        return "method/methodForm";
    }
    // form 태그는 post 방식으로 전송하기에, post 방식으로 mapping 된다.
    @RequestMapping(value = "/method/method.do")
    public String callPost(){

        return "method/methodProcess";
    }

}
