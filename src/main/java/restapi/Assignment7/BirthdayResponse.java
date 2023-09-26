package restapi.Assignment7;

public class BirthdayResponse {
    private String name;
    private int month;
    private int day;

    public BirthdayResponse(String name, int month, int day) {
        this.name = name;
        this.month = month;
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String getBirthDay() {
        return this.month + "月" + this.day + "日";
    }
}
