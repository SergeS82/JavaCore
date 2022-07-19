[OOMExample/SOExample]
Компиляция:
    $ javac OOMExample.java
Запуск с максимальным размером кучи 100 МБ:
    $ java -Xmx100m OOMExample.java
Запуск с максимальным размером стека 1 МБ:
    java -Xss1m SOExample.java
Список процессов JVM:
    $ jps
Отчет по использованию памяти:
    $ jcmd {pid} VM.native_memory
Параметры запуска:
-   Xms{size}, -Xmx{size}, -Xss{size}
     Xms - начальный размер кучи
     Xmx - максимальный размер кучи
     size - 100G/g/M/mK/k
-   XX:NativeMemoryTracking={mode}
    Эта опция позволяет запустить приложение в режиме отслеживания потребления нативной памяти.
    С помощью значения mode регулируется уровень детализации отчетов потребления.
    Может принимать значения — off, summary, detail.
Литература:
    [NMT]   - https://docs.oracle.com/en/java/javase/14/troubleshoot/diagnostic-tools.html#GUID-1F53A50E-86FF-491D-A023-8EC4F1D1AC77
    [jcmd]  - https://docs.oracle.com/en/java/javase/14/docs/specs/man/jcmd.html





