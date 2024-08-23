// 큰 수의 법칙
package ch3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Prac3_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 배열 크기
        int m = Integer.parseInt(st.nextToken()); // 더하는 횟수
        int k = Integer.parseInt(st.nextToken()); // 연속으로 더하는 수 제한

        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int sum = 0;
        int last = arr.length - 1;
        while (m != 0) {

            for (int i = 0; i < k; i++) {
                sum += arr[last];
            }
            m -= k;

            sum += arr[last - 1];
            m--;

            if (m < 0) {
                sum -= arr[last] * Math.abs(m);
                m = 0;
            }
        }
        System.out.println(sum);
    }
}
