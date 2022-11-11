package com.algo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class SelectorTest {
    private Selector selector;

    @BeforeEach
    void setUp() {
        selector = new Selector();

        Card[] cards = {Card.MASTER, Card.VISA};
        Processor processor = Processor.ISW;

        Card[] cards2 = {Card.MASTER, Card.VERVE};
        Processor processor2 = Processor.NIBBS;

        Card[] cards3 = {Card.VISA};
        Processor processor3 = Processor.UPSL;

        Card[] cards4 = {Card.VERVE};
        Processor processor4 = Processor.NIBBS;

        selector.solve(cards, "10000", processor);
        selector.solve(cards2, "10000", processor2);
        selector.solve(cards3, processor3);
        selector.solve(cards4,  "100002", processor4);

    }

    @AfterEach
    void tearDown() {
        selector = null;
    }

    @Test
    void whenAmountIsLessThan_10_000_AndCardIsVisaOrMasterThenUseISW(){
        assertEquals(Processor.ISW, selector.pay(200, Card.MASTER));
    }

    @Test
    void whenAmountIsLessThan_10_000_AndCardIsVerveOrMasterThenUseNIBBS(){
         assertEquals(Processor.NIBBS, selector.pay(200, Card.VERVE));
    }

    @Test
    void whenAmountIsAbove_10_000_AndCardIsVisaThenUseUPSL(){
         assertEquals(Processor.UPSL, selector.pay(100001, Card.VISA));

    }

    @Test
    void whenAmountIs_1_And_Above_AndCardIsVerveThenUseNIBBS(){
        assertEquals(Processor.NIBBS, selector.pay(100001, Card.VERVE));
    }
}