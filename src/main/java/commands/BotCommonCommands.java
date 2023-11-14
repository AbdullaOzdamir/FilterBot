package commands;

public class BotCommonCommands {

    @AppBotCommand(name = "/hello", descriptions = "when request hello", showInHelp = true)
    String hello() {
        return "Hello, User";
    }

    @AppBotCommand(name = "/bye", descriptions = "when request bye", showInHelp = true)
    String bye() {
        return "Good bye, User";
    }

    @AppBotCommand(name = "/help", descriptions = "when request help", showInKeyboard = true)
    String help() {
        return "Help, please";
    }
}
