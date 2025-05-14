
# MiniShell

## תיאור כללי של הפרויקט
זהו פרויקט סימולציה של מעטפת פקודות (Shell) ב-Java. התוכנית מאפשרת למשתמש לבצע פעולות בסיסיות של מערכת קבצים כמו: הצגת תקיה נוכחית, מעבר בין תיקיות, יצירת קבצים ותיקיות, והצגת עזרה.

## הוראות כיצד לקמפל ולהריץ את הקוד
1. יש לוודא ש-Java מותקן במחשב.
2. לקמפל את הקבצים:
   ```bash
   javac src/*.java
   ```
3. להריץ את התוכנית:
   ```bash
   java -cp src MiniShell
   ```

## דוגמה להרצת הפקודות
```
Welcome to MiniShell! Type 'help' for a list of commands.
/your/path > mkdir test
Directory created: test
/your/path > cd test
/your/path/test > touch hello.txt
File created: hello.txt
/your/path/test > ls
hello.txt
/your/path/test > cd ..
/your/path > exit
Goodbye!
```

## הערות בקוד (JavaDoc) שמסבירות כל שיטה
בתוך קבצי הקוד יש הערות מסוג JavaDoc שמסבירות כל שיטה ומטרתה, לדוגמה:

```java
/**
 * מדפיס את התקיה הנוכחית
 */
public void printWorkingDirectory() { ... }

/**
 * מחליף את התקיה הנוכחית לתיקיה נתונה
 * @param name שם התקיה
 */
public void changeDirectory(String name) { ... }
```
