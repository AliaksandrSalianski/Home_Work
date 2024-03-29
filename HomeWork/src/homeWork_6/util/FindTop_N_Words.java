package homeWork_6.util;

import homeWork_6.sort.SortWithStream;

import java.util.*;
/**
В классе реализован метод поиска наиболее употребляемых  N слов
 */
public class FindTop_N_Words {
    /**
     * Метод реализует поиск слов , путем сортировки значений ключей в порядке убывания
     * @param inputMap принимает коллекцию Map
     * @param countOfWordsToFind N
     */
    public static void printTopWords(Map<String, Integer> inputMap, Integer countOfWordsToFind) {
        LinkedHashMap<String, Integer> sortMapByValues = SortWithStream.sortingTheMap(inputMap);
        List<String> listOfValues = new ArrayList<>(sortMapByValues.keySet());
        System.out.printf("В книге топ %d слов являются :\n", countOfWordsToFind);
        for (int i = 0; i <= countOfWordsToFind; i++) {
            String foo = listOfValues.get(i);
            System.out.printf("слово\t\"%s\" \t употребляется \t %d раз(a)  \n", foo, inputMap.get(foo));
        }
    }
}

