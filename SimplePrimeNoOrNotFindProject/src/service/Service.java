package service;

import dao.Dao;

public class Service {
	
	public void m1() {
		Dao dd=new Dao();
		int n=dd.m1();
		
		if(n==1) {
			System.out.println("NO");
			return;
		}
		
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}

}
