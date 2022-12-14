package tech.reliab.course.berezhnayaa.bank.utils;

import java.util.Random;

public class RandomGenerator {

    /**
     *
     * @param min
     * @param max
     * @return
     */
    public static int generateInt(int min, int max) {
        return new Random().nextInt(max - min + 1) + min;
    }

    /**
     *
     * @param min
     * @param max
     * @return
     */
    public static float generateFloat(float min, float max) {
        return new Random().nextFloat(max - min + 1) + min;
    }

    /**
     * Генерация процентной ставки на основе рейтинга банка
     * @param rating Рейтинг от 1 до 100
     * @return
     */
    public static int generateRateUseRating(int min, int max, int rating) {
        float random = generateFloat(min, max);
        return (int) (random * (1 - rating*0.5));
    }

    /**
     * Генератор кредитного рейтинга без рандома на основе месячного дохода
     * @param incomeUser месячный доход от 1 до 10000
     * @return
     */
    public static int generateCreditRating(int incomeUser) {
        return (int) Math.round(Math.ceil(incomeUser / 1000)) * 100;
    }

    public static int generateAllMoney(int min, int max) {
        return new Random().nextInt(max - min + 1) + min;
    }
}