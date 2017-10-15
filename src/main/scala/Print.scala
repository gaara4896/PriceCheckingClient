object Print{

    /**
     * Print the usage of the available commands.
     * This method will output the available command to the screen.
     */
    def printUsage{
        printf("\nUsage: COMMAND [ARGS]\n\n")
        printf("Commands:\n")
        printf("%-8s%-40s\n", "help", "To know usage of command")
        printf("%-8s%-40s\n", "item", "Get the price with name of item")
        printf("%-8s%-40s\n", "code","Get the price with code of the item")
        printf("%-8s%-40s\n", "exit", "Exit the system")
        printf("%-8s%-40s\n", "admin", "Use as admin")
    }
    /**
     * Print the usage for the command item
     * This method will output the usage of command item
     */
    def printItemHelp{
        printf("\nUsage: item [ARGS]\n\n")
        printf("Example: item milk\n\n")
    }

    /**
     * Print the usage for the command code
     * This method will output the usage of command code
     */
    def printCodeHelp{
        printf("\nUsage: code [ARGS]\n\n")
        printf("Example: code 123456789\n\n")
    }

    /**
     * Print the usage for the command exit
     * This method will output the usage of command exit
     */
    def printExitHelp{
        printf("\nUsage: exit\n\n")
        printf("Example: exit\n\n")
    }

    /**
     * Print the usage of admin
     * This method will output the usage of command admin
     */
     def printAdminHelp{
         printf("\nUsage: admin COMMAND [code] [name] [price]\n\n")
         printf("Commands:\n")
         printf("%-8s%-40s\n", "add", "Add new item\n")
     }
}
