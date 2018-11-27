package it.michelebonacina.kbmanager.domain.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import it.michelebonacina.kbmanager.domain.models.Magazine;

/**
 * Magazine persistence management.
 * 
 * @author Michele Bonacina
 * @version 0.0.1.
 * @since 0.0.1.
 */
@Repository
public interface MagazineRepository extends MongoRepository<Magazine, String> {
}
