package io.github.FirstGame.testGame;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator.FreeTypeFontParameter;
import com.badlogic.gdx.utils.ScreenUtils;

import Screen.MainMenuScreen;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class ThunderShip extends Game {
	
    private SpriteBatch batch;
    private BitmapFont font;
    private FreeTypeFontGenerator generator;
    private User usuario;
    private Sound clickSound;
    private Music music;

    @Override
    public void create() {
        batch = new SpriteBatch();
        
        generator = new FreeTypeFontGenerator(Gdx.files.internal("Quantum.otf"));
        FreeTypeFontParameter parametro = new FreeTypeFontParameter();
        parametro.size = 100;
        font = generator.generateFont(parametro);
        this.clickSound = Gdx.audio.newSound(Gdx.files.internal("clickSound.ogg"));
        this.music = Gdx.audio.newMusic(Gdx.files.internal("menuMusic.mp3"));
        
        usuario = User.getInstance();
        this.setScreen(new MainMenuScreen(this));
    }

    @Override
    public void render() {
    	music.play();
        super.render();
    }

    @Override
    public void dispose() {
        
    }

	public SpriteBatch getBatch() {
		return batch;
	}

	public BitmapFont getFont() {
		return font;
	}

	public User getUsuario() {
		return usuario;
	}
    
	public Sound getClickSound() {
		return clickSound;
	}
    
}
