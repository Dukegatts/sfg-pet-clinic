package fr.springframework.sfgpetclinic.services.map;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import fr.springframework.sfgpetclinic.model.PetType;
import fr.springframework.sfgpetclinic.services.PetTypeService;

@Service
@Profile({"default", "map"})
public class PetTypeServiceMap
	extends AbstractMapService<PetType, Long> implements PetTypeService
{
	@Override
	public Set<PetType> findAll()
	{
		return super.findAll();
	}

	@Override
	public void deleteById(final Long id)
	{
		super.deleteById(id);
	}

	@Override
	public void delete(final PetType object)
	{
		super.delete(object);
	}

	@Override
	public PetType save(final PetType object)
	{
		return super.save(object);
	}

	@Override
	public PetType findById(final Long id)
	{
		return super.findById(id);
	}
}
