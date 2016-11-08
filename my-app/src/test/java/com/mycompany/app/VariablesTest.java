package com.mycompany.app;

import org.junit.Test;

public class VariablesTest {

    static Variables variables = new Variables();

    @Test
    public void theNumberRemainder() {
        variables.theNumberRemainder();
    }

    @Test
    public void sumOfNumbers() { variables.sumOfNumbers();
    }

    @Test
    public void roundingNumbers() { variables.roundingNumbers();
    }

    @Test
    public void roundingThreeNumbers() { variables.roundingThreeNumbers();
    }

    @Test
    public void calculateIncreasingSequence() {
        variables.calculateIncreasingSequence();
    }


}
