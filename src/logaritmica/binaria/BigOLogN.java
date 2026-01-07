
public int binarySearch(int[] arr, int target) {
    int left = 0;
    int right = arr.length - 1;

    while (left <= right) {
        int mid = left + (right - left) / 2; // posição do meio

        if (arr[mid] == target) {
            return mid; // encontrou o elemento
        } else if (arr[mid] < target) {
            left = mid + 1; // descarta metade esquerda
        } else {
            right = mid - 1; // descarta metade direita
        }
    }
    return -1; // não encontrado
}


void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7};
    int target = 5;

    int result = binarySearch(arr, target);
    System.out.println("Índice do elemento: " + result);

}