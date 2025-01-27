package SpaceObject;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class CyanDemonNave extends Nave {
	
	private static CyanDemonNave instance;
	
	private CyanDemonNave() {
		
		this.tex = new Texture(Gdx.files.internal("CyanDemon.png"));
		this.imaTex = new Image(this.tex);
		this.imaTex.setScale(1/5f);
		this.x = 0;
		this.y = 0;
		this.speed = 10;
		
		this.id = 1;
		this.unlock = false;
		this.destruido = false;
		this.vida = 3;
	}
	
	public static CyanDemonNave getInstance() {
		if(instance == null) {
			instance = new CyanDemonNave();
		}
		return instance;
	}
}
