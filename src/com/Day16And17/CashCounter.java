package com.Day16And17;

/*Desc -> Create a Program which creates Banking Cash Counter where people
come in to deposit Cash and withdraw Cash. Have an input panel to add people
to Queue to either deposit or withdraw money and dequeue the people. Maintain
the Cash Balance.
b. I/P -> Panel to add People to Queue to Deposit or Withdraw Money and dequeue
c. Logic -> Write a Queue Class to enqueue and dequeue people to either deposit
or withdraw money and maintain the cash balance
d. O/P -> True or False to Show Arithmetic Expression is balanced or not.
*/

public class CashCounter {
	// class Node
		class Person {
			Person nextPerson;// Node ref;
			int money;
			int bankBalance = 1000;

			Person(int money) {
				this.money = money;
				noOfCustomers++;
			}
		}

		Person head;
		static int noOfCustomers;

		public boolean isEmpty() {
			if (head == null) {
				return true;
			}
			return false;
		}

		private void enqueue(int money) {
			Person person = new Person(money);
			noOfCustomers--; // remove person after work done
			if (isEmpty()) {
				head = person;
				head = person;
				head.bankBalance += head.money;
				noOfCustomers++;
				return;
			}

			// temp
			Person currPerson = head;
			while (currPerson.nextPerson != null) {
				currPerson = currPerson.nextPerson;

			}

			currPerson.nextPerson = new Person(money);
			currPerson.nextPerson.bankBalance += currPerson.nextPerson.money;

		}

		public void dequeue(Person head) {
			// deleteFirst
			if (isEmpty()) {
				return;

			}
			Person person = this.head = head = head.nextPerson;
			noOfCustomers--;

		}

		public static int noOfPersonInQueue() {
			System.out.println();
			return noOfCustomers;

		}

		public static void main(String[] args) {
			CashCounter cashCounter = new CashCounter();
			cashCounter.enqueue(500);
			cashCounter.enqueue(1000);
			cashCounter.enqueue(200);
			cashCounter.dequeue();
			System.out.println(noOfPersonInQueue());

		}


}
