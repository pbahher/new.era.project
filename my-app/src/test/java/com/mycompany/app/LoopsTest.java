package com.mycompany.app;

import org.junit.Test;  //исправил

public class LoopsTest {

    static Loops loops = new Loops();

    @Test
    public void outputtOddNumbers() { loops.outputtOddNumbers(); }

    @Test
    public void outputtNumbers() { loops.outputtNumbers(); }

    @Test
    public void countingFactorial() { loops.countingFactorial(); }

    @Test
    public void countingFactorialNewMethod() { loops.countingFactorialNewMethod(); }

    @Test
    public void calculateTheDegree() {
        loops.calculateTheDegree();
    }

    @Test
    public void calculateOfSequence() {
        loops.calculateOfSequence();
    }

    @Test
    public void calculateOfSequenceNewMethod() { loops.calculateOfSequenceNewMethod(); }


}
