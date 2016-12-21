package application.client.lib;

import java.util.Vector;

import javax.swing.text.StyledEditorKit.ForegroundAction;
import application.client.model.Box;

public class LabyrinthParser(Object serverLabyrinth) {
	
	public Vector<Box> parseBoxes() {
		int size = serverLabyrinth.getSize();
		
		Vector<Box> boxes = new Vector<Box>();
		
		for(int x=0;x<=size;x++){
			for (int y=0;y<=size;y++){
				String status = serverLabyrinth.getBlock(x,y);
				switch (status) {
					case 'U':
						boxes.add(new Box(x, y, false));
						break;
					case 'D':
						boxes.add(new Box(x, y, true));
						break;
				}
			}
		}
		return boxes;
	}
}
