
public class RationalTest {

	public static void main(String[] args) {
			
		Rational r1 = new Rational();
		Rational r2 = new Rational(1, 3);
		Rational r3 = new Rational(5, 7);
		Rational r4 = new Rational (9, 12);
		Rational r5 = new Rational (10, 14);
		Rational r6 = new Rational (8, -80);
		Rational r7 = new Rational (-2, 4);
		Rational r8 = new Rational (-50, -25);
		
		
		System.out.println("get Method Test:");
		System.out.println("------------------------------");
		System.out.print("r1 getNumer():  ");
		System.out.println(r1.getNumer());
		System.out.print("r1 getDenom():  ");
		System.out.println(r1.getDenom() + "\n");
		System.out.print("r2 getNumer():  ");
		System.out.println(r2.getNumer());
		System.out.print("r2 getDenom():  ");
		System.out.println(r2.getDenom() + "\n");
		System.out.print("r3 getNumer():  ");
		System.out.println(r3.getNumer());
		System.out.print("r3 getDenom():  ");
		System.out.println(r3.getDenom() + "\n");
		System.out.print("r4 getNumer():  ");
		System.out.println(r4.getNumer());
		System.out.print("r4 getDenom():  ");
		System.out.println(r4.getDenom() + "\n");
		System.out.print("r5 getNumer():  ");
		System.out.println(r5.getNumer());
		System.out.print("r5 getDenom():  ");
		System.out.println(r5.getDenom() + "\n");
		System.out.print("r6 getNumer():  ");
		System.out.println(r6.getNumer());
		System.out.print("r6 getDenom():  ");
		System.out.println(r6.getDenom() + "\n");
		System.out.print("r7 getNumer():  ");
		System.out.println(r7.getNumer());
		System.out.print("r7 getDenom():  ");
		System.out.println(r7.getDenom() + "\n");
		System.out.print("r8 getNumer():  ");
		System.out.println(r8.getNumer());
		System.out.print("r8 getDenom():  ");
		System.out.println(r8.getDenom() + "\n");
		
		String test1, test2, test3, test4, test5, test6, test7, test8, addTest;
		test1 = new String();
		test2 = new String();
		test3 = new String();
		test4 = new String();
		test5 = new String();
		test6 = new String();
		test7 = new String();
		test8 = new String();
		addTest = new String();
		
		test1 = r1.toString();
		test2 = r2.toString();
		test3 = r3.toString();
		test4 = r4.toString();
		test5 = r5.toString();
		test6 = r6.toString();
		test7 = r7.toString();
		test8 = r8.toString();
		
		System.out.println("getString Method Test (Rationals are in reduced, normalized form)");
		System.out.println("------------------------------");
		System.out.println("r1: " + test1);
		System.out.println("r2: " + test2);
		System.out.println("r3: " + test3);
		System.out.println("r4: " + test4);
		System.out.println("r5: " + test5);
		System.out.println("r6: " + test6);
		System.out.println("r7: " + test7);
		System.out.println("r8: " + test8 + "\n");


		System.out.println("Addition (Reduction and normalization performed 1st)");
		System.out.println("------------------------------");
		System.out.println(test2 + " + " + test4 + " = " + (Rational.add(r2, r4)).toString());
		System.out.println(test2 + " + " + test3 + " = " + (Rational.add(r2, r3)).toString());
		System.out.println(test3 + " + " + test5 + " = " + (Rational.add(r3, r5)).toString());
		System.out.println(test4 + " + " + test7 + " = " + (Rational.add(r4, r7)).toString());
		System.out.println(test5 + " + " + test8 + " = " + (Rational.add(r5, r8)).toString());
		System.out.println(test6 + " + " + test1 + " = " + (Rational.add(r6, r1)).toString());
		System.out.println(test7 + " + " + test2 + " = " + (Rational.add(r7, r2)).toString());
		System.out.println(test8 + " + " + test3 + " = " + (Rational.add(r8, r3)).toString());
		System.out.println(test1 + " + " + test5 + " = " + (Rational.add(r1, r5)).toString());
		System.out.println(test2 + " + " + test6 + " = " + (Rational.add(r2, r6)).toString() + "\n");

		System.out.println("Subtraction (Reduction and normalization performed 1st)");
		System.out.println("------------------------------");
		System.out.println(test2 + " - " + test4 + " = " + (Rational.sub(r2, r4)).toString());
		System.out.println(test2 + " - " + test3 + " = " + (Rational.sub(r2, r3)).toString());
		System.out.println(test3 + " - " + test5 + " = " + (Rational.sub(r3, r5)).toString());
		System.out.println(test4 + " - " + test7 + " = " + (Rational.sub(r4, r7)).toString());
		System.out.println(test5 + " - " + test8 + " = " + (Rational.sub(r5, r8)).toString());
		System.out.println(test6 + " - " + test1 + " = " + (Rational.sub(r6, r1)).toString());
		System.out.println(test7 + " - " + test2 + " = " + (Rational.sub(r7, r2)).toString());
		System.out.println(test8 + " - " + test3 + " = " + (Rational.sub(r8, r3)).toString());
		System.out.println(test1 + " - " + test5 + " = " + (Rational.sub(r1, r5)).toString());
		System.out.println(test2 + " - " + test6 + " = " + (Rational.sub(r2, r6)).toString() + "\n");
		
		System.out.println("Multiplication (Reduction and normalization performed 1st)");
		System.out.println("------------------------------");
		System.out.println(test2 + " * " + test4 + " = " + (Rational.mult(r2, r4)).toString());
		System.out.println(test2 + " * " + test3 + " = " + (Rational.mult(r2, r3)).toString());
		System.out.println(test3 + " * " + test5 + " = " + (Rational.mult(r3, r5)).toString());
		System.out.println(test4 + " * " + test7 + " = " + (Rational.mult(r4, r7)).toString());
		System.out.println(test5 + " * " + test8 + " = " + (Rational.mult(r5, r8)).toString());
		System.out.println(test6 + " * " + test1 + " = " + (Rational.mult(r6, r1)).toString());
		System.out.println(test7 + " * " + test2 + " = " + (Rational.mult(r7, r2)).toString());
		System.out.println(test8 + " * " + test3 + " = " + (Rational.mult(r8, r3)).toString());
		System.out.println(test1 + " * " + test5 + " = " + (Rational.mult(r1, r5)).toString());
		System.out.println(test2 + " * " + test6 + " = " + (Rational.mult(r2, r6)).toString() + "\n");
		
		System.out.println("Division (Reduction and normalization performed 1st)");
		System.out.println("------------------------------");
		System.out.println(test2 + " / " + test4 + " = " + (Rational.div(r2, r4)).toString());
		System.out.println(test2 + " / " + test3 + " = " + (Rational.div(r2, r3)).toString());
		System.out.println(test3 + " / " + test5 + " = " + (Rational.div(r3, r5)).toString());
		System.out.println(test4 + " / " + test7 + " = " + (Rational.div(r4, r7)).toString());
		System.out.println(test5 + " / " + test8 + " = " + (Rational.div(r5, r8)).toString());
		System.out.println(test6 + " / " + test4 + " = " + (Rational.div(r6, r4)).toString());
		System.out.println(test7 + " / " + test2 + " = " + (Rational.div(r7, r2)).toString());
		System.out.println(test8 + " / " + test3 + " = " + (Rational.div(r8, r3)).toString());
		System.out.println(test1 + " / " + test5 + " = " + (Rational.div(r1, r5)).toString());
		System.out.println(test2 + " / " + test6 + " = " + (Rational.div(r2, r6)).toString() + "\n");
				
	
		System.out.println("Comparison Operators (Reduction and normalization performed 1st)");
		System.out.println("------------------------------");
		
		boolean isEqual;
		//isEqual = r4.equals(r3);
		System.out.println(test3 + " and " + test4 + "? ");
		
		isEqual = r4.equals(r3);
		System.out.println(" = : " + isEqual);

		boolean isLess;
		isLess = r3.less(r4); // is r3 less than r4
		System.out.println(" < : " + isLess);

		boolean isGreater;
		isGreater = r3.greater(r4); // is r3 greater than r4
		System.out.println(" > : " + isGreater + "\n");
		
		
		
		System.out.println(test5 + " and " + test6 + "? ");
		isEqual = r5.equals(r6);
		System.out.println(" = : " + isEqual);

		isLess = r5.less(r6);
		System.out.println(" < : " + isLess);

		isGreater = r5.greater(r6);
		System.out.println(" > : " + isGreater + "\n");
		
		
		
		System.out.println(test3 + " and " + test5 + "? ");
		isEqual = r3.equals(r5);
		System.out.println(" = : " + isEqual);

		isLess = r3.less(r5);
		System.out.println(" < : " + isLess);

		isGreater = r3.greater(r5);
		System.out.println(" > : " + isGreater + "\n");

	}

}
