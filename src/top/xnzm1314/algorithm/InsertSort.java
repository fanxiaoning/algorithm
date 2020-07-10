package top.xnzm1314.algorithm;

import top.xnzm1314.common.IPrint;

/**
 * @description: 插入排序
 * @author: fanxiaoning
 * @data: 2020/7/10
 * @since v1.0.0
 **/
public class InsertSort implements IPrint {

    /**
     * 插入排序算法
     * @param arr
     */
    private static  void insertSort(int[] arr){

        //从无序序列中取出元素
        for (int i = 1; i <arr.length-1 ; i++) {
             int temp = arr[i];
             //遍历有序序列，和无序中的元素进行比较
            int j;
            for (j = i-1; j >=0 && arr[j]>temp ; j--) {
                  arr[j+1] = arr[j];
            }
            arr[j+1] = temp;
        }
    }

    public static void  PrintInsertSort(int[] arr){
        System.out.println("************插入排序************");
        System.out.println("排序前：");
        IPrint.display(arr);
        System.out.println("排序后：");
        insertSort(arr);
        IPrint.display(arr);
    }
}
