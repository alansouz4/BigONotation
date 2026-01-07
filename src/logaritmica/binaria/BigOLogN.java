
void binary(List<Integer> array ) {
    List<Integer> list = Arrays.asList(1, 2, 3);

    list.stream().filter(
            e -> e % 2 == 0
    )
            .forEach(IO::println);
}

void main(String[] args) {
    binary(Arrays.asList(1, 2, 3));
}