package stream.collectors;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;
// ����������� �����������
public class Example04_01 {
    public static void main(String[] args) {
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        Map<Integer, String> map = ohMy.collect(Collectors.toMap(
                String::length, // ���� - ����� �������
                k -> k, // �������� - ���� ������
                (s1, s2) -> s1 + "," + s2, // ����� ������� ���������� ������ �� ����������� �����
                TreeMap::new // ������� Java ���� ���������� ��������� �������������
        )); // {5 = lions,bears, 6 = tigers}
        System.out.println(map.getClass()); // class java.util.TreeMap
    }
}
