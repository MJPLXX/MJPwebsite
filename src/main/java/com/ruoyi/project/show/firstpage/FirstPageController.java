package com.ruoyi.project.show.firstpage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author mjp
 * @date 2019/5/18 - 14:46
 */
@Controller
@RequestMapping("/show/firstpage")
public class FirstPageController {
    private  String  prex = "show/firstPage";

    public String login(Model model){


        return prex;
    }

}
