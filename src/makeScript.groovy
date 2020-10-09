
def createSomeFile(){

    def createFile = ("mkdir copyFile").execute()
    def copyFileToFile = ("cp probaFile copyFile").execute()
}