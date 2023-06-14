package dfa.neverwinters.appliveconfigurator.process.console;

import dfa.neverwinters.appliveconfigurator.model.entity.InstanceEntityModel;
import dfa.neverwinters.appliveconfigurator.repository.acces.InstanceRepository;

import java.util.List;

public class IndexProcess {

    /**
     * <h1>IndexProcess</h1>
     * <p>Class private constructor.</p>
     */
    private IndexProcess() { }

    /**
     * <h1>platformHasRegisteredInstances</h1>
     * <p></p>
     * @param repository
     * @return
     */
    public static boolean platformHasRegisteredInstances(InstanceRepository repository) {
        List<InstanceEntityModel> instanceList = repository.findAll();

        return instanceList.size() > 0;
    }

}
