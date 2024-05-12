# programming_technology_2
Здесь представлено Техническое задание 2

# Java Number Operations Project

## Описание
Проект `Java Number Operations` реализует базовые арифметические операции над числами, считываемыми из файла. Программа обрабатывает целые числа, находит минимальное и максимальное значения, считает сумму и произведение всех чисел в файле.

## Функции
- **Чтение чисел из файла**: Программа читает строку чисел из файла.
- **Минимальное число**: Определение минимального числа в списке.
- **Максимальное число**: Определение максимального числа в списке.
- **Сумма чисел**: Вычисление суммы всех чисел.
- **Произведение чисел**: Вычисление произведения всех чисел.

## Как запустить
Для запуска программы необходимо иметь установленную Java. Программа запускается с командной строки следующим образом:

```bash
java Main <function> <filename>
Где <function> это одна из операций: min, max, sum, mult, а <filename> — путь к файлу с числами.
```

## Тестирование
Тесты реализованы с использованием JUnit и включают проверку всех основных функций программы. Для запуска тестов используйте следующую команду:

```bash
mvn test
```
## Баллы
В соответствии с требованиями задачи, баллы распределяются следующим образом:

Реализация функций чтения из файла и арифметических операций (1 балл): Все требуемые функции (min, max, sum, mult) успешно реализованы и работают корректно.
Тесты для проверки корректности функций (1 балл): Написаны и успешно выполняются тесты для всех арифметических операций.
Тесты для проверки скорости работы программы (1 балл): Тест производительности для функции умножения реализован с использованием System.currentTimeMillis() и показывает приемлемую производительность.
Дополнительный тест на ваше усмотрение (1 балл): Реализован тест для проверки работы функции умножения с отрицательными числами.
Построение графика зависимости времени выполнения от количества чисел (1 балл): В документации описан процесс тестирования, хотя график может быть представлен в отдельном отчёте или визуализирован с помощью внешних инструментов.
Автор
Шинкарев Роман, 233
