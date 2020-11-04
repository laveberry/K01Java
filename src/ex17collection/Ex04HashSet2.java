package ex17collection;

import java.util.HashSet;

import common.person;

public class Ex04HashSet2 extends person{
	
	public static void main(String[] args) {
		
		HashSet<person> hashSet = new HashSet<person>();
		
		person p1 = new person("정우성1", 30);
		person p2 = new person("정우성2", 30);
		person p3 = new person("정우성3", 30);
		
		hashSet.add(p1);
		hashSet.add(p2);
		boolean b = hashSet.add(p3);
		System.out.println("p3 객체 저장여부:"+ b);
		
		System.out.println("HashSet에 저장된 객체수:"+ hashSet.size());
	}
}
