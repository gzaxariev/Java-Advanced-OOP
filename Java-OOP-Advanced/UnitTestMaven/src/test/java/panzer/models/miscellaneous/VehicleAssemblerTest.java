package panzer.models.miscellaneous;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import panzer.contracts.*;

public class VehicleAssemblerTest {

    private Assembler vehicleAssembler;

    private Part attackModifyingPart;

    private Part defenseModifyingPart;

    private Part hitPointsModifyingPart;

    @Before
    public void setUp() throws Exception {
        this.vehicleAssembler = new VehicleAssembler();

        this.attackModifyingPart = Mockito.mock(AttackModifyingPart.class);

        this.defenseModifyingPart = Mockito.mock(AttackModifyingPart.class);

        this.hitPointsModifyingPart = Mockito.mock(HitPointsModifyingPart.class);

        this.vehicleAssembler.addArsenalPart(this.attackModifyingPart);
        this.vehicleAssembler.addShellPart(this.defenseModifyingPart);
        this.vehicleAssembler.addEndurancePart(this.hitPointsModifyingPart);
    }

    @Test
    public void getTotalWeight() {
        //Arrange

        //Act
        double actualTotalWeight = this.vehicleAssembler.getTotalWeight();
        double expectedTotalWeight = 0;
        //Assert
        Assert.assertEquals(expectedTotalWeight, actualTotalWeight, 0.1);
    }

    @Test
    public void getTotalPrice() {
    }

    @Test
    public void getTotalAttackModification() {
    }

    @Test
    public void getTotalDefenseModification() {
    }

    @Test
    public void getTotalHitPointModification() {
    }

    @Test
    public void addArsenalPart() {
    }

    @Test
    public void addShellPart() {
    }

    @Test
    public void addEndurancePart() {
    }
}