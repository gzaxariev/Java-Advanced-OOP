package module_container_tests;

import cresla.interfaces.AbsorbingModule;
import cresla.interfaces.EnergyModule;
import org.junit.Before;
import org.mockito.Mockito;

public class ModuleContainerTests {

    private AbsorbingModule absorbingModuleMockito1;
    private AbsorbingModule absorbingModuleMockito2;
    private EnergyModule energyModule1;
    private EnergyModule energyModule2;

    @Before
    public void before() {
        Mockito.mock(AbsorbingModule.class);
    }
}
