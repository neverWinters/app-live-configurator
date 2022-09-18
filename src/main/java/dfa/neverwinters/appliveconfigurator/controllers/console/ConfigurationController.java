package dfa.neverwinters.appliveconfigurator.controllers.console;

import dfa.neverwinters.appliveconfigurator.model.console.ConfigurationViewModel;
import dfa.neverwinters.appliveconfigurator.process.controller.ConfigurationProcess;
import dfa.neverwinters.appliveconfigurator.repository.acces.InstanceRepository;
import dfa.neverwinters.appliveconfigurator.utils.AppConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.validation.Valid;

/**
 * <p>ConfigController</p>
 * <p>Config page controller class.</p>
 */
@Controller
@RequestMapping("/console")
public class ConfigurationController implements WebMvcConfigurer
{

    @Autowired
    private InstanceRepository instanceRepository;
    private static final String CONFIG_ATTRIBUTE_NAME = "config";

    @GetMapping("/configuration")
    public String config(Model model)
    {

        model.addAttribute(CONFIG_ATTRIBUTE_NAME, new ConfigurationViewModel());

        return AppConstants.CONFIGURATION_VIEW_PATH;

    }

    @PostMapping("/configuration")
    public String config(@Valid @ModelAttribute(CONFIG_ATTRIBUTE_NAME) ConfigurationViewModel config, BindingResult result, Model model) {

        if(result.hasErrors()) { return AppConstants.CONFIGURATION_VIEW_PATH; }

        boolean instanceStatus = ConfigurationProcess.createInstance(instanceRepository, config.getInstance());

        if(!instanceStatus){

            config.setError(AppConstants.TRUE);
            config.setMessage("sgfjisdgjdfgjldfgjk");
            return AppConstants.CONFIGURATION_VIEW_PATH;

        }

        return "redirect:/console/sign-in";
    }

}
