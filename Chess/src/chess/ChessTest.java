package chess;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import javax.swing.JComboBox;

import org.junit.*;

public class ChessTest {

	     
	@Test
	public void PrepareGameClassic()
	{
		Main main = new Main();
		JComboBox<String> test = new JComboBox<String>();
		test.addItem("classic");

		assertEquals("classic", test.getSelectedItem());
	}
	
	@Test
	public void PrepareGameRandom()
	{
		Main main = new Main();
		JComboBox<String> test = new JComboBox<String>();
		test.addItem("Chess960");

		assertEquals("Chess960", test.getSelectedItem());
	}
	
}
