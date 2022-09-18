package dfa.neverwinters.appliveconfigurator.repository.process;

import dfa.neverwinters.appliveconfigurator.model.entity.InstanceEntityModel;
import dfa.neverwinters.appliveconfigurator.repository.acces.InstanceRepository;
import dfa.neverwinters.appliveconfigurator.utils.AppConstants;

public class InstanceEntityProcess {

    /**
     *
     * @param repository
     * @param model
     * @return
     */
    public boolean save(InstanceRepository repository, InstanceEntityModel model)
    {

        repository.save(new InstanceEntityModel(model.getName(), model.getCode()));

        return AppConstants.TRUE;

    }

}
