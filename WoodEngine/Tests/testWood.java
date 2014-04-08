package WoodEngine.Tests;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import WoodEngine.Action;
import WoodEngine.Direction;
import WoodEngine.Point;
import WoodEngine.Wood;

public class testWood {
	
	Character[] a = {'1', '1', '1', '1', '1', '0', '0', '1', '1', '2', '3', '1', '1', '1', '1', '1'};

	@Test
	public final void testCreateWoodman() throws IOException {
		Wood w = new Wood(a, 4, 4);
		w.createWoodman("nurofen", new Point(1, 1));
		assertTrue(w.move("nurofen", Direction.Right) == Action.Ok);
	}

	@Test
	public final void testMove() throws IOException {
		Wood w = new Wood(a, 4, 4);
		w.createWoodman("nurofen", new Point(1, 1));
		assertTrue(w.move("kartofel", Direction.Down) == Action.WoodmanNotFound); // нет такого
		assertTrue(w.move("nurofen", Direction.Down) == Action.Dead); // на капкан
		assertTrue(w.move("nurofen", Direction.Right) == Action.Life); // на жизнь
		assertTrue(w.move("nurofen", Direction.Up) == Action.Ok); // на пол
		assertTrue(w.move("nurofen", Direction.Down) == Action.Life); // на жизнь
		assertTrue(w.move("nurofen", Direction.Left) == Action.Dead); // на капкан
		assertTrue(w.move("nurofen", Direction.None) == Action.Dead); // на капкане
		assertTrue(w.move("nurofen", Direction.Left) == Action.Fail); // в стену
		assertTrue(w.move("nurofen", Direction.Down) == Action.Fail); // в стену
		assertTrue(w.move("nurofen", Direction.None) == Action.WoodmanNotFound); // на капкане
	}

}
