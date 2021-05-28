package com.company.presentation;

import com.company.logic.Logic;

public class Presentation {
    public void konecTrapeniNeboliTadyJeEpickyVysledek(){
        Logic konec = new Logic();
        konec.vypocetVseho();
        System.out.println("Průměrný obvod všeho: " + konec.prumerVsechObvodu());
        System.out.println("Průměrný obsah všeho: " + konec.prumerVsechObsahu());
    }
}
