package fr.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import fr.springframework.sfgpetclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long>
{
}
