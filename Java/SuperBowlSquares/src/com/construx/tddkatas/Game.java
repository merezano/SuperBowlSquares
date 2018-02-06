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
 */
public class Game {
	private static final int GRID_SIZE = 100;
	private String[][] grid;
	private String rowTeam;
	private String colTeam;

	/**
	 * @param rowTeam
	 * @param colTeam
	 */
	public Game(String rowTeam, String colTeam) {
		this.rowTeam = rowTeam;
		this.colTeam = colTeam;
		this.grid = new String[11][11];
	}

	/**
	 * @return the colTeam
	 */
	public String getColTeam() {
		return colTeam;
	}

	/**
	 * @return the rowTeam
	 */
	public String getRowTeam() {
		return rowTeam;
	}

	/**
	 * @param colTeam
	 *            the colTeam to set
	 */
	public void setColTeam(String colTeam) {
		this.colTeam = colTeam;
	}

	/**
	 * @param rowTeam
	 *            the rowTeam to set
	 */
	public void setRowTeam(String rowTeam) {
		this.rowTeam = rowTeam;
	}

	/**
	 * @param square
	 * @param player
	 */
	public void addPick(int square, String player) {
		grid[square / 10 + 1][square % 10 + 1] = player;
	}

	/**
	 * 
	 */
	public void numberTheGrid() {
		for (Integer rowNumber = 0; rowNumber < 10; rowNumber++) {
			grid[rowNumber][0] = rowNumber.toString();
		}

		for (Integer colNumber = 0; colNumber < 10; colNumber++) {
			grid[0][colNumber] = colNumber.toString();
		}
	}

	/**
	 * @param rowTeamScore
	 * @param colTeamScore
	 */
	public String getWinner(int rowTeamScore, int colTeamScore) {
		int rowNumber = rowTeamScore % 10 + 1;
		int colNumber = colTeamScore % 10 + 1;
		return grid[rowNumber][colNumber];
	}

	/**
	 * @return
	 */
	public int getNumberOfSquares() {
		return GRID_SIZE;
	}
}