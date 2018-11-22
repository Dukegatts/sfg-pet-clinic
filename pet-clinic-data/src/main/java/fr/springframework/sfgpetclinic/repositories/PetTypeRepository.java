package fr.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import fr.springframework.sfgpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long>
{
}
