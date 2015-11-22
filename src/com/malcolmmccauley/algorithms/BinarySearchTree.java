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

import java.util.ArrayList;
import java.util.List;

/**
 * @author Malcolm McCauley
 *
 *A Binary Search Tree (BST) implementation in Java
 *A data structure for storing items.
 *This implementation supports adding items and converting the tree to a sorted list.
 *
 * @param <I> extends Comparable, the class of the BST item to be stored
 */
public class BinarySearchTree<I extends Comparable<I>> {
	I root = null;
	BinarySearchTree<I> left = null;
	BinarySearchTree<I> right = null;

	public BinarySearchTree() {
	}

	/**
	 * Add an item to the tree.
	 * 
	 * @param item the item to add
	 */
	public void addItem(I item) {
		if(root == null) {
			root = item;
		} else if(item.compareTo(root) < 0) {
			//key < root
			if(left == null) {
				left = new BinarySearchTree<I>();
			}
			
			left.addItem(item);
		} else {
			//key >= root
			if(right == null) {
				right = new BinarySearchTree<I>();
			}
			right.addItem(item);
		}
	}
	
	/**
	 * Returns the Binary Search Tree as a sorted ArrayList.
	 * 
	 * @return the tree converted as a sorted ArrayList
	 */
	public List<I> asSortedList() {
		List<I> list = new ArrayList<I>();
		
		if(left != null) {
			list = left.asSortedList();
		}
		
		list.add(root);
		
		if(right != null) {
			list.addAll(right.asSortedList());
		}
		
		return list;
	}
}
