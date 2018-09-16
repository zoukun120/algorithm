package NetEase;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicStampedReference;

public class Main {

    public static void main(String[] args) {
        System.out.println(getString(2,2));

    }

    public static List<char[]> getString(int n,int m){
        List<char[]> result = new ArrayList<>();
        //先拼接出n个a和m个z
        String tempX = "";
        String tempZ = "";
        String tempXZ = "";
        while (n>0){
            tempX += "a";
            n--;
        }
        while (m>0){
            tempZ += "z";
            m--;
        }
        tempXZ =tempX+tempZ;
        System.out.println("tempXZ:"+tempXZ);
        // 再字典排序
        char[] chars = tempXZ.toCharArray();
        System.out.println(chars);
        for (int i = 0; i < chars.length; i++) {
            for (int j = i+1; j < chars.length; j++) {
                System.out.println("chars[i]"+chars[i]);
                System.out.println("chars[j]"+chars[j]);

                if(chars[i]< chars[j]){
                    swap(chars,i,j);
                }
                System.out.println(chars);
                result.add(chars);
            }
        }
        return result;
    }

    public static void swap(char[] str,int i,int j) {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
}
