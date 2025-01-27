package Screen;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.ScreenUtils;

import SpaceObject.CyanDemonNave;
import SpaceObject.DefaultNave;
import io.github.FirstGame.testGame.ThunderShip;

public class SkinScreen implements Screen {
	
	
	private ThunderShip game;
	private BitmapFont font;
	private SpriteBatch batch;
	private Stage stage;
	
	
	public SkinScreen(ThunderShip game) {
		this.game = game;
		this.batch = game.getBatch();
		this.font = game.getFont();
		this.stage = new Stage();
		
		CyanDemonNave.getInstance().getImage().setPosition(60, 0);
		
		stage.addActor(DefaultNave.getInstance().getImage());
		stage.addActor(CyanDemonNave.getInstance().getImage());
		
	}
	
	public void show() {
		
		
	}
	
	
	public void render(float delta) {
		ScreenUtils.clear(Color.BLACK);
		stage.act();
		stage.draw();
		
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
