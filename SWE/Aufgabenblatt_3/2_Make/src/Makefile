BIN = bin
SRC = src

all: run version

# Führt die Main-Klasse aus
run: $(BIN)/Main.class
    java -cp $(BIN) Main

# Kompiliert alle Java-Dateien nach bin/
$(BIN)/Main.class: $(SRC)/*.java 
    javac -d $(BIN) $(SRC)/*.java


$(BIN):
    mkdir -p $(BIN)

clean:
    rm -rf $(BIN)

version:
    java -version