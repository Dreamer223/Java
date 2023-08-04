public class test {
    public static void main(String[] args) {
        String texts = "Это мой первый текст. Он состоит из каких-то тестовых слов и нужен для того, чтобы выполнить тестовое задание GB. " +
                "Данный текст не несет в себе какого-либо смысла, он просто содержит набор слов.";
        countAndPrint(texts);
    }
    public static void countAndPrint (String text)
    {
        String[] s = text.split(" ");
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
