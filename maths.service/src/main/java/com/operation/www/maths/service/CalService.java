package com.operation.www.maths.service;

import com.operation.www.maths.opt.Calculation;

public class CalService {

	public Integer doOperation(Integer a, Integer b, String opt) {
		Integer result = null;
		Calculation cal = new Calculation();

		switch (opt) {
		case "sum":
			result = cal.sum(a, b);
			break;

		case "div":
			result = cal.div(a, b);
			break;
		case "multi":
			result = cal.multi(a, b);
			break;
		case "sub":
			result = cal.sub(a, b);
			break;

		default:
			result = null;
			break;
		}

		return result;

	}

}
