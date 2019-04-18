package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MobilePhone myPhone = new MobilePhone();
        myPhone.store("Billy", 1921881889);
        myPhone.store("Billy", 1921881889);
        myPhone.store("Sally", 101821782);
        myPhone.store("John", 1221386789);

        myPhone.print();

        myPhone.modify("Billy", "Bartholemue", 1999939439);
        myPhone.modify("Cassandra", "Bartholemue", 1999939439);

        myPhone.print();

        myPhone.remove("Bartholemue");
        myPhone.remove("Cassandra");

        myPhone.print();
    }
}
