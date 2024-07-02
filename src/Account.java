import java.util.Scanner;

public class Account {
    String name;
    int date;
    int balance;
    Scanner input = new Scanner(System.in);
    public void deposit() {
        System.out.printf("입금 금액 입력: ");
        int amount = input.nextInt();
        balance += amount;
        System.out.printf("정상적으로 입금되었습니다.\n현재 잔액:%d\n\n", balance);
    }
    public void withdraw() {
        System.out.printf("출금 금액 입력: ");
        int amount = input.nextInt();
        balance -= amount;
        System.out.printf("정상적으로 출금되었습니다.\n현재 잔액:%d\n\n", balance);
    }
    public void print() {
        System.out.printf("현재 잔액:%d\n\n",balance);
    }
    public void openAccount(){
        System.out.printf("예금주명을 입력하세요 : ");
        name = input.nextLine();
        System.out.printf("개설일자 : ");
        date = input.nextInt();
        System.out.printf("초기잔액(원) : ");
        balance = input.nextInt();
        System.out.println("계좌가 정상적으로 개설되었습니다!");
    }
}
