package dfa.neverwinters.appliveconfigurator.controllers.console;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>DashboardController</p>
 * <p>Dashboard page controller class.</p>
 */
@Controller
@RequestMapping("/console")
public class DashboardController
{

    @GetMapping("/dashboard")
    public String dashboard()
    {
        return "console";
    }

}
