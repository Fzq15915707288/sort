package sort;


class binarySearch {

    public static void main(String args[]) {
        int a[] = {1, 8, 12, 15, 16, 21, 30, 35, 39};
        int result = bSearch(a, 10, 9);
        if (result == -1) {
            System.out.println("不存在此元素");
        } else {
            System.out.println(result);
        }
    }

    //进行二分搜索
    public static int bSearch(int[] a, int x, int n) {
        int left = 0;
        int right = n - 1;
        int i = 0, j = 0;

        while (left <= right) {
//            System.out.print("left="+left+" ");
//            System.out.print("right="+right+" ");
            int middle = (left + right) / 2;
//            System.out.print("middle="+middle+" ");
//            System.out.println("a[middle]="+a[middle]+" ");
            if (x == a[middle]) {
                i = j = middle;
                return middle;//找到了的出口
            }
            //交换位置的地方
            if (x > a[middle])
                left = middle + 1;
            else
                right = middle - 1;
        }

        i = right;
        j = left;
        //x<a[0],说明数组中没有比x更小的元素了
        if (x < a[0]) {
            System.out.print("数组中不存在比" + x + "更小的最大元素位置" + ", ");
            System.out.println("大于" + x + "的最小元素位置为" + j);
        }
        //x<a[8],说明数组中没有比x更大的元素了
        else if (x > a[8]) {
            System.out.print("小于" + x + "的最大元素位置为" + i + ", ");
            System.out.println("数组中不存在比" + x + "更大的最小元素位置");
        } else {
            System.out.print("小于" + x + "的最大元素位置为" + i + ", ");
            System.out.println("大于" + x + "的最小元素位置为" + j);
        }
        //未找到x,返回-1
        return -1;
    }

}