package dfa.neverwinters.appliveconfigurator.controllers.console;

import dfa.neverwinters.appliveconfigurator.utils.AppConstants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>NavbarController</p>
 * <p>Navbar component controller class</p>
 */
@Controller
@RequestMapping("/console")
public class NavbarController
{

    @GetMapping("/navbar")
    public String navbar() { return AppConstants.NAVBAR_VIEW_PATH; }

}
