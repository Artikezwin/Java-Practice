package praktika9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Client {
    private String fio;
    private String INN;

    public Client(String fio, String INN) throws INNException {
        this.fio = fio;
        Pattern pattern = Pattern.compile("\\d{12}");
        Matcher matcher = pattern.matcher(INN);
        if(matcher.matches()) this.INN = INN;
        else throw new INNException(INN);
    }

    @Override
    public String toString() {
        return "ФИО: " + fio +
                "\nИНН: " + INN;
    }
}
