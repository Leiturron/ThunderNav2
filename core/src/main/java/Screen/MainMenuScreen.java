package Screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Event;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.actions.AlphaAction;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;
import com.badlogic.gdx.utils.ScreenUtils;

import io.github.FirstGame.testGame.ThunderShip;

public class MainMenuScreen implements Screen{
	
	private ThunderShip game;
	private SpriteBatch batch;
	private BitmapFont font;
	private Label highScore;
	
	private Stage stage;
	private Texture fondo;
	private Image fondoImage;
	private Image blackImage;

	private LabelStyle style;
	private Label playTex;
	private Label skinTex;
	private Label quitTex;

	
	
	private float alpha;
	private float time;
	
	public MainMenuScreen(ThunderShip game) {

		this.time = 0;
		this.alpha = 2;
		
		//Juego principal y herramientas
		this.game = game;
		this.batch = game.getBatch();
		this.font = game.getFont();
		this.style = new LabelStyle(font, Color.WHITE);
		
		//Stage
		this.stage = new Stage();
		
		this.highScore = new Label("HighScore " + game.getUsuario().getHighScore(), style);
		this.highScore.setFontScale(0.3f);
		this.highScore.setPosition(30, 0);

		//Crear fondo negro para hacer fade in
		this.fondo = new Texture(Gdx.files.internal("menuFondo.png"));
		fondoImage = new Image(fondo);
		
		blackImage = new Image(fondo);
		blackImage.setColor(Color.BLACK);
		AlphaAction fadeOut = Actions.fadeOut(alpha);
		blackImage.addAction(fadeOut);
		
		
		//Botones
		playTex = new Label("Play", style);
		skinTex = new Label("Skin", style);
		quitTex = new Label("Quit", style);
		
		//Setear la posicion de los botones
		playTex.setPosition((Gdx.graphics.getWidth() - playTex.getWidth()) / 2 + 15, 450 - playTex.getHeight() / 2);
		skinTex.setPosition((Gdx.graphics.getWidth() - skinTex.getWidth()) / 2, 330 - skinTex.getHeight() / 2);
		quitTex.setPosition((Gdx.graphics.getWidth() - quitTex.getWidth()) / 2, 210 - quitTex.getHeight() / 2);
		
		//Registrar listener para los label
		registrarListener();
		
		stage.addActor(fondoImage);
		
		stage.addActor(highScore);
		
		stage.addActor(playTex);
		stage.addActor(skinTex);
		stage.addActor(quitTex);
		
		stage.addActor(blackImage);
		
		Gdx.input.setInputProcessor(stage);
	}
	

	public void show() {
		
	}

	public void render(float delta) {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		if(time >= alpha) this.blackImage.remove();
		else time += 0.007;
		
		stage.act();
		stage.draw();

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
		stage.dispose();
	}
	
	private void registrarListener() {
		playTex.addListener(new InputListener() {
			public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
				game.getClickSound().play();
				playTex.setColor(Color.GRAY);
				return true;
			}

			@Override
			public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
				playTex.setColor(Color.WHITE);
				super.touchUp(event, x, y, pointer, button);
			}
			
		});
		
		skinTex.addListener(new InputListener() {
			public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
				game.getClickSound().play();
				skinTex.setColor(Color.GRAY);
				return true;
			}

			@Override
			public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
				skinTex.setColor(Color.WHITE);
				game.setScreen(new SkinScreen(game));
				dispose();
				super.touchUp(event, x, y, pointer, button);
			}
			
		});
		
		quitTex.addListener(new InputListener() {
			public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
				game.getClickSound().play();
				quitTex.setColor(Color.GRAY);
				return true;
			}

			public void touchUp(InputEvent event, float x, float y, int pointer, int button) {

				System.exit(0);
				super.touchUp(event, x, y, pointer, button);
			}
			
			
		});
	}

}
