package Screen;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.utils.ScreenUtils;

import io.github.FirstGame.testGame.ThunderShip;

public class SkinScreen implements Screen {
	private ThunderShip game;
	
	
	public SkinScreen(ThunderShip game) {
		this.game = game;
	}
	
	public void show() {
		
		
	}
	
	
	public void render(float delta) {
		ScreenUtils.clear(Color.BLACK);
		
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}
	
	

}
