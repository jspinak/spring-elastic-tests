package brobot.elasticsearch.tests;

import io.github.jspinak.brobot.testingAUTs.ActionLog;
import io.github.jspinak.brobot.testingAUTs.ActionLogSender;
import io.github.jspinak.brobot.testingAUTs.StateTraversalService;
import org.springframework.stereotype.Component;

@Component
public class LoadLib {
    private final StateTraversalService stateTraversalService;
    private final ActionLogSender actionLogSender;

    public LoadLib(StateTraversalService stateTraversalService,
                   ActionLogSender actionLogSender) {
        this.stateTraversalService = stateTraversalService;
        this.actionLogSender = actionLogSender;
    }
    public void doStuff() {
        stateTraversalService.traverseAllStates();
        ActionLog actionLog = new ActionLog("DRAG2");
        actionLogSender.sendActionLogToElastic(actionLog);
    }
}
