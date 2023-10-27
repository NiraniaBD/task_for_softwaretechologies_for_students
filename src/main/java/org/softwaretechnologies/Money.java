package org.softwaretechnologies;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

import static java.lang.Integer.MAX_VALUE;

public class Money {
    private final MoneyType type;
    private final BigDecimal amount;

    public Money(MoneyType type, BigDecimal amount) {
        this.type = type;
        this.amount = amount;
    }

    /**
     * Money равны, если одинаковый тип валют и одинаковое число денег до 4 знака после запятой.
     * Округление по правилу: если >= 5, то в большую сторону, иначе - в меньшую
     * Пример округления:
     * BigDecimal scale = amount.setScale(4, RoundingMode.HALF_UP);
     *
     * @param o объект для сравнения
     * @return true - равно, false - иначе
     */
    @Override
    public boolean equals(Object o) {
        // TODO: реализуйте вышеуказанную функцию

        if (o == this){
            return true;
        }


        //объект создан на основе класса Money?
        if (!(o instanceof Money money)) {
            return false;
        }


        //сравнивается amount и type
        //если да, то объекты равны
        if (((Money) o).amount == null || amount == null ) {
            if (((Money) o).amount == null && amount == null) {
                return type == ((Money) o).type;
            } else {
                return false;
            }
        }

        //сравнивается type и amount
        //если да, то сравнивает значения свойств amount обоих объектов с округлением до 4 знаков после запятой
        //если нет, то проверяет равенство свойств "type" и "amount" обоих объектов с округлением до 4 знаков после запятой
        //если да, то объекты равны
        if (((Money) o).type == null || type == null) {
            if (((Money) o).type == null && type == null) {
                return amount.setScale(4, RoundingMode.HALF_UP).compareTo(((Money) o).amount.setScale(4, RoundingMode.HALF_UP)) == 0;
            }
            else {
                return false;
            }
        }
        return type == ((Money) o).type && amount.setScale(4, RoundingMode.HALF_UP).compareTo(((Money) o).amount.setScale(4, RoundingMode.HALF_UP)) == 0;

    }

    /**
     * Формула:
     * (Если amount null 10000, иначе количество денег округленные до 4х знаков * 10000) + :
     * если USD , то 1
     * если EURO, то 2
     * если RUB, то 3
     * если KRONA, то 4
     * если null, то 5
     * Если amount округленный до 4х знаков * 10000 >= (Integer.MaxValue - 5), то хеш равен Integer.MaxValue
     * Округление по правилу: если >= 5, то в большую сторону, иначе - в меньшую
     * Пример округления:
     * BigDecimal scale = amount.setScale(4, RoundingMode.HALF_UP);
     *
     * @return хеш код по указанной формуле
     */

//    private int getMoneyValue(MoneyType type){
//        switch (type){
//            case USD: return 1;
//            case EURO: return 2;
//            case RUB: return 3;
//            default: return 0;
//        }
//    }

    @Override
    public int hashCode() {
        // TODO: реализуйте вышеуказанную функцию

        //если amount отсутствует или не определен
        if(amount == null) {
            return 10000;
        }

        //создается числовое представление amount
        //с округлением до 4 знаков после запятой, умноженное на 10000 и приведенное к типу int
        int a;
        a = amount.setScale(4, RoundingMode.HALF_UP).multiply(BigDecimal.valueOf(10000)).intValue();
        if(a > MAX_VALUE -5) {
            a = MAX_VALUE;
        }

        //если type отсутствует или не определен
        if (type == null){
            a += 5;
            return a;
        }
        //иначе: если свойство type не равно null
        //то к переменной a добавляется значение порядкового номера (ordinal) свойства type + 1
        //это добавляет уникальность к хеш-коду в зависимости от значения свойства type
        a += type.ordinal()+1;
        return a;
    }

    /**
     * Верните строку в формате
     * Тип_ВАЛЮТЫ: количество.XXXX
     * Тип_валюты: USD, EURO, RUB или KRONA
     * количество.XXXX - округленный amount до 4х знаков.
     * Округление по правилу: если >= 5, то в большую сторону, иначе - в меньшую
     * BigDecimal scale = amount.setScale(4, RoundingMode.HALF_UP);
     * <p>
     * Если тип валюты null, то вернуть:
     * null: количество.XXXX
     * Если количество денег null, то вернуть:
     * Тип_ВАЛЮТЫ: null
     * Если и то и то null, то вернуть:
     * null: null
     *
     * @return приведение к строке по указанному формату.
     */
    @Override
    public String toString() {
        // TODO: реализуйте вышеуказанную функцию

//        if (amount == null && type == null){
//            return "null: XXXX";
//        }
//        else if ( type == null){
//            return "null: " +amount.setScale(4, RoundingMode.HALF_UP).toString();
//        }
//        else if (amount == null){
//            return type.toString()+"null";
//        }
//        else {
//            return type.toString()+"."+amount.setScale(4, RoundingMode.HALF_UP).toString();
//        }


        //к строке str добавляется строковое представление свойства "amount"
        // свойство amount округляется до 4 знаков после запятой
        // с помощью метода setScale(4, RoundingMode.HALF_UP)
        // а затем преобразуется в строку с помощью метода toString()
        //Возвращается строка str
        String str = type.toString()+": "+amount.setScale(4, RoundingMode.HALF_UP).toString();
        return str;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public MoneyType getType() {
        return type;
    }

    public static void main(String[] args) {
        Money money = new Money(MoneyType.EURO, BigDecimal.valueOf(10.00012));
        Money money1 = new Money(MoneyType.USD, BigDecimal.valueOf(10.5000));
        System.out.println(money1.toString());
        System.out.println(money1.hashCode());
        System.out.println(money.equals(money1));
    }
}
