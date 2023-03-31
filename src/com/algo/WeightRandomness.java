package com.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class WeightRandomness {
    public static class Item{
        private double weight;
        private String rewardType;

        public Item(double weight, String rewardType) {
            this.weight = weight;
            this.rewardType = rewardType;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public String getRewardType() {
            return rewardType;
        }

        public void setRewardType(String rewardType) {
            this.rewardType = rewardType;
        }

        @Override
        public String toString() {
            return String.format("%s --> %s", rewardType, weight);
        }
    }
    private  double total = 0.0;
    private List<Item> items = new ArrayList<>();

    public WeightRandomness add(Item item){
        if (item.getWeight() < 1) return this;
        items.add(item);
        total += item.weight;
        return this;
    }

    public  Item getRandomItem(){
        int index = 0;
        double randomDouble = new Random().nextDouble();
        System.out.println(randomDouble);
        double randomIndex = randomDouble * total;
        for(double randomValue = randomIndex; index < items.size() - 1; index++){
            randomValue -= items.get(index).getWeight();
            if(randomValue < 1) break;
        }
        return items.get(index);
    }
    public static void main(String[] args) {
        int[] frequency = new int[10];
        WeightRandomness weightRandomness = new WeightRandomness();
        weightRandomness.add(new Item(1, "one"))
                .add(new Item(2, "two"))
                .add(new Item(3, "three"))
                .add(new Item(4, "four"))
                .add(new Item(5, "five"))
                .add(new Item(6, "six"))
                .add(new Item(7, "seven"))
                .add(new Item(8, "eight"))
                .add(new Item(9, "nine"))
                .add(new Item(10, "ten"));

        for (int i = 0; i < 100; i++){
            frequency[(int) weightRandomness.getRandomItem().getWeight() - 1]++;
        }
        System.out.println(Arrays.toString(frequency));


    }
}
