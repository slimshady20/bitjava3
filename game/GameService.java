package com.jse.game;

public interface GameService {
	public void add(Game game); 	//c
	public Game[] list();			//R	
	public Game detail(Game game);	
	public int count();				// R
	
	public void update(Game Game);
	public void delete(Game Game);
	
}
