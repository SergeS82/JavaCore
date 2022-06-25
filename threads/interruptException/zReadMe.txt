Метод tread.interrupt()
-   Если поток в состоянии Waiting выбрасывает InterruptedException [InterruptExample2, exConsoleClock1244]
-   Если поток в состоянии Runnable то поток сам должне обработать флаг прерывания потока [InterruptExample3]
-   Текущий поток IDEA останавливает с помощью tread.stop() InterruptExample4, не нужно использовать tread.stop()
-   thread.sleep() переводит поток в состояние Waiting, бросает обрабатываемое исключение InterruptedException
    если выставлен флаг прерывания потока
! после прерывания нужно дождаться окончания работы потока методом tread.join() [JoinExample];


