package day3.InnerClass;

public class BankAccount {
    private double saldo;

    public BankAccount(double saldo) {this.saldo = saldo;}


        public class Transaction {
            private double saldo;

            public Transaction( double saldo){
                this.saldo = saldo;
            }

            public void hitungTotal () {
                System.out.println("Transaksi succes, saldo anda saat ini = " + saldo);
            }


        }
        public static void main(String[] args) {
            // masukan saldong dengan nilai awal 1000
            BankAccount bankAccount = new BankAccount(1000);
            // buat objek transaction dari iinerClass dan lakukan transaksi gope
            BankAccount.Transaction transaction = bankAccount.new Transaction(500);
            // panggil methode
            transaction.hitungTotal();
        }
}
