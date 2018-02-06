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
public abstract class Scorer {
	private int colTeamScore;
	private int rowTeamScore;

	/**
	 * @param rowTeamScore the rowTeamScore to set
	 */
	public void setRowTeamScore(int rowTeamScore) {
		this.rowTeamScore = rowTeamScore;
	}

	/**
	 * @return
	 */
	public int getRowTeamScore() {
		return rowTeamScore;
	}

	/**
	 * @return the colTeamScore
	 */
	public int getColTeamScore() {
		return colTeamScore;
	}

	/**
	 * @param colTeamScore the colTeamScore to set
	 */
	public void setColTeamScore(int colTeamScore) {
		this.colTeamScore = colTeamScore;
	}

}
