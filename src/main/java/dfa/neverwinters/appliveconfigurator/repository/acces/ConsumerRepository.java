package dfa.neverwinters.appliveconfigurator.repository.acces;

import dfa.neverwinters.appliveconfigurator.model.entity.ConsumerEntityModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsumerRepository extends JpaRepository<ConsumerEntityModel, Long> {

}
