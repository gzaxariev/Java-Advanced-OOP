package military_elite.interfaces;

import military_elite.models.Repairs;

import java.util.Set;

public interface Engineer_Interface extends SpecialisedSoldier_Interface {

    void addRepairs(Repairs repairs);
    Set<Repairs> getRepairsSet();
}