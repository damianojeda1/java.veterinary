package com.example.mindhub.veterinary.utils;

public final class Testing {

    private Testing() {
    }

    //lanzar dado
    public static int launchDice(int min, int max) throws Exception {
        if (min!=0 || min!=0){
            return (int)((Math.random() * (max - min)) + min);
        } else {
            throw new Exception("Los valores deben ser distintos de 0");
        }
    }

    //Suma dos numeros
    public static int addNumbers(int x, int y) throws Exception {
        if (x<0){
            throw new Exception("X no puede ser negativo");
        } else if (y<0){
            throw new Exception("Y no puede ser negativo");
        }
        return x+y;
    }

    //Evaluar password
    public static String evaluatePass(String password) throws Exception {
        if (password==null){
            throw new Exception("Parametro nulo");
        } else if (password.isEmpty()){
            throw new Exception("password vacio");
        } else if (password.length()<=3){
            return "Password DEBIL";
        } else if (password.length()<=6){
            return "Password NORMAL";
        } else if (password.length()<10 && password.length()>7){
            return "Password FUERTE";
        } else {
            return "Genere otro password";
        }
    }

}
