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
import java.util.Random;

/**
 * @author melvinperez
 *
 */
public class RandomNumberer implements Numberer {

	/* (non-Javadoc)
	 * @see com.construx.tddkatas.Numberer#getNumbers(int, int, int)
	 */
	@Override
	public List<Integer> getNumbers(int howMany, int lowerBound, int upperBound) {
		Random r = new Random();
		List<Integer> numbers = new ArrayList<>();

		int generatedNumber;
		for (int i = 0; i < howMany; i++) {
			do {
				generatedNumber = r.nextInt(upperBound - lowerBound + 1);
			} while (numbers.contains(generatedNumber));

			numbers.add(generatedNumber);
		}
		return numbers;
	}

}
