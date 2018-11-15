package fr.springframework.sfgpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import fr.springframework.sfgpetclinic.model.Vet;
import fr.springframework.sfgpetclinic.services.VetService;

@Service
public class VetServiceMap
	extends AbstractMapService<Vet, Long> implements VetService
{
	@Override
	public Set<Vet> findAll()
	{
		return super.findAll();
	}

	@Override
	public void deleteById(final Long id)
	{
		super.deleteById(id);
	}

	@Override
	public void delete(final Vet object)
	{
		super.delete(object);
	}

	@Override
	public Vet save(final Vet object)
	{
		return super.save(object);
	}

	@Override
	public Vet findById(final Long id)
	{
		return super.findById(id);
	}
}
