package fr.springframework.sfgpetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import fr.springframework.sfgpetclinic.model.Speciality;

public interface SpecialityRepository extends CrudRepository<Speciality, Long>
{
}
