package SynThread;

import java.util.Scanner;

class Account {
    int bal;

    Account(int bal) {
        this.bal = bal;

    }

    // sufficient balance
    boolean isSufficient(int w) {
        if (bal >= w) {
            return true;
        } else {
            return false;
        }
    }

    // withdraw amount
    public void withdraw(int w, String name) {
        bal -= w;
        System.out.println(name + " withdrew " + w + "\n Remaining balance: " + bal);
        System.out.println("-------------Successfull Withdrawl---------------");

    }
}

class Customer implements Runnable {
    Account ac;
    String name;

    Customer(Account ac, String name) {
        this.ac = ac;
        this.name = name;
    }

    public void run() {
        synchronized(System.in) {
            Scanner s1 = new Scanner(System.in);
            System.out.print("Enter amount to withdraw for " + name + ": ");
            int amt = s1.nextInt();
            if (ac.isSufficient(amt)) {
                ac.withdraw(amt, name);
            } else {
                System.out.println("Insufficient Balance for " + name);
            }
        }
    }
}

public class Threadsyn {
    public static void main(String[] args) {
        Account ac = new Account(1000);
        Account ac2 = new Account(2000);

        Customer c1 = new Customer(ac, "John");
        Customer c2 = new Customer(ac2, "Doe");

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);

        t1.start();
        t2.start();
    }
}
