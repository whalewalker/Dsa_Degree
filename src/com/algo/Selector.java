package com.algo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Selector {
    private static List<Validation> database = new ArrayList<>();

    //        database.forEach(validation1 -> {
//            System.out.println(validation.getAmount());
//            System.out.println(Arrays.toString(validation.getCards()));
//            System.out.println(Arrays.toString(validation.getProcessor()));
//        });

    public void solve(Card[] card, String min, String max, Processor processor) {
        Validation validation = new Validation();
        validation.setMin(min);
        validation.setMax(max);
        validation.setCards(card);
        validation.setProcessor(processor);
        database.add(validation);
    }
    public void solve(Card[] card, String max, Processor processor) {
        Validation validation = new Validation();
        validation.setMax(max);
        validation.setCards(card);
        validation.setProcessor(processor);
        database.add(validation);
    }
    public void solve(Card[] card, Processor processor) {
        Validation validation = new Validation();
        validation.setCards(card);
        validation.setProcessor(processor);
        database.add(validation);
    }



    public Processor pay(int amount, Card card) {
        List<Validation> result = database.stream().filter(validation -> validateAmount(validation.getMin(), validation.getMax(), amount) && Arrays.asList(validation.getCards()).contains(card)).collect(Collectors.toList());
//        System.out.println(result.get(0).getMin());
//        System.out.println(result.get(0).getMax());
//        System.out.println(Arrays.toString(result.get(0).getCards()));
        System.out.println(result.get(0).getProcessor());
        return result.get(0).getProcessor();
    }

    private boolean validateAmount(String min, String max, int amount) {
        int minVal = Integer.parseInt(min);
        if (max.equals("above") && amount > 10000) {
            return true;
        }

        if (minVal <= amount && max.equals("above")) {
            return true;
        }

        if (minVal > 10000 && amount > minVal) {
            return true;
        }
        return minVal <= amount || Integer.parseInt(max) <= amount;
    }
}
