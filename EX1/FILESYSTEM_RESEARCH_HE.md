
# 📁 FILESYSTEM_RESEARCH.md

## 🔍 מחקר על מערכת קבצים (File System)

---

### 1. 🗂️ איך יוצרים תיקיה (Directory)?


#### ✅ Terminal (bash):
```bash
mkdir NewFolder
```

📖 משתמשים ב-`mkdir` כדי ליצור תיקיה חדשה עם אותו שם.

---

### 2. 📄 איך יוצרים קובץ?


#### ✅ Terminal (bash):
```bash
touch example.txt
```

📖 יוצר קובץ ריק בשם "example.txt", או מעדכן את תאריך השינוי שלו אם הוא כבר קיים.

---

### 3. 🔍 איך לבדוק אם קובץ או תיקיה קיימים?


#### ✅ Terminal (bash):
```bash
[ -e example.txt ] && echo "הקובץ קיים" || echo "הקובץ לא קיים"
```

📖 בודק אם הקובץ קיים ומדפיס הודעה בהתאם.

---

### 4. 📖 איך קוראים תוכן של קובץ?


#### ✅ Terminal (bash):
```bash
cat example.txt
```

📖 מציג את כל התוכן של הקובץ ישירות בטרמינל.

---

### 5. 📌 מה ההבדל בין File ל-Path?

- `File`: הוא הקובץ עצמו, לדוגמה `example.txt`, שמכיל נתונים.
- `Path`: הוא הנתיב שמצביע על מיקום הקובץ במערכת, לדוגמה `C:\Users\Username\example.txt` או `./example.txt`.

📖 הנתיב הוא "הכתובת", והקובץ הוא "התוכן".


