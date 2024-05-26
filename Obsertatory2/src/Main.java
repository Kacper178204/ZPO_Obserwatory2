public class Main {

    public static void main(String[] args) {
	Ekwipunek eq = new Ekwipunek();

    String s1 = "Mydlo";
    String s2 = "Recznik";
    String s3 = "Gabka";

        Zadanie q1 = new Zadanie(s1, 2, eq);
        Zadanie q2 = new Zadanie(s2, 3, eq);

        eq.dodajPrzedmiot(s1);
        eq.dodajPrzedmiot(s1);
        eq.dodajPrzedmiot(s2);
        eq.dodajPrzedmiot(s2);
        eq.usunPrzedmiot(s2);

        Zadanie q3 = new Zadanie(s3, 5, eq);

        eq.dodajPrzedmiot(s3);
        eq.dodajPrzedmiot(s2);
        eq.dodajPrzedmiot(s3);
        eq.dodajPrzedmiot(s2);

    }
}
