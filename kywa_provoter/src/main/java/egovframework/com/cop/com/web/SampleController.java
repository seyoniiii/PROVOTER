package egovframework.com.cop.com.web;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//import egovframework.com.cop.com.service.SampleService;

@Controller
public class SampleController {
    //private SampleService sampleService;
    
    @RequestMapping(value="/openSampleBoardList.do")
    public ModelAndView openSampleBoardList(Map<String,Object> commandMap) throws Exception{
        ModelAndView mv = new ModelAndView("egovframework/com/cop/com/ApplicantList");
         
      //  List<Map<String,Object>> list = sampleService.selectApplicantList(commandMap);
      //  mv.addObject("list", list);
         
        return mv;
    }
}