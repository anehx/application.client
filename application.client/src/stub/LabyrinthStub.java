package stub;

import java.util.Vector;

import model.Box;
import model.GameElement;

public class LabyrinthStub {
	private static LabyrinthStub instance;
	
	protected LabyrinthStub() {};
	
	public synchronized LabyrinthStub getInstance() {
		if (LabyrinthStub.instance == null) {
			LabyrinthStub.instance = new LabyrinthStub();
		}
		
		return LabyrinthStub.instance;
	}
	
	public Vector<GameElement> getElements() {
		Vector<GameElement> elements = new Vector<GameElement>();
		
		elements.add(new Box(16, 16, 16, 16, false));
		elements.add(new Box(16,  0, 16, 16, true));
		elements.add(new Box(0,  16, 16, 16, true));
		
		return elements;
	}
}
