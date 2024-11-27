# LAB-SHEET-5
## How to Run the Code

### Clone the repository:
```bash
git clone https://github.com/Kritika268/Lab-Sheet-5
cd Lab-Sheet-5
```
### Question 1
To Run Question 1:
```bash
cd Text Editor
javac TextEditor.java 
java TextEditor
```
### Output for given Test Cases:

| Test Cases      | Input     | Output      |
|-----------------|---------------|---------------|
|Insert Text | insertText(0, "Hello") |  Hello |
| Delete Text  |deleteText(0, 2)| llo |
| Undo Operation | undo()| Hello |
| Redo Operation  |redo()| llo |
| Copy-Paste | copy(0, 2), paste(5)| HelloHe |
------------------

```bash
Current Text: Hello
Current Text: llo
Current Text: Hello
Current Text: llo
Current Text: HelloHe
```
