package fr.springframework.sfgpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import fr.springframework.sfgpetclinic.model.Owner;
import fr.springframework.sfgpetclinic.services.OwnerService;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService
{
	@Override
	public Set<Owner> findAll()
	{
		return super.findAll();
	}

	@Override
	public void deleteById(final Long id)
	{
		super.deleteById(id);
	}

	@Override
	public void delete(final Owner object)
	{
		super.delete(object);
	}

	@Override
	public Owner save(final Owner object)
	{
		return super.save(object);
	}

	@Override
	public Owner findById(final Long id)
	{
		return super.findById(id);
	}

	@Override
	public Owner findByLastTime(final String lastName)
	{
		return null;
	}
}
