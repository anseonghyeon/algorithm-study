package baekjoon.p11720;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = 0;
        int sum = 0;

        n = Integer.parseInt(br.readLine());
        String sLine = br.readLine();
        char[] cLine = sLine.toCharArray();

        for(int i = 0; i < cLine.length; i++){
            sum += cLine[i] - '0';
        }
        bw.write(sum + "\n");
        bw.close();
        br.close();
    }
}
