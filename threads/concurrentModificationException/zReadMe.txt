Новые коррекции:
    Класс                   Интерфейс       1*  2*  3*
-   ConcurrentHashMap       ConcurrentMap	нет	нет	нет
-   ConcurrentLinkedDeque	Deque	        да	нет	нет
-   ConcurrentLinkedQueue	Queue	        да	нет	нет
-   CopyOnWriteArrayList	List	        да	нет	нет
-   CopyOnWriteArraySet	    Set	            нет	нет	нет
-   LinkedBlockingDeque	    BlockingDeque   да  нет да
                            BlockingQueue
-   LinkedBlockingQueue     BlockingQueue   да	нет	да
1*  -   Элементы упорядочены
2*  -   Элементы отсортированны
3*  -   Блокируемые операции

Некоторые методы BlockingQueue:
-   boolean offer(E e, long timeout, TimeUnit unit)
    Добавляет элемент в очередь, если нет свободного места, то ждет определенное время и возвращает false, если время истекло.
-   E poll(long timeout, TimeUnit unit)
    Убирает из очереди и возвращает пользователю элемент, ждет определенное время, до того как элемент станет доступным, возвращает null, если время истекло.
Некоторые методы LinkedBlockingDeque:
-   boolean offerFirst(E e, long timeout, TimeUnit unit)
    Добавляет элемент в начало коллекции, если нет свободного места, то ожидает определенное время, возвращает false, если время истекло.
-   boolean offerLast(E e, long timeout, TimeUnit unit)
    Добавляет элемент в конец коллекции, если нет свободного места, то ожидает определенное время, возвращает false, если время истекло.
-   E pollFirst(long timeout, TimeUnit unit)
    Удаляет и возвращает пользователю элемент с начала коллекции, ждет определенное время, до того как элемент станет доступным, возвращает null, если время истекло.
-   E pollLast(long timeout, TimeUnit unit)
    Удаляет и возвращает пользователю элемент с конца коллекции, ждет определенное время, до того как элемент станет доступным, возвращает null, если время истекло.
Примеры:
-   [Test2] добавление элемента в очередь с ожиданием 4 сек
-   [Test1] ConcurrentModificationException
