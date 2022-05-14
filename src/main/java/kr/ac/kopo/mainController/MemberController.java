package kr.ac.kopo.mainController;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import vo.MemberVO;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/form")
public class MemberController {

    @RequestMapping("/joinForm.do")
    public String joinForm(){
        return "form/joinForm";
    }

    @RequestMapping("/join.do")
    public String join(HttpServletRequest request){
        MemberVO memberVO = new MemberVO();
        String id = request.getParameter("id");
        String password = request.getParameter("password");
        String name = request.getParameter("name");

        memberVO.setId(id);
        memberVO.setPassword(password);
        memberVO.setName(name);

        System.out.println(memberVO);

        request.setAttribute("member" , memberVO);

        return "form/memberInfo" ;
    }


}
