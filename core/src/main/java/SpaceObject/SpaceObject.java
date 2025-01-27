package SpaceObject;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public abstract class SpaceObject {
	
	protected Texture tex;         //Textura
	protected Image imaTex;        //Imagen que cubre la textura
	protected float x, y;          //Posicion
	protected float speed;         //velocidad
	
	public Image getImage() {
		return imaTex;
	}
	
	public void setImage(Image imaTex) {
		this.imaTex = imaTex;
	}
	
	public Texture getTex() {
		return tex;
	}

	public void setTex(Texture tex) {
		this.tex = tex;
	}

	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	public float getSpeed() {
		return speed;
	}
	public void setSpeed(float speed) {
		this.speed = speed;
	}
	
	
}
