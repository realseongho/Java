import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("은행계좌를 만드시겠습니다? ");
        char yesOrNo = scanner.next().charAt(0);
        if(yesOrNo == 'y'||yesOrNo == 'Y'){
            Account account1 = new Account();
            account1.openAccount();
            while(true){
                System.out.printf("1.입금\n2.출금\n3.잔액 조회\n4.종료\n");
                int choice = scanner.nextInt();
                switch(choice){
                    case 1:
                        account1.deposit();
                        break;
                    case 2:
                        account1.withdraw();
                        break;
                    case 3:
                        account1.print();
                        break;
                    case 4:
                    default:
                        break;
                }
                if(choice!=1&&choice!=2&&choice!=3){break;}
            }
        }
        System.out.println("종료합니다.");
    }

    //1. 주어진 배열에서 특정 요소를 찾아 삭제하여 새로운 배열을 리턴하는 메소드를 만들어 보세요.
    public static int[] deleteElementsFromArray(int arr[], int n){
        int count=0;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] == n) {
                count++;
            }
        }
        int[] result = new int[arr.length-count];
        for(int i=0,j=0;i<arr.length;i++){
            if(arr[i]==n){
                continue;
            }
            result[j++] = arr[i];
        }
        return result;
    }

    //2. 주어진 배열에서 짝수와 홀수의 개수를 찾아주는 메소드를 만들어 보세요.
    public static void findNumOfEvenOdd(int arr[]){
        int even = 0;
        for(int num : arr){
            if(num % 2 == 0){even++;}
        }
        System.out.printf("짝수:%d 홀수:%d",even,arr.length-even);
    }

    //3. 임의의 int 배열이 주어졌을 때 특정 숫자가 포함되어 있는지 여부를 리턴하는 메소드를 만들어 보세요
    public static boolean included(int[] arr, int n){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                return true;
            }
        }
        return false;
    }

    //4. 자동 로또 판매기를 만들어 보세요
    public static void lotto(){
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("로또는 몇 장 구매하십니까? ");
        int times = sc.nextInt();
        System.out.printf("--- 로또 번호 %d장이 자동 생성되었습니다. ---\n",times);
        for(int i = 0; i < times; i++){
            int[] numbers = new int[6];
            numbers[0] = rand.nextInt(45)+1;
            for(int j = 1; j < numbers.length; j++){
                numbers[j] = rand.nextInt(45)+1;
                for(int k = 0; k < j; k++)
                    if(numbers[k] == numbers[j]) j--;
            }
            System.out.printf("%d)",i+1);
            for(int number : numbers)
                System.out.print(" "+number);
            System.out.println();
        }
    }
}
