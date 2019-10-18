/**
 * @author yindong
 * @version 0.0.1
 * @
 */
public class Main {

    public static void main(String[] args) {
        showNineNineForm();
        showRect();
        showTriangle();
        showParallelogram();
        showDiamond(8);
        showOdd();
    }

    private static void showDiamond(int size) {
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

    private static void showParallelogram() {
        for (int i = 1; i <= 5; i++) {
            //填充空格
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            //内层循环 每次打印一个*
            for (int k = 1; k <= 5; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void showTriangle() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; i <= j; j--)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            for (int j = 1; j < i; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    private static void showRect() {
        for (int i = 1; i <= 5; i++) {
            System.out.print("*");
            for (int j = 1; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void showNineNineForm() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + j * i + "\t");
            }
            System.out.println("");
        }
    }

    /**
     * 展示奇数
     * 1
     * 1	3
     * 1	3	5
     * 1	3	5	7
     */
    private static void showOdd() {
        for (int i = 1; i < 9; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j <= i; j++) {
                    if (j % 2 != 0) {
                        String b = String.valueOf(j);
                        System.out.print(b + "\t");
                    }
                }
            }
            System.out.println("");
        }
    }


}
