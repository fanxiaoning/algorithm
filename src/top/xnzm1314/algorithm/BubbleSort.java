package top.xnzm1314.algorithm;

import top.xnzm1314.common.IPrint;

/**
 * @description: 冒泡排序
 * @author: fanxiaoning
 * @data: 2020/7/10
 * @since v1.0.0
 **/
public class BubbleSort implements IPrint {

    /**
     * 冒泡排序算法
     * @param arr
     */
      private static  void bubbleSort(int[] arr){

          //控制比较次数
          for (int i = 0; i <arr.length-1 ; i++) {
              //控制比较的元素
              for (int j = 0; j <arr.length-1-i; j++) {
                    if(arr[j]>arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
              }
          }
      }

      public static void  printBubbleSort(int[] arr){
          System.out.println("************冒泡排序************");
          System.out.println("排序前：");
          IPrint.display(arr);
          System.out.println("排序后：");
          bubbleSort(arr);
          IPrint.display(arr);
      }


}
