package model;

import java.util.Vector;

public class LabyrinthStub extends Labyrinth {
	private static LabyrinthStub instance;
	
	private static int fieldsPerSide = 13;
	private static int fieldSize = 32;

	public Vector<GameElement> elements = new Vector<GameElement>();
	
	protected LabyrinthStub() {
		super(
			LabyrinthStub.fieldSize * LabyrinthStub.fieldsPerSide,
			LabyrinthStub.fieldSize * LabyrinthStub.fieldsPerSide
		);
		
		this.elements.add(new Box(32 *  1, 32 *  1, 32, 32, false));
		this.elements.add(new Box(32 *  3, 32 *  1, 32, 32, false));
		this.elements.add(new Box(32 *  5, 32 *  1, 32, 32, false));
		this.elements.add(new Box(32 *  7, 32 *  1, 32, 32, false));
		this.elements.add(new Box(32 *  9, 32 *  1, 32, 32, false));
		this.elements.add(new Box(32 * 11, 32 *  1, 32, 32, false));
		this.elements.add(new Box(32 *  1, 32 *  3, 32, 32, false));
		this.elements.add(new Box(32 *  3, 32 *  3, 32, 32, false));
		this.elements.add(new Box(32 *  5, 32 *  3, 32, 32, false));
		this.elements.add(new Box(32 *  7, 32 *  3, 32, 32, false));
		this.elements.add(new Box(32 *  9, 32 *  3, 32, 32, false));
		this.elements.add(new Box(32 * 11, 32 *  3, 32, 32, false));
		this.elements.add(new Box(32 *  1, 32 *  5, 32, 32, false));
		this.elements.add(new Box(32 *  3, 32 *  5, 32, 32, false));
		this.elements.add(new Box(32 *  5, 32 *  5, 32, 32, false));
		this.elements.add(new Box(32 *  7, 32 *  5, 32, 32, false));
		this.elements.add(new Box(32 *  9, 32 *  5, 32, 32, false));
		this.elements.add(new Box(32 * 11, 32 *  5, 32, 32, false));
		this.elements.add(new Box(32 *  1, 32 *  7, 32, 32, false));
		this.elements.add(new Box(32 *  3, 32 *  7, 32, 32, false));
		this.elements.add(new Box(32 *  5, 32 *  7, 32, 32, false));
		this.elements.add(new Box(32 *  7, 32 *  7, 32, 32, false));
		this.elements.add(new Box(32 *  9, 32 *  7, 32, 32, false));
		this.elements.add(new Box(32 * 11, 32 *  7, 32, 32, false));
		this.elements.add(new Box(32 *  1, 32 *  9, 32, 32, false));
		this.elements.add(new Box(32 *  3, 32 *  9, 32, 32, false));
		this.elements.add(new Box(32 *  5, 32 *  9, 32, 32, false));
		this.elements.add(new Box(32 *  7, 32 *  9, 32, 32, false));
		this.elements.add(new Box(32 *  9, 32 *  9, 32, 32, false));
		this.elements.add(new Box(32 * 11, 32 *  9, 32, 32, false));
		this.elements.add(new Box(32 *  1, 32 * 11, 32, 32, false));
		this.elements.add(new Box(32 *  3, 32 * 11, 32, 32, false));
		this.elements.add(new Box(32 *  5, 32 * 11, 32, 32, false));
		this.elements.add(new Box(32 *  7, 32 * 11, 32, 32, false));
		this.elements.add(new Box(32 *  9, 32 * 11, 32, 32, false));
		this.elements.add(new Box(32 * 11, 32 * 11, 32, 32, false));
		
		this.elements.add(new Box(64,  0, 32, 32, true));
		this.elements.add(new Box(0,  64, 32, 32, true)); 
	};
	
	public synchronized static LabyrinthStub getInstance() {
		if (LabyrinthStub.instance == null) {
			LabyrinthStub.instance = new LabyrinthStub();
		}
		
		return LabyrinthStub.instance;
	}
}
