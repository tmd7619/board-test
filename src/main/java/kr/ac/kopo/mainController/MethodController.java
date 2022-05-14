package kr.ac.kopo.mainController;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MethodController {
    @RequestMapping(value = "/method/method.do",
                            method= RequestMethod.GET)
    public String callGet(){

        return "method/methodForm";
    }

    @RequestMapping("/method/method.do")
    public String callPost(){

        return "method/methodProcess";
    }

}
