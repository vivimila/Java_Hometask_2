// 3. *Напишите программу, чтобы перевернуть строку с помощью рекурсии.

public class ProgramRecursion {
    public static String reverseStr(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return reverseStr(str.substring(1)) + str.charAt(0);
    }
}
