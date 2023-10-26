package com.springcore;

public class AnotherStudent {

    private MathCheat mathCheat;

    public void setMathCheat(MathCheat mathCheat) {
        this.mathCheat = mathCheat;
    }

    public void startCheating(){
        mathCheat.mathCheat();
    }


}
