package A1.TwoFer

fun twofer (nome: String?){
    if (nome == null || nome == ""){
        println("Um para voce, um para mim.\n")
    } else if (nome == " "){
        println("Um para voce, um para mim.\n")
    } else{
        println("Um para " + nome + ", um para mim.\n")

    }

}

