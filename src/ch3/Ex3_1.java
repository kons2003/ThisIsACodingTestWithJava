// 거스름돈
package ch3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex3_1 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // N
        int cnt = 0; // 최소한의 동전 개수

        // 거슬러 줘야 할 동전의 최소 개수 구하는 코드
        if (n >= 500) { // 500원
            cnt += n / 500;
            n %= 500;
        }
        if (n >= 100) { // 100원
            cnt += n / 100;
            n %= 100;
        }
        if (n >= 50) { // 50원
            cnt += n / 50;
            n %= 50;
        }
        if (n >= 10) { // 10원
            cnt += n / 10;
        }
        
        System.out.println(cnt);
    }
}
