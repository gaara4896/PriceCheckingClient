import scala.io.StdIn
import java.io.{DataInputStream, DataOutputStream}
import java.net.Socket

object Client extends App{
    println("Enter \"help\" or \"help [COMMAND]\"to get the usage.")
    while(true){
        var command:Array[String] = StdIn.readLine("$").split(" ")
        if(command(0) == "help"){
            if(command.size <= 1){
                Print.printUsage
            }else{
                if(command.size <= 2){
                    if(command(1) == "code") Print.printCodeHelp
                    else if(command(1) == "item") Print.printItemHelp
                    else if(command(1) == "exit") Print.printExitHelp
                    else if(command(1) == "admin") Print.printAdminHelp
                }else{println("Too much argument.")}
            }
        } else if(command(0) == "exit"){
            System.exit(0)
        } else if(command(0) == "admin"){

            var status:Boolean = false
            var countdown:Int = 3
            do{
                val password = StdIn.readLine("Enter Password: ")
                status = password == "admin"
                countdown = countdown - 1
            } while(status == false && countdown > 3)

            if(command(1) == "add" && command.size == 5 && status == true){
                var client: Option[Socket] = None
                try {
                    client = Some(new Socket("127.0.0.1", 8888))

                    val is = new DataInputStream(client.get.getInputStream)
                    val os = new DataOutputStream(client.get.getOutputStream)

                    os.writeBytes(s"${command(1)};${command(2)};${command(3)};${command(4)}\n")

                    var line: String = is.readLine()

                    println(line)

                } catch {
                    case e: Exception => e.printStackTrace()
                } finally {
                    client foreach (_.close())
                }
            } else if(command(1) == "add" && command.size != 5){
                println("Not enough argument")
            } else {
                println("No such command")
            }

        } else if(command(0) == "item" || command(0) == "code"){

            if(command.size == 2){
                var client: Option[Socket] = None
                try {
                    client = Some(new Socket("127.0.0.1", 8888))

                    val is = new DataInputStream(client.get.getInputStream)
                    val os = new DataOutputStream(client.get.getOutputStream)

                    os.writeBytes(s"${command(0).toString};${command(1).toString}\n")

                    var line: Array[String] = is.readLine().split(";")

                    line.foreach(x => println(x))

                } catch {
                    case e: Exception => e.printStackTrace()
                } finally {
                    client foreach (_.close())
                }
            } else {
                println("Not enough arguments")
            }
        } else {
            println("Command Invalids")
        }
    }
}
