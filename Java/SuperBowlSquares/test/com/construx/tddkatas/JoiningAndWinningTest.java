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

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * @author melvinperez
 *
 */
class JoiningAndWinningTest {
	private static final int MINIMUM_NUMBER_OF_PLAYERS = 10;
	private final ScorerStub scorer = new ScorerStub("SuperBowl LII");
	private final ApplicationRunner application = new ApplicationRunner();

	@Test
	void join_a_game_and_win_at_the_end_of_first_quarter() {
		application.setupGame("Patriots", "Eagles", scorer);
		addMinimumNumberOfPlayers();
		fillUpTheSquares();
		application.numberTheGrid();
		scorer.setScore(33, 41);
		assertEquals("player1", application.getWinner());
	}

	/**
	 * 
	 */
	private void fillUpTheSquares() {
		for (int square = 0; square < application.getNumberOfSquares(); square++) {
			String player = "player" + square % MINIMUM_NUMBER_OF_PLAYERS;
			application.addPick(square, player);
		}
	}

	/**
	 * 
	 */
	private void addMinimumNumberOfPlayers() {
		for (int i = 0; i < MINIMUM_NUMBER_OF_PLAYERS; i++) {
			application.addPlayer("player" + i, "P" + i, "player" + i + "@gmail.com");
		}
	}

}
