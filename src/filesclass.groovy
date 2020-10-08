
File file = new File("probaFile.txt")

def fileContent = file.text

//println(fileContent)

def lista = file.collect{ it}

//println(lista)

def line
file.withReader {reader ->
    while ((line = reader.readLine()) != null){
        println("ajde izmeni")
        println(line)
    }
}
