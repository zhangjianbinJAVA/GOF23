package com.zhang.iterator;

public class Client {

	public static void main(String[] args) {

		ConcreteMyAggeregate cma = new ConcreteMyAggeregate();

		cma.addObject("aa");
		cma.addObject("bb");
		cma.addObject("cc");

		MyIterator myiter = cma.createIterator();

		while (myiter.hasNext()) {
			System.err.println(myiter.getCurrentObj());
			myiter.next();
		}
		/***
		 * 	aa
			bb
			cc

		 */

	}
}
