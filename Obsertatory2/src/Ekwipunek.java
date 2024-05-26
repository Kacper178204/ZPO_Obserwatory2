import java.util.ArrayList;

public class Ekwipunek implements Subject {
    ArrayList<String> przedmioty;
    ArrayList<Observer> observers;

    public Ekwipunek() {
        przedmioty = new ArrayList<String>();
        observers = new ArrayList<Observer>();
    }

    public void dodajPrzedmiot(String przedmiot){
        przedmioty.add(przedmiot);
        powiadomienieObserwatora(przedmiot,this.przedmioty, "dodano");
    }

    public void usunPrzedmiot(String przedmiot){
        przedmioty.remove(przedmiot);
        powiadomienieObserwatora(przedmiot,this.przedmioty, "usunieto");
    }


    @Override
    public void rejestracjaObserwatora(Observer o) {
        observers.add(o);
    }

    @Override
    public void usuniecieObserwatora(Observer o) {
        observers.remove(o);
    }

    @Override
    public void powiadomienieObserwatora(String przedmiot, ArrayList<String> przedmioty, String akcja) {
        if(!observers.isEmpty()){
            for (Observer o: observers){
                o.zmianaEkwipunku(przedmiot,przedmioty,akcja);
            }
        }
    }
}
