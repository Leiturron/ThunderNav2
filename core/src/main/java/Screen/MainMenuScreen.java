package Screen;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;

import io.github.FirstGame.testGame.ThunderMenu;

public class MainMenuScreen implements Screen{
	
	private ThunderMenu game;
	private SpriteBatch batch;
	private BitmapFont font;
	private Stage stage;
	private Texture fondo;
	private ImageButton playButton;
	private ImageButton skinButton;
	private ImageButton quitButton;
	private Texture playTex;
	private Texture skinTex;
	private Texture quitTex;
	
	public MainMenuScreen(ThunderMenu game) {
		this.game = game;
		
	}
	

	public void show() {
		
	}

	public void render(float delta) {
		
	}

	public void resize(int width, int height) {
		
		
	}

	public void pause() {
		
	}

	public void resume() {
		
	}


	public void hide() {
		
	}

	public void dispose() {
		
	}

}
