import javafx.scene.image.ImageView;
/* PROJECT NAME: TILE GRID GAME 
CONTRIBUTORS
STUDENT NAME: BARI� G�RAY AKMAN -> STUDENT ID: 150121822
STUDENT NAME: FURKAN G�KG�Z-> STUDENT ID: 150120076 
PURPOSE OF THAT PROGRAM IS SOLVING THE PUZZLE AND HAVING THE BALL MOVED 
IF THE PUZZLE HAS BEEN SET IN CORRECT COMBINATION.
*/
// That class represents Empty tile.
// That class inherits the features of Tile class and implements movable interface.
public class Empty extends Tile implements Movable{
	public Empty(int id, String property, ImageView image) {
		super(id, property, image);
	}
}
