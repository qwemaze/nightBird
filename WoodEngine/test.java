package WoodEngine;

import java.io.IOException;

public class test {

	public static void main(String[] args) throws IOException {
		Character[] a = {'1', '1', '1', '1', '1', '0', '0', '1', '1', '2', '3', '1', '1', '1', '1', '1'};
		PrintableWood prw = new PrintableWood(a, 4, 4, System.out);
		prw.createWoodman("spa", new Point(1, 1));
		prw.createWoodman("s", new Point(1, 1));
		prw.move("spa", Direction.Right);
		prw.move("spa", Direction.Down);
		prw.move("spa", Direction.Left);
	}

}
