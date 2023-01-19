// 2. Напишите программу, чтобы проверить, 
// являются ли две данные строки вращением друг друга (вхождение в обратном порядке).

public class ProgramMirror {
    class StringRotation
{
    static boolean areRotations(String str1, String str2)
    {
        return (str1.length() == str2.length()) &&
               ((str1 + str1).indexOf(str2) != -1);
    }

    public static void main (String[] args)
    {
        String str1 = "AACCC";
        String str2 = "CCAAA";
  
        if (areRotations(str1, str2))
            System.out.println("Строки зеркальные друг другу");
        else
            System.out.printf("Строки не зеркальные друг другу");
    }
}
  
}
