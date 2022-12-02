package Logical_Programs

import java.util.Arrays

class Compare_2integer {
	def static void main(String[] args) {
		var int[] s = #[40, 50, 60]
		var int[] s1 = #[10, 20, 30]
		var int[] s2 = #[10, 100, 1000]
		System.out.println(Arrays.equals(s, s1))
		System.out.println(Arrays.equals(s2, s1))
	}
}
