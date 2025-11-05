#Variablen
BIN = bin
CLASS = $(BIN)/Main.class $(BIN)/A.class $(BIN)/B.class


all: version run

version:
	java -version


$(BIN):
	mkdir $(BIN)

# Regel zum Kompilieren der Java-Dateien

$(BIN)/*.class: *.java 
	javac -d $(BIN) 


run: $(CLASS)
	java -cp $(BIN) Main

# Aufräumen
clean:
	rm -rf $(BIN)

