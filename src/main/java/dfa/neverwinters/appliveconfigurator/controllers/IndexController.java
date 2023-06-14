package dfa.neverwinters.appliveconfigurator.controllers;

import dfa.neverwinters.appliveconfigurator.process.console.IndexProcess;
import dfa.neverwinters.appliveconfigurator.repository.acces.InstanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    InstanceRepository instanceRepository;

    @GetMapping({ "${definitions.console.root.path}", "${definitions.console.index.path}"})
    public RedirectView index()
    {
        return IndexProcess.platformHasRegisteredInstances(instanceRepository) ?
                new RedirectView("/console/sign-in") :
                new RedirectView("/console/configuration");
    }
}
