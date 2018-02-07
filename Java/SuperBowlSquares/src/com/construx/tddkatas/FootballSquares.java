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

import java.util.ArrayList;
import java.util.List;

/**
 * @author melvinperez
 */
public class Game {
	private static final int NUMBER_OF_ROWS = 10;
	private static final int NUMBER_OF_COLUMNS = 10;
	private static final int HEADER_ROW = 0;
	private static final int HEADER_COLUMN = 0;
	private static final int GRID_SIZE = NUMBER_OF_ROWS * NUMBER_OF_COLUMNS;
	private String[][] grid;
	private String rowTeam;
	private String colTeam;
	private Numberer numberer;

	/**
	 * @param rowTeam
	 * @param colTeam
	 */
	public Game(String rowTeam, String colTeam) {
		this.rowTeam = rowTeam;
		this.colTeam = colTeam;
		this.grid = new String[NUMBER_OF_ROWS + 1][NUMBER_OF_COLUMNS + 1];
		this.numberer = new RandomNumberer();
	}

	/**
	 * @param square
	 * @param player
	 */
	public void addPick(int square, String player) {
		grid[square / NUMBER_OF_COLUMNS + 1][square % NUMBER_OF_ROWS + 1] = player;
	}

	public String getCellValue(int row, int col) {
		return grid[row][col];
	}

	/**
	 * @return the colTeam
	 */
	public String getColTeam() {
		return colTeam;
	}

	/**
	 * @return
	 */
	public int getNumberOfSquares() {
		return GRID_SIZE;
	}

	/**
	 * @return the rowTeam
	 */
	public String getRowTeam() {
		return rowTeam;
	}

	/**
	 * @param rowTeamScore
	 * @param colTeamScore
	 */
	public String getWinner(int rowTeamScore, int colTeamScore) {
		return getCellValue(gridRowForScore(rowTeamScore), gridColumnForScore(colTeamScore));
	}

	private int gridColumnForScore(int colTeamScore) {
		return headerRow().indexOf(lastDigitOf(colTeamScore)) + 1;
	}

	private int gridRowForScore(int rowTeamScore) {
		return headerColumn().indexOf(lastDigitOf(rowTeamScore)) + 1;
	}

	private int lastDigitOf(int score) {
		return score % 10;
	}

	public List<Integer> headerColumn() {
		List<Integer> rowNumbers = new ArrayList<>();
		for (int row = 1; row < 11; row++) {
			rowNumbers.add(Integer.valueOf(grid[row][HEADER_COLUMN]));
		}

		return rowNumbers;
	}

	/**
	 * @return
	 */
	public List<Integer> headerRow() {
		List<Integer> columnNumbers = new ArrayList<>();
		for (int col = 1; col < NUMBER_OF_COLUMNS + 1; col++) {
			columnNumbers.add(Integer.valueOf(grid[HEADER_ROW][col]));
		}

		return columnNumbers;
	}

	private void numberColumns() {
		int index = 1;
		for (Integer columnNumber : numberer.getNumbers(NUMBER_OF_COLUMNS, 0, 9))
			grid[HEADER_ROW][index++] = Integer.toString(columnNumber);
	}

	private void numberRows() {
		int index = 1;
		for (Integer rowNumber : numberer.getNumbers(NUMBER_OF_ROWS, 0, 9))
			grid[index++][HEADER_COLUMN] = Integer.toString(rowNumber);
	}

	/**
	 * 
	 */
	public void numberTheGrid() {
		numberRows();
		numberColumns();
	}

	public void numberTheGrid(Numberer numberer) {
		int index = 1;
		for (Integer rowNumber : numberer.getNumbers(NUMBER_OF_ROWS, 0, 9))
			grid[index++][HEADER_COLUMN] = Integer.toString(rowNumber);

		index = 1;
		for (Integer colNumber : numberer.getNumbers(NUMBER_OF_COLUMNS, 0, 9))
			grid[HEADER_ROW][index++] = Integer.toString(colNumber);
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

	public void printGrid() {
		for (int row = 0; row <= NUMBER_OF_ROWS; row++) {
			for (int col = 0; col <= NUMBER_OF_COLUMNS; col++) {
				System.out.print(String.format("|%8s", getCellValue(row, col)));
			}
			String horizontalLine = "--------------------------------------------------" + 
			                        "--------------------------------------------------";
			System.out.println(String.format("%n%s", horizontalLine));
		}
	}
}