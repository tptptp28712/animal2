package animal2;
import java.util.Scanner;
import java.util.*;
public class animal2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String hobby = scanner.nextLine();
    // ,で区切る
    String[] tokens2 = hobby.split(",");
      for (int i = 0 ; i < tokens2.length; i++){
          String[] tokens = tokens2[i].split(":");
          // 出力
          System.out.println("動物名："+tokens[0]);
          System.out.println("体長："+tokens[1]+"m");
          System.out.println("速度："+tokens[2]+"km/h");
          switch(tokens[0]){
              // 一致したら学名出力
          case "ライオン":
          System.out.println("学名：パンテラ レオ");
          System.out.println("");
            break;
          case "ゾウ":
          System.out.println("学名：ロキソドンタ・サイクロティス");
          System.out.println("");
            break;
          case "パンダ":
          System.out.println("学名：アイルロポダ・メラノレウカ");
          System.out.println("");
            break;
          case "チンパンジー":
          System.out.println("学名：パン・トゥログロディテス");
          System.out.println("");
            break;
          case "シマウマ":
          System.out.println("学名：チャップマンシマウマ");
          System.out.println("");
            break;
            //不一致で学名不明
          default:
          System.out.println("学名：不明");
          System.out.println("");
            break;
}
}
}
}
