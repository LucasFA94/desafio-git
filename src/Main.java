import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int list[] = new int[3];
        for(int i=0; i < list.length; i++){
            System.out.printf("Digite o valor, para a posição %d: ", i);
            list[i] = sc.nextInt();
        }
        Arrays.sort(list);
        System.out.printf("A soma de %d com %d é igual a %d", list[1], list[2], (list[1]+list[2]));
    }
}