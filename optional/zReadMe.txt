Методы Optional:
-   get()                       бросает ошибку в Runtime	            возвращает value
-   ifPresent(Consumer c)       ничего не делает	                    вызывает Consumer и передает в него value
-   isPresent()	                возвращает false	                    возвращает true
-   orElse(T other)	            возвращает объект other	                возвращает value
-   orElseGet(Supplier s)	    возвращает результат вызова Supplier	возвращает value
-   orElseThrow(Supplier s)	    бросает ошибку, созданную Supplier	    возвращает value

! Если метод может вернуть null значит следует использовать Optional
! Возможность работать в функциональном стиле
    average(90, 100).ifPresent(System.out::println);