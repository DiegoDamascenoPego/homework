package com.homework.domain.core.animal.repository;

import com.homework.domain.core.animal.model.Animal;
import com.homework.domain.core.sk.AnimalId;
import org.springframework.data.repository.CrudRepository;

public interface AnimalDomainRepository extends CrudRepository<Animal, AnimalId> {
}
