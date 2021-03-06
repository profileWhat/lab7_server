package commands;

import collection_management_module.Route;
import server_management_module.OutputDeviceWorker;
import collection_management_module.RouteCollectionManagement;

/**
 * Command for remove all element Lower than current Route
 */
public class RemoveLowerCommand implements Command {
    private final RouteCollectionManagement cm;

    /**
     * Constructor for load fields
     *
     * @param cm for load to command
     */
    public RemoveLowerCommand(RouteCollectionManagement cm) {
        this.cm = cm;
    }

    /**
     * Method for execute command
     *
     * @param object for set argument
     */
    @Override
    public void execute(Object object) {
        if (object instanceof Route) {
            Route route = (Route) object;
            cm.removeLower(route);
        }
    }

    /**
     * Method for describe command
     */
    @Override
    public void describe() {
        OutputDeviceWorker.getOutputDevice().createMessage("The command for remove all element Lower current Route");
    }

}
