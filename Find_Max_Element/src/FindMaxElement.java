import java.util.Scanner;

public class FindMaxElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hàng của ma trận: ");
        int rows = scanner.nextInt();

        System.out.print("Nhập số cột của ma trận: ");
        int columns = scanner.nextInt();

        double[][] matrix = new double[rows][columns];

        System.out.println("Nhập giá trị cho ma trận:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Phần tử [" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix[i][j] = scanner.nextDouble();
            }
        }

        double maxValue = matrix[0][0];
        int maxRow = 0;
        int maxColumn = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] > maxValue) {
                    maxValue = matrix[i][j];
                    maxRow = i;
                    maxColumn = j;
                }
            }
        }

        System.out.println("Ma trận vừa nhập:");
        displayMatrix(matrix);

        System.out.println("Phần tử lớn nhất có giá trị là " + maxValue +
                " và tọa độ là [" + (maxRow + 1) + "][" + (maxColumn + 1) + "].");
    }

    // Phương thức hiển thị ma trận
    private static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
