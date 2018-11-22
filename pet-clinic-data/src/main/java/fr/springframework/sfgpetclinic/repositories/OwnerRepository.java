package fr.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import fr.springframework.sfgpetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long>
{
}
