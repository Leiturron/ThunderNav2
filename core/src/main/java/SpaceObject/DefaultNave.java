package SpaceObject;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class DefaultNave extends Nave{
	
	private static DefaultNave instance;
	
	private DefaultNave() {
		
		this.tex = new Texture(Gdx.files.internal("DefaultNave.png"));
		this.imaTex = new Image(this.tex);
		this.imaTex.setScale(1/5f);
		this.x = 0;
		this.y = 0;
		this.speed = 10;
		
		this.id = 1;
		this.name = "Nova";
		this.unlock = true;
		this.destruido = false;
		this.vida = 3;
	}
	
	public static DefaultNave getInstance() {
		if(instance == null) {
			instance = new DefaultNave();
		}
		return instance;
	}
	
}
