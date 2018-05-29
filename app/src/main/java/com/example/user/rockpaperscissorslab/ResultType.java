package com.example.user.rockpaperscissorslab;

public enum ResultType {
    WIN("wins"),
    LOSE("loses"),
    DRAW("draws");

    String result;

    ResultType(String result){
        this.result = result;
    }

    public String getResult(){
        return this.result;
    }

}
