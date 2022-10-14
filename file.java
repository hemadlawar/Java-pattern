import java.util.Iterator;

public class makeApattern {
	/*
	Q/ write a Program to generate the following  Output (in this given layout) using loops
	1    10    11   20
	2    9     12   19
	3    8     13   18
	4    7     14   17
	5    6     15   16
	6    5     16   15
	7    4     17   14
	8    3     18   13
	9    2     19   12
	10   1     20   11
	  */
	public static void main(String[] args) {
		int num=10;
	for (int i = 1; i <=10; i++) {
		System.out.println(i+"\t"+num+"\t"+(i+10)+"\t"+(num+10));
		num=num-1;
	}

	}

}
