package fr.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import fr.springframework.sfgpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long>
{
}
