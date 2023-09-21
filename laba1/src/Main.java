import java.util.Scanner;
public class Main {
    public interface AnonBase {
        void set();
        void get();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AnonBase TypeAccount = new AnonBase() {
            int id;
            public String type;
            @Override
            public void set() {
                System.out.print("\nВведите ID типа: ");
                this.id=sc.nextInt();
                sc.nextLine();
                System.out.print("Введите тип счета: ");
                this.type =sc.nextLine();
            }
            @Override
            public void get() {System.out.println("\nID: "+this.id+"\nТип счета:"+
                    this.type);}
        };
        AnonBase Bank = new AnonBase() {
            int id;
            String namefull, nameshort,inn,bik,coracc,acc,city;
            @Override
            public void set() {
                System.out.print("\nВведите ID банка: ");
                this.id=sc.nextInt();
                sc.nextLine();
                System.out.print("Введите полное название банка: ");
                this.namefull =sc.nextLine();
                System.out.print("Введите короткое название банка: ");
                this.nameshort =sc.nextLine();
                System.out.print("Введите ИНН банка: ");
                this.inn =sc.nextLine();
                System.out.print("Введите БИК банка: ");
                this.bik =sc.nextLine();
                System.out.print("Введите номер корсчета: ");
                this.coracc =sc.nextLine();
                System.out.print("Введите номер банковского счета: ");
                this.acc =sc.nextLine();
                System.out.print("Введите город: ");
                this.city =sc.nextLine();
            }
            @Override
            public void get() {
                System.out.println("\nID: "+this.id+"\nПолное название банка:"+this.namefull +"\nКороткое название банка:"+this.nameshort+
                        "\nИНН банка:"+this.inn+"\nБИК банка:"+this.bik+"\nНомер корсчета:"+this.coracc+
                        "\nНомер банковского счета:"+this.acc+"\nГород:"+this.city);
            }
        };
        AnonBase Aggrement = new AnonBase() {
            int id;
            String number, dataopen,dataclouse,note;
            @Override
            public void set() {
                System.out.print("\nВведите ID договора: ");
                this.id=sc.nextInt();
                sc.nextLine();
                System.out.print("Введите номер договора: ");
                this.number=sc.nextLine();
                System.out.print("Введите дату заключения договора: ");
                this.dataopen =sc.nextLine();
                System.out.print("Введите дату закрытия договора: ");
                this.dataclouse =sc.nextLine();
                System.out.print("Введите пояснения: ");
                this.note=sc.nextLine();
            }
            @Override
            public void get() {System.out.println("\nID: "+this.id+"\nНомер договора: "+
                    this.number+"\nДата заключения договора:"+this.dataopen +"\nДата закрытия договора:"+
                    this.dataclouse +"\nПояснение:"+ this.note);}
        };
        AnonBase Account = new AnonBase(){
            public String number;
            public int id, typeid,bankid,agrementid;
            @Override
            public void set() {
                System.out.print("\nВведите ID счета: ");
                this.id =sc.nextInt();
                System.out.print("Введите ID типа счета: ");
                this.typeid =sc.nextInt();
                System.out.print("Введите ID банка: ");
                this.bankid =sc.nextInt();
                System.out.print("Введите ID договора: ");
                this.agrementid=sc.nextInt();
                this.number=sc.nextLine();
                System.out.print("Введите номер инвестиционного счета: ");
                this.number=sc.nextLine();
            }
            @Override
            public void get() {
                System.out.print("\nID: " + this.id + "\nID типа счата: " + this.typeid + "\nID банка: "+ this.bankid + "\nID договора: " + this.agrementid+ "\nНомер инвестиционного счета: " + this.number);
            }
        };
        TypeAccount.set();
        TypeAccount.get();
        Bank.set();
        Bank.get();
        Aggrement.set();
        Aggrement.get();
        Account.set();
        Account.get();
    }}
