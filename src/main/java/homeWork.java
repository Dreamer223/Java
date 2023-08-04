
import java.util.List;
import java.util.*;
import java.lang.*;

public class homeWork {
    /**
     * Дан текст. Нужно отсортировать слова по длине (по возрастанию) и вывести статистику на экран.
     * Регистр слова не имеет значения. Формат вывода произвольный.
     * Программа-минимум:
     * 1. Слова, состоящие из дефисов, считаем одним словом. Т.е. каких-то - одно слово из 8 символов.
     * 2. Точки и запятые не должны входить в статистику.
     *
     * Доп. задание
     * 1. * Не включать дефис в длину слова. Т.е. каких-то - одно слово из 7 символов.
     *
     * Пример:
     *
     * Это мой первый текст. Он состоит из каких-то тестовых слов и нужен для того, чтобы выполнить тестовое задание GB.
     * Данный текст не несет в себе какого-либо смысла, он просто содержит набор слов.
     *
     * 1 -> [и, в]
     * 2 -> [он, из, gb, не]
     * 3 -> [мой, для]
     * 4 -> [слов, того, себе]
     * 5 -> [текст, нужен, чтобы, несет, набор]
     * ...
     */
    static void printStats(String text) {
        // 1. Split текста, приведение его к нижнему регистру, удаление запятых и точек.
        // 2. Сбор структуры со статистикой.
        Map<Integer, List<String>> stats = new HashMap<>(); // Структура, в которой ключ - длина слова, значение - список таких слов.
        String s = text.replaceAll("\\p{Punct}", "");
        String[] texts = s.split(" ");
        for (int i = 0; i < texts.length; i++) {
            int value = texts[i].length();
            List<String> symbol = new ArrayList<>();
            for (int j = 0; j < texts.length; j++) {
                if(texts[j].length() == value)
                {
                    symbol.add(texts[j]);
                }
            }
            Set<String> set = new HashSet<>(symbol);
            symbol.clear();
            symbol.addAll(set);
            stats.put(value, symbol);
        }
        System.out.println(stats);

    }

    public static void main(String[] args) {
        String texts = "Это мой первый текст. Он состоит из каких-то тестовых слов и нужен для того, чтобы выполнить тестовое задание GB. " +
                "Данный текст не несет в себе какого-либо смысла, он просто содержит набор слов.";
        String text = texts.toLowerCase();
        printStats(text);

    }
}
