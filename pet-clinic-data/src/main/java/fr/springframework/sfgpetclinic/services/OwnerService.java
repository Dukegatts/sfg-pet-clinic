package fr.springframework.sfgpetclinic.services;

import fr.springframework.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>
{
	Owner findByLastTime(String lastName);
}
