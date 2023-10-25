package brobot.elasticsearch.tests;

import io.github.jspinak.brobotelastic.service.ActionLogServiceImpl;
import org.springframework.stereotype.Component;

@Component
public class LoadLib {

    private final ActionLogServiceImpl actionLogService;

    public LoadLib(ActionLogServiceImpl actionLogService) {
        this.actionLogService = actionLogService;
    }

    public void doStuff() {
        actionLogService.getAllActionLogs();
    }
}
