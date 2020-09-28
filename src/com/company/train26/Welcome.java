package com.company.train26;

public class Welcome {

    public static String greet(String language) {
        String result = "";
        switch (language) {
            case "english":
                result = "Welcome";
                break;
            case "czech":
                result = "Vitejte";
                break;
            case "danish":
                result = "Velkomst";
                break;
            case "dutch":
                result = "Welkom";
                break;
            case "estonian":
                result = "Tere tulemast";
                break;
            case "finnish":
                result = "Tervetuloa";
                break;
            case "flemish":
                result = "Welgekomen";
                break;
            case "french":
                result = "Bienvenue";
                break;
            case "german":
                result = "Willkommen";
                break;
            case "irish":
                result = "Failte";
                break;
            case "italian":
                result = "Benvenuto";
                break;
            case "latvian":
                result = "Gaidits";
                break;
            case "lithuanian":
                result = "Laukiamas";
                break;
            case "polish":
                result = "Witamy";
                break;
            case "spanish":
                result = "Bienvenido";
                break;
            case "swedish":
                result = "Valkommen";
                break;
            case "welsh":
                result = "Croeso";
                break;
            default:
                result = "Welcome";
                break;
        }
        return result;
    }
}
