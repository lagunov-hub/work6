# work6

**Задание 1**
Один фрилансер, воспользовавшись гибкостью графика своего вида работы,
решил смоделировать свой отдых по следующей схеме:
* изначально у него нет денег;
* если он решает, что следующий месяц хочет активно поработать, то его
деньги увеличиваются на income, доход от работы, и уменьшаются на
expense, обязательные месячные траты;
* если он решает, что следующий месяц хочет отдохнуть, то за месяц его
деньги уменьшаются на expense, а затем остаток накоплений ещё
уменьшается в три раза — траты на отдых;
* решение, отдохнуть ли в следующем месяце принимается по правилу:
если на счету есть хотя бы threshold денег, то выбираем отдых, иначе —
работу.
* 
Вам нужно написать сервисный класс с методом, который по заданным
income, expenses и threshold рассчитает количество месяцев отдыха,
которые будут в следующий год. Всё считается в целых числах.
Сервисный класс должен быть в пакете ru.netology.services, как и тесткласс на него.
**Например**, если income 10 тысяч руб., expenses 3 тысячи руб., threshold 20
тысяч руб., то отдохнуть удастся три месяца в году согласно следующей
эмуляции планируемого поведения:
* Месяц 1. Денег 0. Придётся работать. Заработал +10000, потратил -3000
* Месяц 2. Денег 7000. Придётся работать. Заработал +10000, потратил -
3000
* Месяц 3. Денег 14000. Придётся работать. Заработал +10000, потратил -
3000
* Месяц 4. Денег 21000. Буду отдыхать. Потратил -3000, затем ещё -12000
* Месяц 5. Денег 6000. Придётся работать. Заработал +10000, потратил -
3000
* Месяц 6. Денег 13000. Придётся работать. Заработал +10000, потратил -
3000
* Месяц 7. Денег 20000. Буду отдыхать. Потратил -3000, затем ещё -11334
* Месяц 8. Денег 5666. Придётся работать. Заработал +10000, потратил -
3000
* Месяц 9. Денег 12666. Придётся работать. Заработал +10000, потратил -
3000
* Месяц 10. Денег 19666. Придётся работать. Заработал +10000, потратил
-3000
* Месяц 11. Денег 26666. Буду отдыхать. Потратил -3000, затем ещё -
15778
*[build.gradle](..%2Fwork10%2Fbuild.gradle) Месяц 12. Денег 7888. Придётся работать. Заработал +10000, потратил -
3000