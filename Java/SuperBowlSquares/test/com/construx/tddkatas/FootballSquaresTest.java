package com.construx.tddkatas;

import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameTest {

	private Game grid;

	@BeforeEach
	void init() {
		grid = new Game("Patriots", "Eagles");
		grid.numberTheGrid();
	}

	@Test
	void rowsShouldBeNumberedUniquely() {
		List<Integer> rowNumbers = grid.headerColumn();

		assertTrue(String.format("Row numbers are not unique: %s", rowNumbers.toString()),
				new HashSet<Integer>(rowNumbers).size() == rowNumbers.size());
	}

	@Test
	void columnsShouldBeNumberedUniquely() {
		List<Integer> columnNumbers = grid.headerRow();

		assertTrue(String.format("Column numbers are not unique: %s", columnNumbers.toString()),
				new HashSet<Integer>(columnNumbers).size() == columnNumbers.size());
	}

	@Test
	void rowsShouldBeNumberedRandomly() {
		int numberInPreviousCell = 0;
		boolean goingUp = false;
		boolean goingDown = false;

		for (Integer numberInCurrentCell : grid.headerColumn()) {
			if (numberInPreviousCell != 0) {
				if (numberInCurrentCell > numberInPreviousCell)
					goingUp = true;
				if (numberInCurrentCell < numberInPreviousCell)
					goingDown = true;
			}

			numberInPreviousCell = numberInCurrentCell;
		}

		assertTrue(String.format("Row numbers are not numbered randomly: %s", grid.headerColumn().toString()), goingUp && goingDown);
	}
	
	@Test
	void columnsShouldBeNumberedRandomly() {
		int numberInPreviousCell = 0;
		boolean goingUp = false;
		boolean goingDown = false;

		for (Integer numberInCurrentCell : grid.headerRow()) {
			if (numberInPreviousCell != 0) {
				if (numberInCurrentCell > numberInPreviousCell)
					goingUp = true;
				if (numberInCurrentCell < numberInPreviousCell)
					goingDown = true;
			}

			numberInPreviousCell = numberInCurrentCell;
		}

		assertTrue(String.format("Column numbers are not numbered randomly: %s", grid.headerRow().toString()), goingUp && goingDown);
	}
}
