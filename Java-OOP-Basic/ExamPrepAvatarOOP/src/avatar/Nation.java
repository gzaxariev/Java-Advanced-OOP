package avatar;

import avatar.benders.Bender;
import avatar.monuments.Monument;

import java.util.Collections;
import java.util.List;

public class Nation {
    private List<Bender> benders;
    private List<Monument> monuments;

    public Nation(List<Bender> benders, List<Monument> monuments) {
        this.benders = benders;
        this.monuments = monuments;
    }
    public void addBender(Bender bender){
        this.benders.add(bender);
    }
    public void addMonument(Monument monument){
        this.monuments.add(monument);
    }

    public List<Bender> getBenders() {
        return Collections.unmodifiableList(this.benders);
    }

    public List<Monument> getMonuments() {
        return Collections.unmodifiableList(this.monuments);
    }

    double calculateNationPower(){
        Double total = 0.0;
        for (Bender bender : benders) {
            total += bender.getTotalPower();
        }

        Long sum = 0L;
        for (Monument monument : monuments) {
            sum += monument.getPowerMonument();
        }
        total += (total / 100) * sum;
        return total;
    }
    void clearBenders(){
        this.benders.clear();
    }
    void clearMonuments(){
        this.monuments.clear();
    }
}
