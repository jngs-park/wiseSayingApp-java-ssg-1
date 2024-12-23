package com.ll.exam;

import java.util.Scanner;

public class App {
    public void run() {
        System.out.println("== 명언 SSG ==");

        Scanner sc = new Scanner(System.in);
        // 가장 마지막 명언글의 번호
        int wiseSayingLastId = 0;

        outer:
        while(true) {

            System.out.printf("명령) ");
            String cmd = sc.nextLine().trim();

            switch (cmd) {
                case "등록":
                    System.out.printf("명언 :");
                    String content = sc.nextLine().trim();
                    System.out.printf("작가 :");
                    String autor = sc.nextLine().trim();
                    int id = ++wiseSayingLastId;
                    System.out.printf("%d번 명언이 등록되었습니다. \n", id);
                    break;
                case "종료":
                    break outer;
            }
        }

        sc.close();
    }
}
