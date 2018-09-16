package HuaWei;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Party {
    public static void main(String[] args) {
        String input = "";
        boolean flag = true;
        while (flag){
            Scanner in = new Scanner(System.in);
            String s = in.nextLine();
            if ("-1,-1".equals(s)){
                flag = false;
            }
            input += s +" ";
        }
        for (Map.Entry<String,Integer> info:getResult(input).entrySet()) {
            System.out.println(info.getKey()+":"+info.getValue());
        }
        getResult(input);
    }

    public static Map<String,Integer> getResult(String input) {
        //初始化
        Map<String,Integer> res = new HashMap<>();
        for (int i = 12; i < 20; i++) {
            String key = "["+i+","+(i+1)+")";
            res.put(key,0);
        }
        //切分输入
        String[] strings = input.split(" ");
        for (int i = 0; i < strings.length-1; i++) {
            String[] split = strings[i].split(",");
            Integer start = Integer.valueOf(split[0]);
            Integer end = Integer.valueOf(split[1]);
            if(start< end){
                for (int j = start; j < end; j++) {
                    String in = "["+j+","+(j+1)+")";
                    res.put(in,(Integer.valueOf(res.get(in))+1));
                }
            }
        }
        return res;
    }
}
