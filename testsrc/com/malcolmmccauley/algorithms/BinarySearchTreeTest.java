/* 
 * Copyright 2015 Malcolm McCauley
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */ 

package com.malcolmmccauley.algorithms;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTreeTest extends BinarySearchTree<Integer>{

	@Test
	public void addingToBinarySearchTreeHasExpectedResults() {
		this.addItem(8);
		this.addItem(3);
		this.addItem(10);
		this.addItem(1);
		this.addItem(6);
		this.addItem(14);
		this.addItem(4);
		this.addItem(7);
		this.addItem(13);
		
		Assert.assertTrue(this.root == 8);
		Assert.assertTrue(this.left.root == 3);
		Assert.assertTrue(this.right.root == 10);
		Assert.assertTrue(this.left.left.root == 1);
		Assert.assertTrue(this.left.right.root == 6);
		Assert.assertTrue(this.left.right.left.root == 4);
		Assert.assertTrue(this.left.right.right.root == 7);
		Assert.assertTrue(this.right.right.root == 14);
		Assert.assertTrue(this.right.right.left.root == 13);
	}
	
	@Test
	public void binarySearchTreeAsSortedListTest() {
		
		BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>();
		
		bst.addItem(8);
		bst.addItem(3);
		bst.addItem(10);
		bst.addItem(1);
		bst.addItem(6);
		bst.addItem(14);
		bst.addItem(4);
		bst.addItem(7);
		bst.addItem(13);
		
		List<Integer> bstList = bst.asSortedList();
		
		Assert.assertTrue(
				bstList.equals(Arrays.asList(1, 3, 4, 6, 7, 8, 10, 13, 14)));
	}
}
