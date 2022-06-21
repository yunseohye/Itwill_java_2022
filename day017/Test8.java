package com.day017;

class MyThread8 implements Runnable {

	private int bank = 10000; //잔고

	private int getBank() {
		return bank;
	}

	private int drawMoney(int m) {
		bank -= m; //bank = bank - m;
		return m;
	}

	@Override
	public void run() {

		int money_need = 6000; //인출금액
		int money;
		String msg = "";

		try {

			synchronized (this) { 
				/*
				동기화 블럭 
				다른 스레드가 값을 넣으면 또 다른 스레드들이 
				동시에 값을 넣겠다고 들어오는 것을 막는것임.
				안그러면 멀쩡하게 출력되다가 값이 충돌될 때 잔고가 마이너스가 됨.
				*/

				if(getBank()>=money_need) { // 잔고가 6000원보다 많을 경우

					money = drawMoney(money_need);
					msg = "인출 성공!!";

				} else {

					money = 0;
					msg = "인출 실패!!";

				}
			
			System.out.println(Thread.currentThread().getName() +
					msg + ", 인출금액: " + money + ", 잔고: " + getBank());

			}
		} catch (Exception e) {

		}

	}

}


public class Test8 {

	public static void main(String[] args) {

		MyThread8 ob = new MyThread8();

		Thread t1 = new Thread(ob);
		Thread t2 = new Thread(ob);

		t1.start();
		t2.start();

	}

}
