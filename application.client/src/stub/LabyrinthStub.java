package stub;

import java.util.Vector;

import model.Box;
import model.GameElement;

public class LabyrinthStub {
	private static LabyrinthStub instance;
	
	protected LabyrinthStub() {};
	
	public synchronized static LabyrinthStub getInstance() {
		if (LabyrinthStub.instance == null) {
			LabyrinthStub.instance = new LabyrinthStub();
		}
		
		return LabyrinthStub.instance;
	}
	
	public Vector<GameElement> getElements() {
		Vector<GameElement> elements = new Vector<GameElement>();
		
		elements.add(new Box(32, 32, 32, 32, false));
		elements.add(new Box(32,  0, 32, 32, true));
		elements.add(new Box(0,  32, 32, 32, true));
		
		return elements;
	}
}
