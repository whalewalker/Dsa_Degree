//package com.algo.spinner;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class SpinnerScheduler {
//   private  Map<String, Agent> agents = new HashMap<>();
//    public  void spin(String agentId){
//        Agent agent = agents.get(agentId);
//        RewardType gift = RewardType.valueOf(Criteria.transactionCountIs30OrMoreAndTransactionCountAmountIsGreaterThan1000(agent));
//        System.out.println(gift +  " -> " + agent.getName());;
//    }
//
//    public  void addAgent(Agent agent){
//        agents.put(agent.getId(), agent);
//    }
//
//    public static void main(String[] args) {
//        SpinnerScheduler spinnerScheduler = new SpinnerScheduler();
//        for (int i = 0; i < 1000; i++){
//            Agent agent = new Agent(String.valueOf(i), Category.values()[Criteria.getRandom(0, 2)]);
//            spinnerScheduler.addAgent(agent);
//        }
//
//        for (Map.Entry<String, Agent> agent : spinnerScheduler.agents.entrySet()){
//
//            for (int i = 0; i < Criteria.getRandom(0, 100); i++){
//                Transaction transaction = new Transaction(Criteria.getRandom(500, 10000));
//                agent.getValue().addTransaction(transaction);
//            }
//
//            for (int i = 0; i < 1; i++){
//                spinnerScheduler.spin(agent.getKey());
//            }
//        }
//    }
//}
