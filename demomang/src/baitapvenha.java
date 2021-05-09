import java.util.Scanner;

public class baitapvenha {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int size = 0;
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("nhập lựa chọn");
            choice = sc.nextInt();
            System.out.println("Menu");
            System.out.println("1 :Nhập mảng kích thước từ O đến 100");
            System.out.println("2 : Hiển thị mảng được nhập ");
            System.out.println("3: Tìm Số lớn nhất trong mảng ");
            System.out.println("4 : Liệt kê các số chẵn có trong mảng ");
            System.out.println("5:Tính Tổng các số chẵn có trong mảng");
            System.out.println("6: Chèn giá trị vào mảng  ");
            System.out.println("7: Xóa phần tử khỏi mảng");
            System.out.println("8: Đảo ngược mảng ban đầu");
            System.out.println("9: Hiển thị các số nguyên tố có trong mảng");
            System.out.println("10: Sắp xếp mảng theo thứ tự giảm dần");
            System.out.println("11: Thoát");
            System.out.println("Nhập lựa chọn của bạn");
            switch (choice) {
                case 1:
                    size = inputsize();
                    inputarr(arr, size);
                    break;
                case 2:
                    displayarr(arr, size);
                    break;
                case 3:
                    findmaxindex(arr, size);
                    break;
                case 4:
                    listeven(arr, size);
                    break;
                case 5:
                    sumeven(arr, size);
                    break;
                case 6:
                    addindex(arr,size);
                    break;
                case 7:
                    deleteindex(arr,size);
                    break;
                case 8:
                    resverarr(arr,size);
                    break;
                case 9:
                    primenum(arr,size);
                    break;
                case 10:
                    sort(arr,size);
                    break;
                case 11:
                    System.exit(0);
                    break;
                default:
                    System.out.println("bạn không chọn lựa chọn nào cả");
                    break;
            }
        } while (choice >= 1 && choice <= 11);
    }

    static int inputsize() {
        int N;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập kích thước của mảng 0<n<100");
            N = sc.nextInt();
        } while (N <= 0 || N > 100);
        return N;
    }

    static void inputarr(int[] arr, int N) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mảng gồm N phần tử");
        for (int i = 0; i < N; i++) {
            System.out.print("arr[" + i + "]=");
            arr[i] = sc.nextInt();
        }
    }

    static void displayarr(int[] arr, int N) {
        System.out.println("Mảng của bạn là ");
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void findmaxindex(int[] arr, int N) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("số lớn nhất là " + max);
    }

    static void listeven(int[] arr, int N) {
        for (int i = 0; i < N; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print("các số chẵn là: ");
                System.out.println(arr[i] + ",");
            }
        }
    }

    static void sumeven(int[] arr, int N) {
        int sum = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] % 2 == 0) {
                sum = sum + arr[i];
            }
        }

        System.out.println("Tổng các số chẵn là " + sum);

    }
    static void addindex(int[]arr, int N){
        Scanner sc  =new Scanner(System.in);
        System.out.println("Nhập giá trị cần chèn vào");
        int value = sc.nextInt();
        System.out.println("bạn muốn chèn ở vị trí nào trong mảng");
        int index = sc.nextInt();
        if(index<0||index>100){
            System.out.println("không thẻ chèn vào vị trí nằm ngoài mảng");
        }else {
            arr[index]=value;
            for (int i =0;i<index;i++){
                System.out.print(arr[i]+",");
            }
            for (int i =index;i<N;i++){
                System.out.print(arr[i]+",");
            }
        }
    }
    static void deleteindex(int[]arr, int N){
        Scanner sc  =new Scanner(System.in);
        System.out.println("Nhập vị trí bạn muốn xóa");
        int index = sc.nextInt();
        for(int i=0;i<index-1;i++){
            System.out.print(arr[i] +",");
        }
        for (int i=index;i<N;i++){
            System.out.print(arr[i] +",");
        }

    }
    static void resverarr(int[]arr,int N){
        for(int i =0;i<N/2;i++){
            int temp = arr[i];
            arr[i]= arr[N-1-i];
            arr[N-1-i]=temp;

        }
        displayarr(arr,N);
    }
    public static boolean check(int N){
        if (N<2) {
            return false;
        } else {
            for(int i =2 ; i<N;i++){
                if(N%i==0){
                    return  false;
                }
            }
            return true;
        }

    }
    static void primenum(int[]arr,int N){
        System.out.println("Các số nguyên tố là");
            for(int i=0;i<N;i++){
                if(check(arr[i])){
                    System.out.print(arr[i]+",");
                }
            }
        System.out.println();
    }

    static void sort(int[]arr,int N){
        for(int i =0;i<N;i++){
            for(int j =i+1;j<N;j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]= temp;
                }
            }
        }
        displayarr(arr,N);
    }

}


