package dfa.neverwinters.appliveconfigurator.model.console;

import dfa.neverwinters.appliveconfigurator.model.entity.InstanceEntityModel;
import dfa.neverwinters.appliveconfigurator.model.entity.UserEntityModel;
import dfa.neverwinters.appliveconfigurator.utils.AppConstants;

import javax.validation.Valid;

public class ConfigurationViewModel extends BaseViewModel{

    @Valid
    private InstanceEntityModel instance;
    @Valid
    private UserEntityModel user;

    public ConfigurationViewModel()
    {
        super();
        this.instance = new InstanceEntityModel(AppConstants.EMPTY_STRING, AppConstants.EMPTY_STRING);
        this.user = new UserEntityModel(AppConstants.EMPTY_STRING, AppConstants.EMPTY_STRING, AppConstants.EMPTY_STRING);
    }

    public InstanceEntityModel getInstance() { return instance; }

    public void setInstance(InstanceEntityModel instance) { this.instance = instance; }

    public UserEntityModel getUser() { return user; }

    public void setUser(UserEntityModel user) { this.user = user; }

}


