package com.example.codeclan.pirateservice;

import com.example.codeclan.pirateservice.models.Pirate;
import com.example.codeclan.pirateservice.models.Raid;
import com.example.codeclan.pirateservice.models.Ship;
import com.example.codeclan.pirateservice.repository.PirateRepository;
import com.example.codeclan.pirateservice.repository.RaidRepository;
import com.example.codeclan.pirateservice.repository.ShipRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@ActiveProfiles("test") //Indicates it's a test profile so will not run DataLoader
@SpringBootTest
public class PirateserviceApplicationTests {

	@Autowired
	PirateRepository pirateRepository;

	@Autowired
	ShipRepository shipRepository;

	@Autowired
	RaidRepository raidRepository;

	@Test
	public void contextLoads() {
	}
	@Ignore
	@Test
	public void createPirateAndShipThenSave(){

		Ship dutchman = new Ship("The Flying Dutchman");
		shipRepository.save(dutchman);
		Pirate jack = new Pirate("jack", "sparrow", 32, dutchman);
		pirateRepository.save(jack);
	}
	@Ignore
	@Test
	public void createPirateAndRaidThenSave(){
		Ship pineapple = new Ship("The Flying Pineapple");
		shipRepository.save(pineapple);
		Pirate spongeBob = new Pirate("SpongeBob", "SquarePants", 8, pineapple);
		pirateRepository.save(spongeBob);

		Raid raid = new Raid("Tortuga", 100);
		raidRepository.save(raid);

		spongeBob.addRaid(raid);
		raid.addPirate(spongeBob);
		raidRepository.save(raid);
	}
@Ignore
	@Test
	public void canfindPiratesOver30(){
		List<Pirate> foundPirates = pirateRepository.findByAgeGreaterThan(30);
		assertEquals(9, foundPirates.size());
	}

	@Test
	public void canFindPirateByName(){
		List<Pirate> foundPirates = pirateRepository.findByFirstName("Horatio");
		assertEquals(1, foundPirates.size());
	}

	@Test
	public void canFindRaidByLocation(){
		List<Raid> foundRaids = raidRepository.findByLocation("Tortuga");
		assertEquals(3, foundRaids.size());
	}

	@Test
	public void canCountPiratesOver30(){
		long countOfPirates = pirateRepository.countByAgeGreaterThan(30);
		assertEquals(9, countOfPirates);
	}

	@Test
	public void canFindPiratesByRaidId(){
		List<Pirate> foundPirates = pirateRepository.findByRaidsId(2L);
		assertEquals(2, foundPirates.size());
		assertEquals("Sparrow", foundPirates.get(0).getLastName());
		assertEquals("Silver", foundPirates.get(1).getLastName());

	}

	@Test
	public void canFindShipWithPiratesfirstName(){
		List<Ship> foundShips = shipRepository.findByPiratesFirstName("Jack");
		assertEquals("The Black Pearl", foundShips.get(0).getName());
		assertEquals(Long.valueOf(2), foundShips.get(0).getId());

	}

	@Test
	public void canFindShipsconnctedWithRaids(){
		Ship ship = shipRepository.getById(7L);
		List<Raid> foundRaid = raidRepository.findByPiratesShip(ship);
		assertEquals(1, foundRaid.size());
		assertEquals("Port Royal", foundRaid.get(0).getLocation());

	}
}
