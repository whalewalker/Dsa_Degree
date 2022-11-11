//package com.algo.spinner;
//
//
//import static com.algo.spinner.RewardType.NONE;
//
//public class Criteria {
//    public static String transactionCountIs30OrMoreAndTransactionCountAmountIsGreaterThan1000(Agent agent) {
//        int size = agent.getTransactions().size();
//        int count = 0;
//        if (agent.getCount() >= 30) {
//            int tracker = size - 30;
//            for (int i = 0; i < size; i++) {
//                if (agent.getTransactions().get(i).getTransactionAmount() < 1000) {
//                    tracker--;
//                    count++;
//                }
//                if (tracker == 0) {
//                    System.out.printf("%s -> %s -> ", size, size - count);
//                    return NONE.name();
//                }
//            }
//            switch (agent.getCategory()) {
//                case SUBSCRIBER: {
//                    System.out.printf("%s -> %s -> ", size, size - count);
//                    return RewardType.values()[getRandom(0, 2)].name();
//                }
//                case ROOKIE: {
//                    System.out.printf("%s -> %s -> ", size, size - count);
//                    return RewardType.values()[getRandom(0, 3)].name();
//                }
//                case PREMIUM: {
//                    System.out.printf("%s -> %s -> ", size, size - count);
//                    return RewardType.values()[getRandom(0, 4)].name();
//                }
//                default:
//                    return NONE.name();
//            }
//        }
//        return NONE.name();
//    }
//
//    public static int getRandom(int min, int max) {
//        return min + (int) (Math.random() * ((max - min) + 1));
//    }
//}
