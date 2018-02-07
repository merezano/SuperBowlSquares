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
 *
 */
public class SequentialNumberer implements Numberer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.construx.tddkatas.Numberer#getNumbers(int, int, int)
	 */
	@Override
	public List<Integer> getNumbers(int howMany, int lowerBound, int upperBound) {
		List<Integer> numbers = new ArrayList<>();

		for (int i = lowerBound; i <= upperBound; i++) {
			numbers.add(i);
		}
		return numbers;
	}

}
