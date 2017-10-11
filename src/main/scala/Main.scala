import scala.io.StdIn

object Main extends App{
    println("Enter \"help\" or \"help [COMMAND]\"to get the usage.")
    while(true){
        var command:Array[String] = StdIn.readLine("$").split(" ")
        if(command(0) == "help"){
            if(command.size <= 1){
                Print.printUsage
            }else{
                if(command.size <= 2){
                    if(command(1) == "code") Print.printCodeHelp
                    else if(command(1) == "item") Print.printPriceHelp
                    else if(command(1) == "exit") Print.printExitHelp
                }else{println("Too much argument.")}
            }
        } else if(command(0) == "exit"){
            System.exit(0)
        } else if(command(0) == "item"){

        } else if(command(0) == "code"){

        } else {
            println("Command Invalids")
        }
    }
}
