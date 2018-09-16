package HuaWei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        System.out.println(emliteRepeatStr(input));
    }

    /**
     * 去重
     * @param input
     * @return
     */
    public static String emliteRepeatStr(String input) {
        List<Character> list = new ArrayList<>();

        //遍历，把非去重放在新得数组中
        char[] chars = input.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            boolean flag  = true ;
            for (int j = 0;j < list.size(); j++) {
                if (chars[i]==list.get(j)){//list是否已经存在该字符
                    flag = false;
                }
            }
            if (flag){
                list.add(chars[i]);
            }
        }

        //拼接输出结果
        String res = "";
        for (int i = 0; i < list.size(); i++) {
            res +=list.get(i);
        }
        return res;
    }
}
