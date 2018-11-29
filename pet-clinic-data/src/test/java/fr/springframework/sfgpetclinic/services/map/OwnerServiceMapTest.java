package fr.springframework.sfgpetclinic.services.map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import fr.springframework.sfgpetclinic.model.Owner;

class OwnerServiceMapTest
{
	OwnerServiceMap ownerServiceMap;

	final Long ownerId = 1L;

	final String lastName = "Smith";

	@BeforeEach
	void setUp()
	{
		ownerServiceMap = new OwnerServiceMap(new PetTypeServiceMap(), new PetServiceMap());

		ownerServiceMap.save(Owner.builder().id(ownerId).lastName(lastName).build());
	}

	@Test
	void findAll()
	{
		Set<Owner> ownerSet = ownerServiceMap.findAll();
		assertEquals(1, ownerSet.size());
	}

	@Test
	void delete()
	{
		ownerServiceMap.delete(ownerServiceMap.findById(ownerId));

		assertEquals(0, ownerServiceMap.findAll().size());
	}

	@Test
	void deleteById()
	{
		ownerServiceMap.deleteById(ownerId);

		assertEquals(0, ownerServiceMap.findAll().size());
	}

	@Test
	void saveExistingId()
	{
		Long id = 2L;

		Owner owner2 = Owner.builder().id(id).build();

		Owner savedOwner = ownerServiceMap.save(owner2);

		assertEquals(id, savedOwner.getId());
	}

	@Test
	void saveNoId()
	{
		Owner savedOwner = ownerServiceMap.save(Owner.builder().build());

		assertNotNull(savedOwner);
		assertNotNull(savedOwner.getId());
	}

	@Test
	void findById()
	{
		Owner owner = ownerServiceMap.findById(ownerId);

		assertEquals(ownerId, owner.getId());
	}

	@Test
	void findByLastTime()
	{
		Owner smith = ownerServiceMap.findByLastTime(lastName);

		assertNotNull(smith);

		assertEquals(ownerId, smith.getId());
	}
}