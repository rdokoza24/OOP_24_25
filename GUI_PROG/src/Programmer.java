import java.io.Serializable;
import java.util.ArrayList;

public class Programmer implements Serializable {

    private String name;
    private String email;
    private String programmingIn;
    private String experience;
    private ArrayList<String> daysWorking;
    private boolean fullTime;

    public Programmer(String name, String email, String programmingIn, String experience, ArrayList<String> daysWorking, boolean fullTime) {
        this.name = name;
        this.email = email;
        this.programmingIn = programmingIn;
        this.experience = experience;
        this.fullTime = fullTime;
        this.daysWorking = daysWorking;

    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", programmingIn='" + programmingIn + '\'' +
                ", experience='" + experience + '\'' +
                ", daysWorking=" + daysWorking +
                ", fullTime=" + fullTime +
                '}';
    }
}
