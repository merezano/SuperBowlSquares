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

import java.util.List;

/**
 * @author melvinperez
 *
 */
public interface Numberer {

	/**
	 * @param howMany How many numbers to generate
	 * @param lowerBound minimum possible value
	 * @param upperBound maximum possible value
	 * @return A list of unique integers ranging from lowerBound to upperBound
	 */
	List<Integer> getNumbers(int howMany, int lowerBound, int upperBound);

}
