package week6.assignmentproblems;

class Weather {
    String type;
    int severity;
    Weather() {
        this("Generic", 0);
    }
    Weather(String type, int severity) {
        this.type = type;
        this.severity = severity;
    }
    String forecast() {
        return "Weather: " + type + " | severity: " + severity;
    }
}

class Storm extends Weather {
    int windSpeed;
    Storm() {
        this(0);
    }
    Storm(int windSpeed) {
        super("Storm", windSpeed / 10);
        this.windSpeed = windSpeed;
    }
    @Override
    String forecast() {
        return super.forecast() + " | wind: " + windSpeed + " km/h";
    }
}

class Thunderstorm extends Storm {
    boolean lightning;
    Thunderstorm() {
        this(0, false);
    }
    Thunderstorm(int windSpeed, boolean lightning) {
        super(windSpeed);
        this.type = "Thunderstorm";
        this.lightning = lightning;
    }
    @Override
    String forecast() {
        return super.forecast() + (lightning ? " | lightning present" : " | no lightning");
    }
}

class Sunshine extends Weather {
    int uvIndex;
    Sunshine() {
        this(0);
    }
    Sunshine(int uvIndex) {
        super("Sunshine", uvIndex);
        this.uvIndex = uvIndex;
    }
    @Override
    String forecast() {
        return "Weather: " + type + " | UV index: " + uvIndex;
    }
}

public class WeatherTest {
    public static void main(String[] args) {
        Weather[] arr = {
                new Weather(),
                new Storm(80),
                new Thunderstorm(120, true),
                new Sunshine(7)
        };
        for (Weather w : arr) {
            System.out.println(w.forecast());
        }
    }
}

