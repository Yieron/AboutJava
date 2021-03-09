package BrooklynNets;

public class ShowNumber {
    /**
     * 显示九九乘法表
     */
    public static void showNineNineForm() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + j * i + "\t");
            }
            System.out.println();
        }
    }


    /**
     * 展示奇数
     * 1
     * 1	3
     * 1	3	5
     * 1	3	5	7
     */
    public static void showOdd() {
        for (int i = 1; i < 9; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j <= i; j++) {
                    if (j % 2 != 0) {
                        String b = String.valueOf(j);
                        System.out.print(b + "\t");
                    }
                }
            }
            System.out.println();
        }
    }
}
