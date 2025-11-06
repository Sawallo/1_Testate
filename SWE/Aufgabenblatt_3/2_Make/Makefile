BIN = bin
SRC = src

all: run version


run: $(BIN)/Main.class
	java -cp $(BIN) Main


$(BIN)/Main.class: $(SRC)/*.java 
	javac -d $(BIN) $(SRC)/*.java


$(BIN):
	mkdir -p $(BIN)

clean:
	rm -rf $(BIN)

version:
	java -version
