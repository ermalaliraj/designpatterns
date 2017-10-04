package com.ea.condition;

public class BillPrinter {

	public void PrintBill(Policy p) {
		// create new visitor for printing the bills
		BillPrinterVisitor visitor = new BillPrinterVisitor(p);

		// and then ask the person to call the appropriate method of the visitor
		p.getPerson().AcceptPersonVisitor(visitor);
	}
}