package military_elite.interfaces;

import military_elite.models.Missions;

import java.util.Set;

public interface Commando_Interface extends SpecialisedSoldier_Interface {

    void addMission(Missions missions);
    Set<Missions> getMissionsSet();
}