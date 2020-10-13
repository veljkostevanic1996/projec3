package processes

def ipConfig = "CTRL+ALT+T /c ipconfig/all".execute().text

println(ipConfig)
