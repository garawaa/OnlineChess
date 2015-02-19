package com.rextuz.chess.pieces;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.rextuz.chess.OnlineChess;

public class Knight extends Piece {

	public Knight(int x, int y, String color) {
		super(x, y, color);
		texture = new Texture("knight_" + color + ".png");
	}

	@Override
	public void render(Sprite board) {
		Sprite sprite = new Sprite(texture);
		sprite.setSize(size, size);
		sprite.setX(board.getX() + size * x);
		sprite.setY(board.getY() + size * y);
		sprite.draw(OnlineChess.batch);
	}
}