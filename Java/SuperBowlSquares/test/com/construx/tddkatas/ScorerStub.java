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
public class ScorerStub extends Scorer {

	/**
	 * @param string
	 */
	public ScorerStub(String game) {
		// TODO Auto-generated constructor stub
	}

	public void setScore(int rowTeamPoints, int colTeamPoints) {
		this.setRowTeamScore(rowTeamPoints);
		this.setColTeamScore(colTeamPoints);
	}
}
