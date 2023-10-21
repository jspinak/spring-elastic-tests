package brobot.elasticsearch.tests;

import io.github.jspinak.brobot.testingAUTs.StateTraversalService;
import org.springframework.stereotype.Component;

@Component
public class TestElasticsearch {

    private final StateTraversalService stateTraversalService;

    public TestElasticsearch(StateTraversalService stateTraversalService) {
        this.stateTraversalService = stateTraversalService;
    }

    public void test() {
        stateTraversalService.traverseAllStates();
    }
}
