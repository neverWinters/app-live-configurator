package dfa.neverwinters.appliveconfigurator.controllers.console;

import dfa.neverwinters.appliveconfigurator.utils.AppConstants;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>ErrorController</p>
 * <p>Error page controller class.</p>
 */
@Controller
@RequestMapping("/console")
public class ErrorController
{

    @GetMapping("/error")
    public String error(Model model)
    {
        model.addAttribute("title", "Error");
        return AppConstants.ERROR_VIEW_PATH;
    }

}
