package module15;

import java.util.*;

public class MemoryLeakExample {

    // �����, ����������� ����������� ���������
    static class CyclicCollection {
        private final List<byte[]> list = new ArrayList<>(10);

        CyclicCollection() {
            // ������ ~10Mb ������
            for (int i = 0; i < 10; i++) {
                list.add(new byte[1024 * 1024]);
            }
        }

        Element getElement(int index) {
            // ���������� ���� �� ������ ���������, ����������
            // � ������. � �������� ������� ������
            // ������� �� ������� �� 10. ����� ������� ��������
            // ����������� ����� ��������, ��� � ���������
            // ����������� ���������� ������������� ���������.
            return new Element(list.get(index % 10));
        }


        // ���������� �����, �������� � ����
        // ������� ���������

    }

    // ������ �� �������� �.�. ���� ��� static ������� ������ �����
    // ... ��� ������ ������ CyclicCollection ������ �� �����
    static class Element {
        final byte[] data;
        Element(byte[] data) {
            this.data = data;
        }
    }

    public static void main(String[] args) throws Exception {
        System.in.read();
        System.out.println("Started!");
        // ������, � ������� ����� ������� �� ������ ��������
        // �� ��� �� ��������� ���������
        List<Element> list = new LinkedList<>();
        for (int i = 0; i < 350; i++) {
            CyclicCollection collection = new CyclicCollection();
            list.add(collection.getElement(i));
            Thread.sleep(100);
        }
        System.out.println("Finished!");
    }
}
