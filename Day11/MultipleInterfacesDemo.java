// MultipleInterfacesDemo.java
// Class implements multiple interfaces
// Run: javac MultipleInterfacesDemo.java && java MultipleInterfacesDemo

interface Readable {
    void read();
}

interface Writable {
    void write(String data);
}

class FileHandler implements Readable, Writable {
    private String storage = "";

    @Override
    public void read() {
        System.out.println("Reading from storage: " + storage);
    }

    @Override
    public void write(String data) {
        storage = data;
        System.out.println("Written to storage: " + data);
    }
}

class MultipleInterfacesDemo {
    public static void main(String[] args) {
        FileHandler fh = new FileHandler();
        fh.write("Hello Day11");
        fh.read();

        // As interface references
        Readable r = fh;
        Writable w = fh;
        r.read();
        w.write("New content via Writable");
        r.read();
    }
}
