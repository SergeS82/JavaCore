����������� �������������� ���������� � ���������� Java:
��� ����������:	    ����������      ������������ ���:	�������� ������     ��������:
                    ����������:
                                                                ������ ������:
Supplier<T>         0               T	                get	                ������ �� ��������� � ���������� ��������� (����������)
Consumer<T>         1               (T)	                void accept	        ��������� 1 �������� � ������ �� ���������� (�������������)
BiConsumer<T, U>	2               (T, U)	            void accept	        ��������� 2 ��������� � ������ �� ���������� (�������� ������������)
Predicate<T>	    1               (T)	                boolean	test	    ��������� 1 �������� � ���������� true-false (�������������)
BiPredicate<T, U>	2               (T, U)	            boolean	test	    ��������� 2 ��������� � ���������� true-false (�������� ������������)
    �������: ������������������ ������� (Exercise1425)
Function<T, R>	    1               (T)	R	            apply	            ��������� 1 �������� � ���������� ��������� ������� ���� (���������)
BiFunction<T, U, R>	2               (T, U)	            R apply	            ��������� 2 �������� � ���������� ��������� ������� ���� (�������� ��������)
UnaryOperator<T>	1               (T)	T	            apply	            ��������� 1 �������� � ���������� ��������� ������ �� ���� (���������)
BinaryOperator<T>	2               (T, T)	            T apply	            ��������� 2 ��������� � ���������� ��������� ������ �� ���� (�������� ��������)

4 ���� method reference:
-   ���::����������� �����
    Consumer<List<Integer>> methodRef = Collections::sort; // method reference
    Consumer<List<Integer>> lambda = l -> Collections.sort(l); // lambda-expression
-   ���������� ������::����� �������
    String str = "abc";
    Predicate<String> methodRef = str::startsWith; // method reference
    Predicate<String> lambda = s -> s.startsWith(s); // lambda-expression
-   ���::����� �������
    Function<Object,String> f1 = String::valueOf;
    Function<Object,String> f2 = (obj)-> (obj == null) ? "null" : obj.toString();
-   ���::����������� �����
    Supplier<String> methodRef = String::new;
    Supplier<String> lambda = ()->new String();
