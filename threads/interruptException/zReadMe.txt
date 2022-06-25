ћетод tread.interrupt()
-   ≈сли поток в состо€нии Waiting выбрасывает InterruptedException [InterruptExample2, exConsoleClock1244]
-   ≈сли поток в состо€нии Runnable то поток сам должне обработать флаг прерывани€ потока [InterruptExample3]
-   “екущий поток IDEA останавливает с помощью tread.stop() InterruptExample4, не нужно использовать tread.stop()
-   thread.sleep() переводит поток в состо€ние Waiting, бросает обрабатываемое исключение InterruptedException
    если выставлен флаг прерывани€ потока
! после прерывани€ нужно дождатьс€ окончани€ работы потока методом tread.join() [JoinExample];


