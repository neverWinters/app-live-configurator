package dfa.neverwinters.appliveconfigurator.repository.acces;

import dfa.neverwinters.appliveconfigurator.model.entity.InstanceEntityModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstanceRepository extends JpaRepository<InstanceEntityModel, Long> {

}
