// Lab Assignment 2 - Data Structures (Advanced Array and String Operations)
// Objective:
// This lab focuses on implementing and analyzing advanced operations on multi-dimensional arrays and strings.
// Tasks include:
// 1. Performing row-wise and column-wise operations on 2D arrays, along with matrix transpose.
// 2. Implementing Knuth-Morris-Pratt (KMP) string pattern matching and Run Length Encoding (RLE) for string compression.
// 3. Analyzing the time and space complexities of each algorithm.

import java.util.ArrayList;
import java.util.List;

class TwoDimensionalArray {
    private List<List<Integer>> array;

    public TwoDimensionalArray(int rows, int cols) {
        array = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < cols; j++) {
                row.add(0);
            }
            array.add(row);
        }
    }

    public void insertRow(int rowIndex, List<Integer> values) {
        if (rowIndex < 0 || rowIndex > array.size()) {
            System.out.println("Invalid row index");
            return;
        }
        array.add(rowIndex, new ArrayList<>(values));
        System.out.println("Row inserted at index " + rowIndex + ": " + values);
    }

    public void insertColumn(int colIndex, List<Integer> values) {
        if (colIndex < 0 || colIndex > array.get(0).size()) {
            System.out.println("Invalid column index");
            return;
        }
        for (int i = 0; i < array.size(); i++) {
            array.get(i).add(colIndex, values.get(i));
        }
        System.out.println("Column inserted at index " + colIndex + ": " + values);
    }

    public void deleteRow(int rowIndex) {
        if (rowIndex < 0 || rowIndex >= array.size()) {
            System.out.println("Invalid row index");
            return;
        }
        List<Integer> deletedRow = array.remove(rowIndex);
        System.out.println("Row deleted at index " + rowIndex + ": " + deletedRow);
    }

    public void deleteColumn(int colIndex) {
        if (colIndex < 0 || colIndex >= array.get(0).size()) {
            System.out.println("Invalid column index");
            return;
        }
        for (List<Integer> row : array) {
            row.remove(colIndex);
        }
        System.out.println("Column deleted at index " + colIndex);
    }

    public void traverse() {
        System.out.println("2D Array Traversal:");
        for (List<Integer> row : array) {
            System.out.println(row);
        }
    }

    public void transpose() {
        List<List<Integer>> transposed = new ArrayList<>();
        int cols = array.get(0).size();
        int rows = array.size();

        for (int i = 0; i < cols; i++) {
            List<Integer> newRow = new ArrayList<>();
            for (int j = 0; j < rows; j++) {
                newRow.add(array.get(j).get(i));
            }
            transposed.add(newRow);
        }

        System.out.println("Transposed Matrix:");
        for (List<Integer> row : transposed) {
            System.out.println(row);
        }
    }
}

class StringAlgorithms {
    public int kmpPatternSearch(String text, String pattern) {
        int[] lps = computeLPSArray(pattern);
        int i = 0, j = 0;

        while (i < text.length()) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            }
            if (j == pattern.length()) {
                System.out.println("Pattern found at index " + (i - j));
                return i - j;
            } else if (i < text.length() && text.charAt(i) != pattern.charAt(j)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
        System.out.println("Pattern not found");
        return -1;
    }

    private int[] computeLPSArray(String pattern) {
        int[] lps = new int[pattern.length()];
        int length = 0;
        int i = 1;

        while (i < pattern.length()) {
            if (pattern.charAt(i) == pattern.charAt(length)) {
                length++;
                lps[i] = length;
                i++;
            } else {
                if (length != 0) {
                    length = lps[length - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

    public String runLengthEncoding(String text) {
        if (text == null || text.isEmpty()) {
            return "";
        }

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i < text.length(); i++) {
            if (text.charAt(i) == text.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(count).append(text.charAt(i - 1));
                count = 1;
            }
        }
        compressed.append(count).append(text.charAt(text.length() - 1));

        String compressedStr = compressed.toString();
        System.out.println("Run Length Encoded String: " + compressedStr);
        return compressedStr;
    }
}

public class LabSheet2 {
    public static void main(String[] args) {
        System.out.println("Multi-dimensional Array Operations:");
        TwoDimensionalArray array2D = new TwoDimensionalArray(2, 2);
        array2D.insertRow(1, new ArrayList<>(List.of(5, 6)));
        array2D.insertColumn(1, new ArrayList<>(List.of(7, 8, 9)));
        array2D.traverse();
        array2D.transpose();
        array2D.deleteRow(0);
        array2D.deleteColumn(0);
        array2D.traverse();


        System.out.println("\nString Algorithms:");
        StringAlgorithms algorithms = new StringAlgorithms();
        String text = "abxabcabcaby";
        String pattern = "abcaby";
        algorithms.kmpPatternSearch(text, pattern);

        String testString = "aaabbbcccaaa";
        algorithms.runLengthEncoding(testString);
    }
}
