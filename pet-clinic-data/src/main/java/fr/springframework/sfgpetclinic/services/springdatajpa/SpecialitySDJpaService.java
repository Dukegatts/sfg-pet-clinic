package fr.springframework.sfgpetclinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import fr.springframework.sfgpetclinic.model.Speciality;
import fr.springframework.sfgpetclinic.repositories.SpecialityRepository;
import fr.springframework.sfgpetclinic.services.SpecialityService;

@Service
@Profile("springdatajpa")
public class SpecialitySDJpaService implements SpecialityService
{
	private final SpecialityRepository specialityRepository;

	@Autowired
	public SpecialitySDJpaService(final SpecialityRepository specialityRepository)
	{
		this.specialityRepository = specialityRepository;
	}

	@Override
	public Set<Speciality> findAll()
	{
		Set<Speciality> specialities = new HashSet<>();
		specialityRepository.findAll().forEach(specialities::add);
		return specialities;
	}

	@Override
	public Speciality findById(final Long aLong)
	{
		return specialityRepository.findById(aLong).orElse(null);
	}

	@Override
	public Speciality save(final Speciality object)
	{
		return specialityRepository.save(object);
	}

	@Override
	public void delete(final Speciality object)
	{
		specialityRepository.delete(object);
	}

	@Override
	public void deleteById(final Long aLong)
	{
		specialityRepository.deleteById(aLong);
	}
}
