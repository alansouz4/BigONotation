import static java.lang.IO.println;

void returnElements(List<String> elements) {
    List<String> concatenated = new ArrayList<>();

    for(String element : elements) {
        String s = element + " é gente fina";
        concatenated.add(s);
        println(concatenated);
    }
}

void main(String[] args) {
    returnElements(List.of("Alan", "Jose", "Francisco", "Maria", "Madalena"));
}