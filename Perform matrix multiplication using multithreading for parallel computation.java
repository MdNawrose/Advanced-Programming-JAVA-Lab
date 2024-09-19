class Question {
public static void main(String[] args) {
int[][] matrixA = {
{18, 16, 14},
{12, 10, 8}, 
{6, 4, 2}
};
int[][] matrixB = {
{5, 10, 15},
{20, 25, 30},
{35, 40, 45}
};
int[][] result = multiplyMatrices(matrixA, matrixB);
printMatrix(result);
}
public static int[][] multiplyMatrices(int[][] matrixA, int[][]
matrixB) {
int rowsA = matrixA.length;
int colsA = matrixA[0].length;
int rowsB = matrixB.length;
int colsB = matrixB[0].length;
if (colsA != rowsB) {
throw new IllegalArgumentException("Matrices cannot be multiplied
due to incompatible
dimensions.");
}
int[][] result = new int[rowsA][colsB];
Thread[] threads = new Thread[rowsA];
for (int i = 0; i < rowsA; i++) {
final int row = i;
threads[i] = new Thread(() -> multiplyRowByMatrix(matrixA,
matrixB, result, row));
threads[i].start();
} for (
int i
7
=
0; i
<
rowsA; i++) {
try {
threads[i].join();
} catch (InterruptedException e) {
Thread.currentThread().interrupt();
System.err.println("Thread interrupted: " + e.getMessage());
}
}
return result;
}
private static void multiplyRowByMatrix(int[][] matrixA, int[][]
matrixB, int[][] result, int row) {
int colsA = matrixA[0].length;
int colsB = matrixB[0].length;
for (int j = 0; j < colsB; j++) {
result[row][j] = 0;
for (int k = 0; k < colsA; k++) {
result[row][j] += matrixA[row][k] * matrixB[k][j];
}
}
}
private static void printMatrix(int[][] matrix) {
for (int[] row : matrix) {
for (int element : row) {
System.out.print(element + " ");
}
System.out.println();
}
}
}
