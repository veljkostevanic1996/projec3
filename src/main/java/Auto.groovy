class Auto extends Vozila{

    //String boja
    //def ime
    //int brojVrata
    //int kapacitetMotora
    //double snagaMotora

    void promeniBrzinu(def brzina){

        println("Brzina je promenjena u $brzina")
    }

    void skreni(String strana){

        println("Auto je skrenuo u $strana strana ")
    }

    void statujMotor(){
        println("Motor je startovan")
    }

    static void main(String[] args) {

        Auto yugo = new Auto()

        yugo.boja="Crvena"
        yugo.brojVrata=5
        yugo.ime="koral"

        yugo.promeniBrzinu(3)
        yugo.statujMotor()

        println("Boja auta je $yugo.boja")
    }
}
