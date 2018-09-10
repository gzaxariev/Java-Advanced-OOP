import app.waste_disposal.DefaultGarbageProcessor;
import app.waste_disposal.contracts.GarbageDisposalStrategy;
import app.waste_disposal.contracts.ProcessingData;
import app.waste_disposal.contracts.StrategyHolder;
import fakes.DisposableAnnotation;
import fakes.DisposableWaste;
import fakes.NoneAnnotatedWaste;
import fakes.NoneDisposableWaste;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.LinkedHashMap;
import java.util.Map;

public class GarbageProcessorShould {

    private final Map<Class, GarbageDisposalStrategy> strategies = new LinkedHashMap<>();

    private DefaultGarbageProcessor garbageProcessor;
    private StrategyHolder strategyHolderMock;
    private ProcessingData processingDataMock;
    private GarbageDisposalStrategy garbageDisposalStrategyMock;

    @Before
    public void initialize(){
        this.strategyHolderMock = Mockito.mock(StrategyHolder.class);
        this.garbageDisposalStrategyMock = Mockito.mock(GarbageDisposalStrategy.class);
        this.garbageProcessor = new DefaultGarbageProcessor(strategyHolderMock);
        this.processingDataMock = Mockito.mock(ProcessingData.class);
        this.strategies.put(DisposableAnnotation.class, garbageDisposalStrategyMock);
    }

    @Test
    public void returnStrategyHolderIfPresent(){
        Assert.assertEquals(this.strategyHolderMock,
                this.garbageProcessor.getStrategyHolder());

    }
    @Test(expected = IllegalArgumentException.class)
    public void throwWhenNullStrategyHolderIsPassed(){
        this.garbageProcessor = new DefaultGarbageProcessor(null);

    }
    @Test(expected = IllegalArgumentException.class)
    public void throwWhenNoDisposableWasteIsProcessed(){
        this.garbageProcessor.processWaste(new NoneDisposableWaste());
    }
    @Test(expected = IllegalArgumentException.class)
    public void throwWhenNoAnnotatedWasteIsProcessed(){
        this.garbageProcessor.processWaste(new NoneAnnotatedWaste());
    }

//    @Test
////    public void returnProcessingDataIfDisposableWastePassed(){
////        //arrange
////        Mockito.when(garbageDisposalStrategyMock.processGarbage(Mockito.isA(DisposableWaste.class)));
////        Mockito.when(this.strategyHolderMock.getDisposalStrategies()).thenReturn(this.strategies);
////        //act
////        ProcessingData result = this.garbageProcessor.processWaste(new DisposableWaste());
////        //assert
////        Assert.assertSame(this.processingDataMock, result);
////    }
}
