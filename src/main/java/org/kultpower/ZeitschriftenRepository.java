package org.kultpower;

import java.util.Optional;

import org.kultpower.entities.Zeitschrift;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by sebastian on 28.01.16.
 */
@Repository
public interface ZeitschriftenRepository extends CrudRepository<Zeitschrift, String> {

	@EntityGraph(value = "Zeitschrift.ausgaben", type = EntityGraph.EntityGraphType.LOAD)
	Optional<Zeitschrift> findById(String id);
}
