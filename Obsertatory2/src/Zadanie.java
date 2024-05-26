import java.util.ArrayList;

public class Zadanie implements Observer, Wyswietlanie {
    private String przedmiot;
    private int wymaganePrzedmioty;
    private Subject ekwipunek;

    public Zadanie(String przedmiot, int wymaganePrzedmioty, Subject ekwipunek){
        this.przedmiot = przedmiot;
        this.wymaganePrzedmioty = wymaganePrzedmioty;
        this.ekwipunek = ekwipunek;
        ekwipunek.rejestracjaObserwatora(this);
    }
    public void wyrejstrowanie(){
        ekwipunek.usuniecieObserwatora(this);
        ekwipunek = null;
    }
    public void rejestrowanie(Subject ekwipunek){
        this.ekwipunek = ekwipunek;
        ekwipunek.rejestracjaObserwatora(this);
    }

    @Override
    public void zmianaEkwipunku(String przedmiot, ArrayList<String> przedmioty, String akcja) {
        if(przedmiot.equals(this.przedmiot) && this.ekwipunek != null){
            wyswietl(przedmiot, przedmioty, akcja);
        }
    }

    @Override
    public void wyswietl(String przedmiot, ArrayList<String> przedmioty, String akcja) {

        if(akcja.equals("dodano")){
            System.out.println("Przedmiot: "+ przedmiot + ", zostal dodany do ekwipunku!");
        }
        if(akcja.equals("usunieto")){
            System.out.println("Przedmiot: "+ przedmiot + ", zostal usuniety z ekwipunku!");
        }
        int licznik = 0;
        for(String s: przedmioty){
            if(s.equals(this.przedmiot)){
                licznik += 1;
            }
        }
        if(licznik == this.wymaganePrzedmioty){
            System.out.println(" ");
            System.out.println("Misja wykonana!");
            System.out.println("Zebrales: " + this.wymaganePrzedmioty + "/" + this.wymaganePrzedmioty +". "+this.przedmiot);
            System.out.println("Zabieram niezbedne przedmioty z tego zadania");
            for(int i =0; i < this.wymaganePrzedmioty; i++){
                przedmioty.remove(przedmiot);
            }
            wyrejstrowanie();
        }
        System.out.println(" ");
        System.out.print("Obecny stan eq: [");
        for (String s : przedmioty) {
            System.out.print(s + ", ");
        }
        System.out.print("]");
        System.out.println(" ");
        System.out.println("--------");
    }
}
