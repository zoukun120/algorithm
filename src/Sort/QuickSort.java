package Sort;

import java.util.List;

/**
 * Created by zk on 2018/8/20
 * 快速排序算法思想和实现步骤：
 * （1）将一个问题分成若干个子问题，并且子问题的解决办法与待解决问题的解决办法相同
 * （2）执行一次循环，达到“左小右大”的目标，直到i等于j
 * （3）再分别循环“左小”，“右大”，达到“左小右大”的目标
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] list = new int[]{25,2,48,66,8,45,89};
        quickSort(list,0,list.length-1);
    }

    public static void quickSort(int[] list,int l,int r){
        if (l<r){
            int i=l , j=r;
            int pivot = list[i];
            while (i!=j){
                while(i<j&&list[j]>=pivot){
                    j--;
                }

                if (i<j){
                    list[i]=list[j];
                    i++;
                }
                while (i<j&&list[i]<pivot){
                    i++;
                }
                if(i<j){
                    list[j]=list[i];
                    j--;
                }
            }
            list[i]=pivot;
            for (int k = 0; k < list.length; k++) {
                System.out.print(list[k]+" ");
            }
            System.out.print(l+","+r+","+pivot);
            System.out.println();
            quickSort(list,l,j-1);
            quickSort(list,i+1,r);
        }
    }
}
