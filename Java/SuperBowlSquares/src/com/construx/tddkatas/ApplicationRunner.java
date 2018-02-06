/****************************************************************************
// Copyright (c) 2018, Construx Software, Inc., All Rights Reserved.
//
// This code is the exclusive property of Construx Software, Inc. It may ONLY 
// be used by learners during Construx's workshops or by individuals who are 
// being coached by Construx on a project.
//
// This code may NOT be copied or used for any other purpose without the prior
// written consent of Construx Software, Inc.
// ***************************************************************************/
package com.construx.tddkatas;

/**
 * @author melvinperez
 *
 */
public class ApplicationRunner {

	/**
	 * 
	 */
	private Scorer scorer;
	private Game game;

	/**
	 * @param rowTeam
	 *            Team to be displayed on the left of the grid
	 * @param colTeam
	 *            to be displayed on top of the rows of the grid
	 * @param scorer
	 *            Scorer object that keeps track of the score
	 */
	public void setupGame(String rowTeam, String colTeam, Scorer scorer) {
		this.game = new Game(rowTeam, colTeam);
		this.scorer = scorer;
	}

	/**
	 * @param playerName
	 * @param shortName
	 * @param emailAddress
	 */
	public void addPlayer(String playerName, String shortName, String emailAddress) {
		// TODO Auto-generated method stub

	}

	/**
	 * @param square
	 * @param player
	 */
	public void addPick(int square, String player) {
		game.addPick(square, player);
	}

	/**
	 * 
	 */
	public void numberTheGrid() {
		game.numberTheGrid();
	}

	/**
	 * 
	 */
	public String getWinner() {
		return game.getWinner(scorer.getRowTeamScore(), scorer.getColTeamScore());
	}

	/**
	 * @return
	 */
	public int getNumberOfSquares() {
		return game.getNumberOfSquares();
	}

}
