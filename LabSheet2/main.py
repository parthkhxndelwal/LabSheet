# Lab Assignment 2 - Data Structures (Advanced Array and String Operations)
# Objective:
# This lab focuses on implementing and analyzing advanced operations on multi-dimensional arrays and strings.
# Tasks include:
# 1. Performing row-wise and column-wise operations on 2D arrays, along with matrix transpose.
# 2. Implementing Knuth-Morris-Pratt (KMP) string pattern matching and Run Length Encoding (RLE) for string compression.
# 3. Analyzing the time and space complexities of each algorithm.

# TwoDimensionalArray class to handle operations on 2D arrays
class TwoDimensionalArray:
    def __init__(self, rows, cols):
        # Initialize a 2D array with zeros
        self.array = [[0 for _ in range(cols)] for _ in range(rows)]
    
    def insert_row(self, row_index, values):
        # Insert a row at a specific index
        if row_index < 0 or row_index > len(self.array):
            print("Invalid row index")
            return
        self.array.insert(row_index, values)
        print(f"Row inserted at index {row_index}: {values}")
    
    def insert_column(self, col_index, values):
        # Insert a column at a specific index
        if col_index < 0 or col_index > len(self.array[0]):
            print("Invalid column index")
            return
        for i in range(len(self.array)):
            self.array[i].insert(col_index, values[i])
        print(f"Column inserted at index {col_index}: {values}")
    
    def delete_row(self, row_index):
        # Delete a row from the array
        if row_index < 0 or row_index >= len(self.array):
            print("Invalid row index")
            return
        deleted_row = self.array.pop(row_index)
        print(f"Row deleted at index {row_index}: {deleted_row}")
    
    def delete_column(self, col_index):
        # Delete a column from the array
        if col_index < 0 or col_index >= len(self.array[0]):
            print("Invalid column index")
            return
        for row in self.array:
            del row[col_index]
        print(f"Column deleted at index {col_index}")
    
    def traverse(self):
        # Display the entire 2D array
        print("2D Array Traversal:")
        for row in self.array:
            print(row)
    
    def transpose(self):
        # Compute the transpose of the matrix
        transposed = [[self.array[j][i] for j in range(len(self.array))] for i in range(len(self.array[0]))]
        print("Transposed Matrix:")
        for row in transposed:
            print(row)
        return transposed

# StringAlgorithms class for KMP pattern matching and Run Length Encoding
class StringAlgorithms:
    def kmp_pattern_search(self, text, pattern):
        # Knuth-Morris-Pratt (KMP) algorithm for pattern matching
        def compute_lps(pattern):
            # Compute the Longest Prefix Suffix (LPS) array
            lps = [0] * len(pattern)
            j = 0
            i = 1
            while i < len(pattern):
                if pattern[i] == pattern[j]:
                    j += 1
                    lps[i] = j
                    i += 1
                else:
                    if j != 0:
                        j = lps[j - 1]
                    else:
                        lps[i] = 0
                        i += 1
            return lps
        
        # Use the LPS array for pattern matching
        lps = compute_lps(pattern)
        i = j = 0
        while i < len(text):
            if text[i] == pattern[j]:
                i += 1
                j += 1
            if j == len(pattern):
                print(f"Pattern found at index {i - j}")
                return i - j
            elif i < len(text) and text[i] != pattern[j]:
                if j != 0:
                    j = lps[j - 1]
                else:
                    i += 1
        print("Pattern not found")
        return -1

    def run_length_encoding(self, text):
        # Run Length Encoding (RLE) for string compression
        if not text:
            return ""
        
        compressed = []
        count = 1
        for i in range(1, len(text)):
            if text[i] == text[i - 1]:
                count += 1
            else:
                compressed.append(f"{count}{text[i - 1]}")
                count = 1
        compressed.append(f"{count}{text[-1]}")
        
        compressed_str = ''.join(compressed)
        print(f"Run Length Encoded String: {compressed_str}")
        return compressed_str

# Main execution and testing of implemented functions
if __name__ == "__main__":
    # Test Multi-dimensional Array Operations
    print("Multi-dimensional Array Operations:")
    array2D = TwoDimensionalArray(2, 2)
    array2D.insert_row(1, [5, 6])
    array2D.insert_column(1, [7, 8, 9])
    array2D.traverse()
    array2D.transpose()
    array2D.delete_row(0)
    array2D.delete_column(0)
    array2D.traverse()
    
    # Test String Algorithms
    print("\nString Algorithms:")
    algorithms = StringAlgorithms()
    text = "abxabcabcaby"
    pattern = "abcaby"
    algorithms.kmp_pattern_search(text, pattern)
    
    # Run Length Encoding
    test_string = "aaabbbcccaaa"
    algorithms.run_length_encoding(test_string)
