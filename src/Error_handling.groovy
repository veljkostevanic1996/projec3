
    def lista = [1,2,3,4]

    try{

        println(lista.get(7))
    }
    catch(Exception e){

        println("Ne postoji taj indeks")
        println(e.message)
    }
    finally {

        println("Ovo ce uvek da se izvrsava")
    }


