package dfa.neverwinters.appliveconfigurator.process.controller;

import dfa.neverwinters.appliveconfigurator.model.entity.InstanceEntityModel;
import dfa.neverwinters.appliveconfigurator.repository.acces.InstanceRepository;
import dfa.neverwinters.appliveconfigurator.repository.process.InstanceEntityProcess;

public class ConfigurationProcess {

    /**
     * <h1>ConfigurationProcess</h1>
     * <p>Private class constructor.</p>
     */
    private ConfigurationProcess() { }

    /**
     *
     * @param model
     * @return
     */
    public static boolean createInstance(InstanceRepository repository, InstanceEntityModel model)
    {
        try
        {

            InstanceEntityProcess process = new InstanceEntityProcess();

            return process.save(repository, model);

        }
        catch(Exception e)
        {

            return false;

        }

    }

}
