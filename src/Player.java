public interface Player {
    int choice();
    int addPoint();
    int allPoints();
    String name(Terminal terminal);
}


//    fajnie by było utworzyć sobie interfejs Player, i 2 klasy które będę implementować ten interfejs; Computer, HumanPlayer
//        interfejs powinien mieć metody do pobrania ruchu gracza, dodani punktu, sprawdzenia ilości punktów, pobrania nazwy gracza
//        przydała by się też klasa RPSRules gdzie byłyby zdefniowane reguły gry, oraz metoda, która zwracała by informację, który z graczy wygrał na podstawie przekazanych ruchów
//        reguły gry możesz zdefiniować w formie macierzy, tak mniej matematycznie; tablicy tablic - int[][] rules
//        - klasa RPSGame powinna przyjmować w/w obiekty i na na podstawie tych obiektów kierować rozgrywką
//        - osobna klasa odpowiedzialna, za komunikację ze światem zewnętrznym - pobranie ruchu gracza, wyświetlenie informacji na ekranie