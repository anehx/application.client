package stub;

import java.util.Vector;

import model.Box;
import model.GameElement;

public class LabyrinthStub {
	private static LabyrinthStub instance;

	public Vector<GameElement> elements = new Vector<GameElement>();
	
	protected LabyrinthStub() {
		this.elements.add(new Box(32, 32, 32, 32, false));
		this.elements.add(new Box(32,  0, 32, 32, true));
		this.elements.add(new Box(0,  32, 32, 32, true)); 
	};
	
	public synchronized static LabyrinthStub getInstance() {
		if (LabyrinthStub.instance == null) {
			LabyrinthStub.instance = new LabyrinthStub();
		}
		
		return LabyrinthStub.instance;
	}
}
