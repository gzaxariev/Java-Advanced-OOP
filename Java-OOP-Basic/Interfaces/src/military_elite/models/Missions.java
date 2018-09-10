package military_elite.models;

import military_elite.interfaces.Missions_Interface;

public class Missions implements Missions_Interface {
    private String codeName;
    private String state;

    public Missions(String codeName, String state) {
        this.setCodeName(codeName);
        this.setState(state);
    }

    private void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    private void setState(String state) {
        if (!state.equals("inProgress") && !state.equals("Finished")) {
            throw new IllegalArgumentException("Invalid state!");
        }
        this.state = state;
    }

    @Override
    public String getCodeName() {
        return this.codeName;
    }

    @Override
    public String getState() {
        return this.state;
    }

    @Override
    public void CompleteMission() {
        this.state = "Finished";
    }

}