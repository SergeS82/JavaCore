������ Optional:
-   get()                       ������� ������ � Runtime	            ���������� value
-   ifPresent(Consumer c)       ������ �� ������	                    �������� Consumer � �������� � ���� value
-   isPresent()	                ���������� false	                    ���������� true
-   orElse(T other)	            ���������� ������ other	                ���������� value
-   orElseGet(Supplier s)	    ���������� ��������� ������ Supplier	���������� value
-   orElseThrow(Supplier s)	    ������� ������, ��������� Supplier	    ���������� value

! ���� ����� ����� ������� null ������ ������� ������������ Optional
! ����������� �������� � �������������� �����
    average(90, 100).ifPresent(System.out::println);