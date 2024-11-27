# LAB-SHEET-6
## How to Run the Code

### Clone the repository:
```bash
git clone https://github.com/Kritika268/Lab-Sheet-6
cd Lab-Sheet-6
```
### Question 1
To Run part 1(Binary Trees):
```bash
cd Trees
javac BinaryTree.java
java BinaryTree
```
##### Output for given test case `insert(10), insert(5), insert(15)`
```bash
In-order traversal: 5 10 15 
Pre-order traversal: 10 5 15
Post-order traversal: 5 15 10
```
To Run part 2(Binary Search Trees):
```bash
cd Trees
javac BinarySearchTree.java
java BinarySearchTree
```
##### Output for given test case `insert(10), insert(5), insert(15)`
```bash
In-order traversal: 5 10 15 
Searching for 15: true
Searching for 25: false
In-order traversal after deletion: 5 10 15
```

To Run part 3(AVL Trees):
```bash
cd Trees
javac AVLTree.java
java AVLTree
```
##### Output for given test case `insert(30), insert(20), insert(10)`
```bash
Root after balancing: 10 20 30 
```
### Question 2
To Run Question 2:
```bash
cd Graphs/Graphs
javac Graph1.java 
java Graph1
```
##### Output for given test case

| Test Case   |     Input   | Output   |
|-------------|-------------|-------------|
| Graph BFS Traversal| addEdge(A, B), addEdge(A, C), addEdge(B, D), BFS(A)| A B C D 
|
| Dijkstra's Algorithm| addEdge(A, B, 1), addEdge(B, C, 2), addEdge(A, C, 4), shortestPath(A, C)| 1|
| Prim’s Algorithm| addEdge(A, B, 1), addEdge(B, C, 2), addEdge(A, C, 3)| 1|



### Question 3
To Run Question 3:
```bash
cd UI Interface
javac GraphVisualizer.java
java GraphVisualizer
```
##### Output 
![Graph Visualizer](/image.png)
