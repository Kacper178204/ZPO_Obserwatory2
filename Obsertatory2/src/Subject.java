import java.util.ArrayList;

public interface Subject {
    public void rejestracjaObserwatora(Observer o);
    public void usuniecieObserwatora(Observer o);
    public void powiadomienieObserwatora(String przedmiot, ArrayList<String> przedmioty, String akcja);
}
