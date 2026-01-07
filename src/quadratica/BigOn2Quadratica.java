import static java.lang.IO.println;

void teste() {
    ArrayList<String> arr = new ArrayList<>();
    arr.add("A");
    arr.add("B");
    arr.add("C");

    String target = "CA";

    for(String i : arr) {
        for(String j : arr) {
            println(i + j);
            if((i + j).equals(target)) {
                println("true");
                return;
            }
        }
    }
    println("false");
}

void main(String[] args) {
    teste();
}