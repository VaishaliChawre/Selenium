package Logical_Programs

import java.util.Scanner

class Factorial_programs {
	def static void main(String[] args) {
		System::out.println("Enter the number")
		var Scanner s = new Scanner(System::in)
		var int usernum = s.nextInt()
		// from user 5
		var int Factorial = 1
		// 5>1 
		for (var int i = usernum; i >= 1; i--) {
			Factorial = Factorial * i // 5*1=5
			// 5       5*4=20   i--=4,3,2,1;
			// 20      20*3=60
			// 60        60*2=120
			// 120      120*1=120   factoral of 5 is 120.
		}
		System::out.println(Factorial)
	}
}
