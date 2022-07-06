Стандартные функциональные интерфейсы в библиотеке Java:
Имя интерфейса:	    Количество      Возвращаемый тип:	Название абстра     Описание:
                    параметров:
                                                                ктного метода:
Supplier<T>         0               T	                get	                ничего не принимает и возвращает результат («поставщик»)
Consumer<T>         1               (T)	                void accept	        принимает 1 параметр и ничего не возвращает («потребитель»)
BiConsumer<T, U>	2               (T, U)	            void accept	        принимает 2 параметра и ничего не возвращает («двойной потребитель»)
Predicate<T>	    1               (T)	                boolean	test	    принимает 1 параметр и возвращает true-false («проверяльщик»)
BiPredicate<T, U>	2               (T, U)	            boolean	test	    принимает 2 параметра и возвращает true-false («двойной проверяльщик»)
    Примеры: Последовательность условий (Exercise1425)
Function<T, R>	    1               (T)	R	            apply	            принимает 1 параметр и возвращает результат другого типа («функция»)
BiFunction<T, U, R>	2               (T, U)	            R apply	            принимает 2 параметр и возвращает результат другого типа («двойная функция»)
UnaryOperator<T>	1               (T)	T	            apply	            принимает 1 параметр и возвращает результат такого же типа («оператор»)
BinaryOperator<T>	2               (T, T)	            T apply	            принимает 2 параметра и возвращает результат такого же типа («двойной оператор»)

4 типа method reference:
-   Тип::статический метод
    Consumer<List<Integer>> methodRef = Collections::sort; // method reference
    Consumer<List<Integer>> lambda = l -> Collections.sort(l); // lambda-expression
-   конкретный объект::метод объекта
    String str = "abc";
    Predicate<String> methodRef = str::startsWith; // method reference
    Predicate<String> lambda = s -> s.startsWith(s); // lambda-expression
-   Тип::метод объекта
    Function<Object,String> f1 = String::valueOf;
    Function<Object,String> f2 = (obj)-> (obj == null) ? "null" : obj.toString();
-   Тип::статический метод
    Supplier<String> methodRef = String::new;
    Supplier<String> lambda = ()->new String();
