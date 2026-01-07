import java.util.ArrayList;

void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>();
    arr.add(1);
    arr.add(2);
    arr.add(3);

    for (Integer integer : arr) {
        IO.print(integer);
    }
}
