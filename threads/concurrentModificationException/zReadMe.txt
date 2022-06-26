����� ���������:
    �����                   ���������       1*  2*  3*
-   ConcurrentHashMap       ConcurrentMap	���	���	���
-   ConcurrentLinkedDeque	Deque	        ��	���	���
-   ConcurrentLinkedQueue	Queue	        ��	���	���
-   CopyOnWriteArrayList	List	        ��	���	���
-   CopyOnWriteArraySet	    Set	            ���	���	���
-   LinkedBlockingDeque	    BlockingDeque   ��  ��� ��
                            BlockingQueue
-   LinkedBlockingQueue     BlockingQueue   ��	���	��
1*  -   �������� �����������
2*  -   �������� ��������������
3*  -   ����������� ��������

��������� ������ BlockingQueue:
-   boolean offer(E e, long timeout, TimeUnit unit)
    ��������� ������� � �������, ���� ��� ���������� �����, �� ���� ������������ ����� � ���������� false, ���� ����� �������.
-   E poll(long timeout, TimeUnit unit)
    ������� �� ������� � ���������� ������������ �������, ���� ������������ �����, �� ���� ��� ������� ������ ���������, ���������� null, ���� ����� �������.
��������� ������ LinkedBlockingDeque:
-   boolean offerFirst(E e, long timeout, TimeUnit unit)
    ��������� ������� � ������ ���������, ���� ��� ���������� �����, �� ������� ������������ �����, ���������� false, ���� ����� �������.
-   boolean offerLast(E e, long timeout, TimeUnit unit)
    ��������� ������� � ����� ���������, ���� ��� ���������� �����, �� ������� ������������ �����, ���������� false, ���� ����� �������.
-   E pollFirst(long timeout, TimeUnit unit)
    ������� � ���������� ������������ ������� � ������ ���������, ���� ������������ �����, �� ���� ��� ������� ������ ���������, ���������� null, ���� ����� �������.
-   E pollLast(long timeout, TimeUnit unit)
    ������� � ���������� ������������ ������� � ����� ���������, ���� ������������ �����, �� ���� ��� ������� ������ ���������, ���������� null, ���� ����� �������.
�������:
-   [Test2] ���������� �������� � ������� � ��������� 4 ���
-   [Test1] ConcurrentModificationException
