package BrooklynNets;

public class ShowShape {
    /**
     * 显示菱形
     * @param size
     */
    public static void showDiamond(int size) {
        if (size % 2 == 0) {
            size++; // 计算菱形大小
        }
        for (int i = 0; i < size / 2 + 1; i++) {
            for (int j = size / 2 + 1; j > i + 1; j--) {
                System.out.print(" "); // 输出左上角位置的空白
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*"); // 输出菱形上半部边缘
            }
            System.out.println(); // 换行
        }
        for (int i = size / 2 + 1; i < size; i++) {
            for (int j = 0; j < i - size / 2; j++) {
                System.out.print(" "); // 输出菱形左下角空白
            }
            for (int j = 0; j < 2 * size - 1 - 2 * i; j++) {
                System.out.print("*"); // 输出菱形下半部边缘
            }
            System.out.println(); // 换行
        }
    }


    /**
     * 平行四边形
     */
    public static void showParallelogram(int size) {
        for (int i = 1; i <= size; i++) {
            //填充空格
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            //内层循环 每次打印一个*
            for (int k = 1; k <= size; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * 显示正三角形
     * @param size
     */
    public static void showTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = size; i <= j; j--)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            for (int j = 1; j < i; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    /**
     * 展示矩形
     * @param size
     */
    public static void showRect(int size) {
        for (int i = 1; i <= size; i++) {
            System.out.print("*");
            for (int j = 1; j < size; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
