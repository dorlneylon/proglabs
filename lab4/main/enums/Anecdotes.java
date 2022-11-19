package main.enums;

public enum Anecdotes {
    Anec1(
            "Мюллер подзывает Штирлица и спрашивает его:\n"+
            "– Sagen Sie mir ehrlich, Stirlitz, sind Sie ein Spion?\n"+
            "– Я?"
    ),
    Anec2("Идет мужик по городу. Видит гидрант стоит. Надел на него шляпу, надел на него шляпу, надел на него шляпу, надел на него шляпу, надел на него шляпу, надел на него шляпу, надел на него шляпу, надел на него шляпу, надел на него шляпу, надел на него шляпу, надел на него шляпу, надел на него шляпу, надел на него шляпу, надел на него шляпу, надел на него шляпу, надел на него шляпу, надел на него шляпу, надел на него шляпу, надел на него шляпу, надел на него шляпу, надел на него шляпу. А они ему как раз"        
    ),
    Anec3("Поручик Ржевский рассказывает гусарам свой сон:\n"+
           "– Иду я по лесу и вижу…\n"+
           "– ...что там армяне в нарды играют!\n"+
           "– Нет, дом. Подхожу я к этому дому и вижу…\n"+
           "– ... что там армяне в нарды играют!\n"+
           "– Нет, дверь. Вхожу я в эту дверь и вижу…\n"+
           "– ... что там армяне в нарды играют!\n"+ 
           "Поручик растерянно:\n"+
           "– Да… а что, я вам этот сон уже рассказывал?\n"
        ),
    Anec4("Приходит поручик Ржевский с дамой на бал. Кружится с ней в танце, болтает, выпивает, смеётся. Развлекается, в общем. Тем временем в зале гробовая тишина, все ошеломлённо смотрят на эту парочку.\n"+
          "\"Завидуют\" - Думает Ржевский.\n"+
          "Через полчаса к нему подходит явно недовольная Наташа Ростова:\n"+
          "-Поручик, вы бы хоть раз живую привели.\n"
        ),
    Anec5("Штирлиц направился на передовую и увидел замерзающих солдат.\n \"Атака стыла\" - догадался Штирлиц.\n");
    
    final public String anec;

    Anecdotes(String anec) {
        this.anec = anec;
    }


}