package dfa.neverwinters.appliveconfigurator.controllers;

import dfa.neverwinters.appliveconfigurator.utils.AppValidator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

/**
 * <p>IndexController</p>
 * <p>Index page controller class.</p>
 */
@Controller
@RequestMapping("/")
public class IndexController
{

    @GetMapping({ "/", "/index"})
    public RedirectView index()
    {

        return AppValidator.usersConfigFileExists() ?
                new RedirectView("/console/sign-in") :
                new RedirectView("/console/configuration");

    }

}
