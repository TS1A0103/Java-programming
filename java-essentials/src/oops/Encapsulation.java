package oops;

//Example 1 Person class


//class Person{
//    private String name;
//
//    public String getName() {
//        System.out.println(name);
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//}
//public class Encapsulation {
//    public static void main(String[] args){
//        Person person1 = new Person();
//        person1.setName("Vamsi Krishna");
//        String name = person1.getName();
//
//    }
//}


//bANK ACCOUNT EXAMPLE

//class BankAccount{
//    private double balance = 1;
//    String name;
//    long account_No = 1234564L;
//
//    public double getBalance() {
//
//        return balance;
//    }
//
//    public void setBalance(double balance) {
//        if(balance<=0) {
//            System.out.println("Invalid amount");
//            return;
//        }
//        this.balance = balance;
//
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public long getAccount_No() {
//        return account_No;
//    }
//
//    public void setAccount_No(long account_No) {
//        this.account_No = account_No;
//    }
//}
//public class Encapsulation {
//    public static void main(String[] args){
//        BankAccount acc1 = new BankAccount();
//        acc1.setBalance(-1000);
//        acc1.setName("Vamsi");
//        System.out.println(acc1.getName());
//        System.out.println(acc1.getAccount_No());
//        System.out.println(acc1.getBalance());
//
//
//
//    }
//}


//Example 3 : Read only access of book title

class Book {
    private String title;   // read-only variable

    // Constructor to set the value once
    public Book(String title) {
        this.title = title;
    }

    // Getter (read-only access)
    public String getTitle() {
        return title;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Book book = new Book("Effective Java");

        System.out.println(book.getTitle());

        // book.setTitle("New Title");  Not allowed (no setter)
    }
}
