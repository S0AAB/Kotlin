import kotlin.random.Random
import kotlin.system.exitProcess
fun main() {
    var flagMuerte:Boolean=false
    var numRonda:Int=0


    while(flagMuerte!=true){

        var bala:Int= Random.nextInt(1,7)
        for (i in (1..6)){
            var ruleta:Int=Random.nextInt(1,7)
            println("JUGADOR $i APRIETA EL GATILLO")
            if(bala==ruleta){
                println("-------JUGADOR $i MUERE --------")
                exitProcess(0)
            }
            else{
                println("-------JUGADOR $i VIVE --------")
            }
        }
        numRonda++
        println("////////////NUEVA RONDA :${numRonda+1}////////////")
    }

}