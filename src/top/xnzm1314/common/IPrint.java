package top.xnzm1314.common;

/**
 * @description: 打印功能接口
 * @author: fanxiaoning
 * @data: 2020/7/10
 * @since v1.0.0
 **/
public interface IPrint {

    /**
     * 遍历打印方法
     * @param arr
     */
     static void display(int[] arr) {
        if (arr != null && arr.length > 0) {
            for (int num :
                    arr) {
                System.out.print(num + " ");
            }
            System.out.println("");
        }
    }
}
