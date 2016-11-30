package model;

public class LabyrinthStub extends Labyrinth {
	private static LabyrinthStub instance;
	
	protected LabyrinthStub() {
		super(32, 32);
		
		this.elements.add(new Box( 1,  1, false));
		this.elements.add(new Box( 3,  1, false));
		this.elements.add(new Box( 5,  1, false));
		this.elements.add(new Box( 7,  1, false));
		this.elements.add(new Box( 9,  1, false));
		this.elements.add(new Box(11,  1, false));
		this.elements.add(new Box( 1,  3, false));
		this.elements.add(new Box( 3,  3, false));
		this.elements.add(new Box( 5,  3, false));
		this.elements.add(new Box( 7,  3, false));
		this.elements.add(new Box( 9,  3, false));
		this.elements.add(new Box(11,  3, false));
		this.elements.add(new Box( 1,  5, false));
		this.elements.add(new Box( 3,  5, false));
		this.elements.add(new Box( 5,  5, false));
		this.elements.add(new Box( 7,  5, false));
		this.elements.add(new Box( 9,  5, false));
		this.elements.add(new Box(11,  5, false));
		this.elements.add(new Box( 1,  7, false));
		this.elements.add(new Box( 3,  7, false));
		this.elements.add(new Box( 5,  7, false));
		this.elements.add(new Box( 7,  7, false));
		this.elements.add(new Box( 9,  7, false));
		this.elements.add(new Box(11,  7, false));
		this.elements.add(new Box( 1,  9, false));
		this.elements.add(new Box( 3,  9, false));
		this.elements.add(new Box( 5,  9, false));
		this.elements.add(new Box( 7,  9, false));
		this.elements.add(new Box( 9,  9, false));
		this.elements.add(new Box(11,  9, false));
		this.elements.add(new Box( 1, 11, false));
		this.elements.add(new Box( 3, 11, false));
		this.elements.add(new Box( 5, 11, false));
		this.elements.add(new Box( 7, 11, false));
		this.elements.add(new Box( 9, 11, false));
		this.elements.add(new Box(11, 11, false));
	};
	
	public synchronized static LabyrinthStub getInstance() {
		if (LabyrinthStub.instance == null) {
			LabyrinthStub.instance = new LabyrinthStub();
		}
		
		return LabyrinthStub.instance;
	}
}
