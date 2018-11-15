package fr.springframework.sfgpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import fr.springframework.sfgpetclinic.model.Pet;
import fr.springframework.sfgpetclinic.services.PetService;

@Service
public class PetServiceMap
	extends AbstractMapService<Pet, Long> implements PetService
{
	@Override
	public Set<Pet> findAll()
	{
		return super.findAll();
	}

	@Override
	public void deleteById(final Long id)
	{
		super.deleteById(id);
	}

	@Override
	public void delete(final Pet object)
	{
		super.delete(object);
	}

	@Override
	public Pet save(final Pet object)
	{
		return super.save(object.getId(), object);
	}

	@Override
	public Pet findById(final Long id)
	{
		return super.findById(id);
	}
}
