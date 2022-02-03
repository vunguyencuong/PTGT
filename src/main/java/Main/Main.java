/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;
import java.util.Scanner;
public class Main{

    public static void main(String[] args) {
        int key = -1;
        Scanner sc = new Scanner(System.in);
        while(key != 0)
        {
            System.out.println("==========MENU==========");
            System.out.println("1.Nhap loai PTGT: (1. Oto, 2. Xe may, 3. Xe tai)");
            System.out.println("2.In danh sach phuong tien giao thong");
            System.out.println("3.Tim kiem phuong tien giao thong");
            System.out.println("4.Sap xep");
            System.out.println("0.Ket thuc chuong trinh!");
            key = Integer.parseInt(sc.nextLine());
            if(key == 1)
            {
                int key2 = Integer.parseInt(sc.nextLine());
                Menu.addPTGT(key2);
            }
            
            if(key == 2)
            {
                Menu.showList();
            }
            
            if(key == 3)
            {
                System.out.println("1.ID");
                System.out.println("2.Hang san xuat");
                System.out.println("3.Nam san xuat");
                System.out.println("4.Gia");
                System.out.println("5.Mau sac");
                System.out.println("6.Cho ngoi");
                System.out.println("7.Khoang nam");
                System.out.println("8.Khoang gia");
                int key2;
                while(true)
                {
                    key2 = Integer.parseInt(sc.nextLine());
                    if(key2 == 1)
                    {
                        System.out.println("Nhap ID tim kiem: ");
                        String id = sc.nextLine();
                        Menu.searchId(id);
                        break;
                    }
                    if(key2 == 2)
                    {
                        System.out.println("Nhap hang san xuat tim kiem: ");
                        String hsx = sc.nextLine();
                        Menu.searchHsx(hsx);
                        break;
                    }
                    if(key2 == 3)
                    {
                        System.out.println("Nhap nam san xuat tim kiem: ");
                        int year = sc.nextInt();
                        Menu.searchYear(year);
                        break;
                    }
                    if(key2 == 4)
                    {
                        System.out.println("Nhap gia tim kiem: ");
                        int price = sc.nextInt();
                        Menu.searchPrice(price);
                        break;
                    }
                    if(key2 == 5)
                    {
                        System.out.println("Nhap mau sac tim kiem: ");
                        String color = sc.nextLine();
                        Menu.searchColor(color);
                        break;
                    }
                    if(key2 == 6)
                    {
                        System.out.println("Nhap so cho ngoi tim kiem: ");
                        int seat = sc.nextInt();
                        Menu.searchSeat(seat);
                        break;
                    }
                    if(key2 == 7)
                    {
                        System.out.println("Nam bat dau: ");
                        int year1 = sc.nextInt();
                        System.out.println("Nam ket thuc: ");
                        int year2 = sc.nextInt();
                        Menu.searchYeartoYear(year1, year2);
                        break;
                    }
                    if(key == 8)
                    {
                        System.out.println("Gia bat dau: ");
                        int price1 = sc.nextInt();
                        System.out.println("Gia ket thuc: ");
                        int price2 = sc.nextInt();
                        Menu.searchPricetoPrice(price1, price2);
                        break;
                    }
                }
            }
            
            if(key == 4)
            {
                System.out.println("1.Hang san xuat");
                System.out.println("2.Gia ban");
                System.out.println("3.Nam");
                int key4 = Integer.parseInt(sc.nextLine());
                while(true)
                {
                    if(key4 == 1)
                    {
                        Menu.sortHsx();
                        break;
                    }
                    if(key4 == 2)
                    {
                        Menu.sortPrice();
                        break;
                    }
                    if(key4 == 3)
                    {
                        Menu.sortYear();
                        break;
                    }
                }
            }
            
            if(key == 0)
            {
                System.out.println("Chuong trinh da ket thuc!");
                break;
            }
        }
    }
    
}
