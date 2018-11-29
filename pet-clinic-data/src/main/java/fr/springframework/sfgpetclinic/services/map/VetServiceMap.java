package fr.springframework.sfgpetclinic.services.map;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import fr.springframework.sfgpetclinic.model.Speciality;
import fr.springframework.sfgpetclinic.model.Vet;
import fr.springframework.sfgpetclinic.services.SpecialityService;
import fr.springframework.sfgpetclinic.services.VetService;

@Service
@Profile({"default", "map"})
public class VetServiceMap
	extends AbstractMapService<Vet, Long>
	implements VetService
{
	private final SpecialityService specialityService;

	public VetServiceMap(final SpecialityService specialityService)
	{
		this.specialityService = specialityService;
	}

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
		if ( object.getSpecialities().size() > 0 ) {
			object.getSpecialities().forEach(speciality -> {
				if ( speciality.getId() == null ) {
					Speciality savedSpeciality = specialityService.save(speciality);
					speciality.setId(savedSpeciality.getId());
				}
			});
		}
		return super.save(object);
	}

	@Override
	public Vet findById(final Long id)
	{
		return super.findById(id);
	}
}
