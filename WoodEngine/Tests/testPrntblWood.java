package WoodEngine.Tests;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.junit.Test;

import WoodEngine.Direction;
import WoodEngine.Point;
import WoodEngine.PrintableWood;
import WoodEngine.WoodLoader;

public class testPrntblWood {

	@Test
	public final void testCreateWoodman() throws IOException {
		WoodLoader wl = new WoodLoader();
		PrintableWood pw;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		pw = (PrintableWood)wl.LoadPrntbleWood(new FileInputStream("maze"), baos);
		pw.createWoodman("petya", new Point(1, 1));
		Scanner sc = new Scanner(new ByteArrayInputStream(baos.toByteArray()));
		Scanner fs = new Scanner(new FileInputStream("mazetest1"));
		for (int i = 0; i < 7; i++) {
			String s1 = sc.nextLine();
			String s2 = fs.nextLine();
			assertEquals(s1, s2);
		}
	}

	@Test
	public final void testMove() throws IOException {
		WoodLoader wl = new WoodLoader();
		PrintableWood pw;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		pw = (PrintableWood)wl.LoadPrntbleWood(new FileInputStream("maze"), baos);
		pw.createWoodman("petya", new Point(1, 1));
		pw.move("petya", Direction.Right);
		Scanner sc = new Scanner(new ByteArrayInputStream(baos.toByteArray()));
		Scanner fs = new Scanner(new FileInputStream("mazetest2"));
		for (int i = 0; i < 14; i++) {
			String s1 = sc.nextLine();
			String s2 = fs.nextLine();
			assertEquals(s1, s2);
		}
	}

}
