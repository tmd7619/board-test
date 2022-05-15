package kr.ac.kopo.mainController;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import vo.MemberVO;

@Controller
@RequestMapping("/form")
public class MemberController {

    @RequestMapping("/joinForm.do")
    public String joinForm() {
        return "form/joinForm";
    }
    // 방법 1
//    @RequestMapping("/join.do")
//    public String join(HttpServletRequest request){
//        MemberVO memberVO = new MemberVO();
//        String id = request.getParameter("id");
//        String password = request.getParameter("password");
//        String name = request.getParameter("name");
//
//        memberVO.setId(id);
//        memberVO.setPassword(password);
//        memberVO.setName(name);
//
//        System.out.println(memberVO);
//
//        request.setAttribute("member" , memberVO);
//
//        return "form/memberInfo" ;
//    }

    /*
    // 방법 2 // 파라미터로 vo 받기 // 알아서 변수에 주입됨
    @RequestMapping("/join.do")
    public String join(MemberVO memberVO) {
        // jsp 단의 객체로는 MemberVO(앞자리만 소문자)로 el 태그 내 사용
        System.out.println(memberVO);

        return "form/memberInfo";
    }
    */

    // 방법 3 // jsp 내 el 태그에서 사용할 공유 객채명 변경
    /*
    @RequestMapping("/join.do")
    public String join(@ModelAttribute("member") MemberVO memberVO){
        System.out.println(memberVO);

        return "form/memberInfo" ;
    }
    */

    // 방법 4 // ModelAndView 객체 사용
    /*
    @RequestMapping("join.do")
    public ModelAndView join(MemberVO member){
        ModelAndView mav = new ModelAndView();

        mav.addObject("member", member);
        mav.setViewName("form/memberInfo");
        return mav;

    }
    */

    // 방법 5 // Model 객체 및 redirect 사용
    @RequestMapping("/join.do")
    public String join(MemberVO memberVO, Model model) {

        System.out.println("jsp에서 memberVO 객체로 자동 주입 되는지? : " + memberVO);

        if (memberVO == null) {
            model.addAttribute("msg", "객체가 제대로 전달받지 못했습니다.");

        } else {
            model.addAttribute("msg", "객체가 제대로 전달 받았습니다 !");
        }

        return "form/memberInfo";

    }

}
