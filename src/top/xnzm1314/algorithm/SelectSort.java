package top.xnzm1314.algorithm;

import top.xnzm1314.common.IPrint;

/**
 * @description: 选择排序
 * @author: fanxiaoning
 * @data: 2020/7/10
 * @since v1.0.0
 **/
public class SelectSort {

    /**
     * 选择排序算法
     * @param arr
     */
    private static  void selectSort(int[] arr){

        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = i+1; j <arr.length; j++) {
                 if(arr[i]>arr[j]){
                     int temp = arr[i];
                     arr[i] = arr[j];
                     arr[j] = temp;
                 }
            }
        }

    }

    public static void  PrintSelectSort(int[] arr){
        System.out.println("************选择排序************");
        System.out.println("排序前：");
        IPrint.display(arr);
        System.out.println("排序后：");
        selectSort(arr);
        IPrint.display(arr);
    }
}
