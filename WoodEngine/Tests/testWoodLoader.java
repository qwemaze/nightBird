package WoodEngine.Tests;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import WoodEngine.Action;
import WoodEngine.Direction;
import WoodEngine.Point;
import WoodEngine.Wood;
import WoodEngine.WoodLoader;

public class testWoodLoader {

	@Test
	public final void testLoad() throws IOException {
		InputStream in = new FileInputStream("maze");
		WoodLoader wl = new WoodLoader();
		Wood w;
		try{
			w = (Wood)wl.LoadWood(in);
		}
		finally{
			in.close();
		}
		w.createWoodman("nurofen", new Point(1, 1));
		assertTrue(w.move("nurofen", Direction.Right) == Action.Ok);
		assertTrue(w.move("nurofen", Direction.Down) == Action.Life);
	}

}
