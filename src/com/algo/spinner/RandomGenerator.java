package com.algo.spinner;

import java.util.*;

import static com.algo.spinner.RewardType.*;

public class RandomGenerator<E> {
    private final NavigableMap<Double, E> map = new TreeMap<>();
    private final Random random;
    private double total = 0;

    public RandomGenerator() {
        this(new Random());
    }

    public RandomGenerator(Random random) {
        this.random = random;
    }

    public RandomGenerator<E> add(double weight, E item) {
        if (weight <= 0) return this;
        total += weight;
        map.put(total, item);
        return this;
    }

    public void remove(E value) {
        map.values().remove(value);
    }

    public E next() {
        double value = random.nextDouble() * total;
        return map.higherEntry(value).getValue();
    }

    public static void main(String[] args) {
        List<RewardType> list = new ArrayList<>(List.of(FREE_CASHOUT, FREE_AIRTIME, PURSE_CREDIT, FREE_FUNDS_TRANSFER,
                FREE_TRANSACTION, FREE_DATA, FIVE_FREE_TRANSACTION, NEXT_25_TRANSACTION_FREE));
        int[] frequency = new int[list.size()];

        RandomGenerator<Object> randomGenerator = new RandomGenerator<>()
                .add(FREE_CASHOUT.getWeight(), FREE_CASHOUT)
                .add(FREE_AIRTIME.getWeight(), FREE_AIRTIME)
                .add(PURSE_CREDIT.getWeight(), PURSE_CREDIT)
                .add(FREE_FUNDS_TRANSFER.getWeight(), FREE_FUNDS_TRANSFER)
                .add(FREE_TRANSACTION.getWeight(), FREE_TRANSACTION)
                .add(FREE_DATA.getWeight(), FREE_DATA)
                .add(FIVE_FREE_TRANSACTION.getWeight(), FIVE_FREE_TRANSACTION)
                .add(NEXT_25_TRANSACTION_FREE.getWeight(), NEXT_25_TRANSACTION_FREE);

        System.out.println("Reward Type Distribution");
        for (int i = 0; i < 100; i++) {
            RewardType value = (RewardType) randomGenerator.next();
            value.setGiftCount(value.getGiftCount() - 1);
            if (value.getGiftCount() < 1) randomGenerator.remove(value);
                while (value.getGiftCount() < 1) {
                    value = (RewardType) randomGenerator.next();
                }
            frequency[list.indexOf(value)]++;
        }
        System.out.println(Arrays.toString(frequency));

        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%s: ", list.get(i));

            for (int stars = 0; stars < frequency[i]; stars++)
                System.out.print("*");
            System.out.println();
        }


//        System.out.println("======== COUNT DOWN =======");
        // countDown[list.indexOf(value)] = value.getGiftCount();
        //        int[] countDown = new int[list.size()];
        // System.out.println(Arrays.toString(countDown));

    }

}
