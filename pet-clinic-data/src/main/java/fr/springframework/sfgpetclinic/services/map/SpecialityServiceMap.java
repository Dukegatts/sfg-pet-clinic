package fr.springframework.sfgpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import fr.springframework.sfgpetclinic.model.Speciality;
import fr.springframework.sfgpetclinic.services.SpecialityService;

@Service
public class SpecialityServiceMap
	extends AbstractMapService<Speciality, Long> implements SpecialityService
{
	@Override
	public Set<Speciality> findAll()
	{
		return super.findAll();
	}

	@Override
	public void deleteById(final Long id)
	{
		super.deleteById(id);;
	}

	@Override
	public void delete(final Speciality object)
	{
		super.delete(object);
	}

	@Override
	public Speciality save(final Speciality object)
	{
		return super.save(object);
	}

	@Override
	public Speciality findById(final Long id)
	{
		return super.findById(id);
	}
}
