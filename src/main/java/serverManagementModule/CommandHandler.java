package serverManagementModule;

import commands.ReceivedCommand;


/**
 * Class for processing input commands
 */
public class CommandHandler {
    private final CommandInvoker commandInvoker;

    /**
     * Constructor of Command Handler. Load Command Invoker to execute Command, set flag of is Found Exit Command, is Executing Script.
     *
     * @param commandInvoker to execute Command
     */
    public CommandHandler(CommandInvoker commandInvoker) {
        this.commandInvoker = commandInvoker;
    }


    public void execute(ReceivedCommand receivedCommand) throws WrongCommandException {
        commandInvoker.execute(receivedCommand.getCommandName(),receivedCommand.getArgument());
    }

}