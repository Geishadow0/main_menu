import java.util.Scanner;

public class main_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int menu;
        int col = 0, row = 0, check = 0, row1 = 0, col1 = 0;
        float[][] arr = new float[10000][10000];
        float[][] arr1 = new float[10000][10000];

        do {
            System.out.print("\n1.Input matrix\n");
            System.out.print("2.Display matrix\n");
            System.out.print("3.Penjumlahan matrix\n");
            System.out.print("4.perkalian matrix\n");
            System.out.print("5.keluar\n");
            menu = sc.nextInt();
            switch (menu) {

                case 1:
                    System.out.print("Array ke 1----------------------------------------------------------------\n");
                        System.out.println("Enter The Number Of Matrix Rows");
                    row = sc.nextInt();
                    System.out.println("Enter The Number Of Matrix Columns");
                    col = sc.nextInt();
                    System.out.print("Array ke 2----------------------------------------------------------------\n");
                    System.out.println("Enter The Number Of Matrix Rows");
                    row1 = sc.nextInt();
                    System.out.println("Enter The Number Of Matrix Columns");
                    col1 = sc.nextInt();
                    dependacies.matrix(arr, row, col, arr1, row1, col1);
                    check = 1;
                    break;
                case 2:
                    if (check == 1) {
                        dependacies.print(arr, row, col, arr1, row1, col1);
                        break;
                    } else {
                        System.out.print("Error");
                        break;
                    }
                case 3:
                    if (check == 1) {
                        if (col == col1 && row == row1) {
                            dependacies.sum(arr, row, col, arr1, row1, col1);
                            break;
                        } else {
                            System.out.print("Array tidak dapat dihitung");
                            break;
                        }
                    } else {
                        System.out.print("Error");
                        break;
                    }
                case 4:
                    if (check == 1) {
                        if (col == col1) {
                            dependacies.mult(arr, row, col, arr1, row1, col1);
                            break;
                        }
                        else{
                            System.out.print("Array tidak dapat dihitung");
                            break;
                        }
                    } else {
                        System.out.print("Error");
                        break;
                    }
                case 5:
                    int x=0;
                    while(x==0){
                        System.out.println("Apakah anda yakin ingin keluar?(y/n)");
                        String choice=sc.next();
                        if (choice.equals("y") || choice.equals("Y")){
                            System.exit(1);
                        }
                        else if (choice.equals("n")||choice.equals("N")){
                            x=1;
                        }
                        else{
                            System.out.println("Input salah");
                        }
                    }
                    break;
                default:
                    break;
            }


        } while (true);


    }
}