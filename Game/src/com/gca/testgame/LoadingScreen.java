package com.gca.testgame;


import com.gca.framework.Game;
import com.gca.framework.Graphics;
import com.gca.framework.Graphics.ImageFormat;
import com.gca.framework.Screen;


public class LoadingScreen extends Screen {
    public LoadingScreen(Game game) {
        super(game);
    }


    @Override
    public void update(float deltaTime) {
        Graphics g = game.getGraphics();
        Assets.menu = g.newImage("menu.jpg", ImageFormat.ARGB8888);
        Assets.background = g.newImage("background2.jpg", ImageFormat.ARGB8888);
        Assets.click = game.getAudio().createSound("explode.ogg");

        game.setScreen(new MainMenuScreen(game));


    }


    @Override
    public void paint(float deltaTime) {


    }


    @Override
    public void pause() {


    }


    @Override
    public void resume() {


    }


    @Override
    public void dispose() {


    }


    @Override
    public void backButton() {


    }
}