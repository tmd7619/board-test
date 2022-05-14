package kr.ac.kopo.mainController;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @RequestMapping("/hello/hello.do")
    public ModelAndView hello(){

        ModelAndView mav = new ModelAndView("hello/hello");
        mav.addObject("msg", "hi 스프링");
        return mav;
    }



}