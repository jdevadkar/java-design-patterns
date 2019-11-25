package com.design.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * The Class PrototypeEverydayDemo.
 */
public class PrototypeEverydayDemo {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		String sql = "select * from movies where title = ?";
		List<String> parameters = new ArrayList<>();
		parameters.add("Star War");
		Record record = new Record();
		Statement firstStatemment = new Statement(sql, parameters, record);
		System.out.println(firstStatemment.getSql());
		System.out.println(firstStatemment.getParameters());
		System.out.println(firstStatemment.getRecord());

		Statement secondStatement = firstStatemment.clone();
		System.out.println(secondStatement.getSql());
		System.out.println(secondStatement.getParameters());
		System.out.println(secondStatement.getRecord());
	}

}
