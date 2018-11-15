package fr.springframework.sfgpetclinic.services;

import java.util.Set;

import fr.springframework.sfgpetclinic.model.Owner;

public interface OwnerService
{
	Owner findByLastTime(String lastName);

	Owner findById(Long id);

	Owner save(Owner owner);

	Set<Owner> findAll();
}
