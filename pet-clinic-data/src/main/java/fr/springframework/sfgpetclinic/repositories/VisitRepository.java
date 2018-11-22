package fr.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import fr.springframework.sfgpetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long>
{
}
