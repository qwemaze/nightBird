package WoodEngine.Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import WoodEngine.Point;
import WoodEngine.Woodman;

public class testWoodman {
	Woodman test = new Woodman("test", new Point(1, 1));

	@Test
	public final void testGetLifeCount() {
		assertTrue(test.GetLifeCount() == 3);
	}

	@Test
	public final void testGetName() {
		assertTrue(test.GetName() == "test");
	}

	@Test
	public final void testKill() {
		assertTrue(!test.Kill());
		assertTrue(!test.Kill());
		assertTrue(!test.Kill());
		assertTrue(test.Kill());
	}

	@Test
	public final void testAddLife() {
		test.AddLife();
		assertTrue(test.GetLifeCount() == 4);
	}

	@Test
	public final void testGetLocation() {
		assertTrue(test.GetLocation().equals(new Point(1, 1)));
	}

	@Test
	public final void testSetLocation() {
		test.SetLocation(new Point(3, 2));
		assertTrue(test.GetLocation().equals(new Point(3, 2)));
	}

	@Test
	public final void testMoveToStart() {
		test.SetLocation(new Point(3, 2));
		test.MoveToStart();
		assertTrue(test.GetLocation().equals(new Point(1, 1)));
	}

}
