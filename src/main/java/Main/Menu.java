
package Main;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;

public class Menu {
    private static ArrayList<PTGT> list = new ArrayList();
    public static void addPTGT(int key)
    {
        if(key == 3)
        {
            PTGT a = new Vans();
            a.nhap();
            list.add(a);
        }
        if(key == 2)
        {
            PTGT b = new Moto();
            b.nhap();
            list.add(b);
        }
        if(key == 1)
        {
            PTGT c = new Car();
            c.nhap();
            list.add(c);
        } 
    }
    
    public static void showList()
    {
        int check = 0;
        System.out.println("***Danh sach Oto***");
        for(PTGT i : list)
        {
            if(Car.class.isInstance(i))
            {
                i.xuat();
                check = 1;
            }
        }
        if(check == 0) System.out.println("Khong co oto");
        System.out.println("====================");
        check = 0;
        System.out.println("***Danh sach xe may***");
        for(PTGT i : list)
        {
            if(Moto.class.isInstance(i))
            {
                i.xuat();
                check = 1;
            }
        }
        if(check == 0) System.out.println("Khong co xe may");
        System.out.println("====================");
        check = 0;
        System.out.println("***Danh sach xe tai***");
        for(PTGT i : list)
        {
            if(Vans.class.isInstance(i))
            {
                i.xuat();
                check = 1;
            }
        }
        if(check == 0) System.out.println("Khong co xe tai");
        System.out.println("====================");
        System.out.println("Tong so phuong tien: " + PTGT.total);
    }
    
    public static void searchId(String id)
    {
        int check = 0;
        for(PTGT i : list)
        {
            if(i.getId().equals(id))
            {
                i.xuat();
                check = 1;
            }
        }
        if(check == 0 ) System.out.println("Khong co phuong tien");
    }
    
    public static void searchHsx(String hsx)
    {
        int check = 0;
        for(PTGT i : list)
        {
            if(i.getHsx().equals(hsx))
            {
                i.xuat();
                check = 1;
            }
        }
        if(check == 0) System.out.println("Khong co phuong tien");
    }
    
    public static void searchYear(int year)
    {
        int check = 0;
        for(PTGT i : list)
        {
            if(i.getYear() == year)
            {
                i.xuat();
                check = 1;
            }
        }
        if(check == 0) System.out.println("Khong co phuong tien");
    }
    
    public static void searchPrice(int price)
    {
        int check = 0;
        for(PTGT i : list)
        {
            if(i.getPrice() == price)
            {
                i.xuat();
                check = 1;
            }
        }
        if(check == 0) System.out.println("Khong co phuong tien");
    }
    
    public static void searchColor(String color)
    {
        int check = 0;
        for(PTGT i : list)
        {
            if(i.getColor().equals(color))
            {
                i.xuat();
                check = 1;
            }
        }
        if(check == 0) System.out.println("Khong co phuong tien");
    }
    
    public static void searchSeat(int seat)
    {
        int check = 0;
        for(PTGT i : list)
        {
            if(i.getSeat() == seat)
            {
                i.xuat();
                check = 1;
            }
        }
        if(check == 0) System.out.println("Khong co phuong tien");
    }
    
    public static void searchYeartoYear(int year1, int year2)
    {
        int check = 0;
        for(PTGT i : list)
        {
            if(i.getYear() >= year1 && i.getYear() <= year2)
            {
                i.xuat();
                check = 1;
            }
        }
        if(check == 0) System.out.println("Khong co phuong tien");
    }
    
    public static void searchPricetoPrice(int price1, int price2)
    {
        int check = 0;
        for(PTGT i : list)
        {
            if(i.getPrice() >= price1 && i.getPrice() <= price2)
            {
                i.xuat();
                check = 1;
            }
        }
        if(check == 0) System.out.println("Khong co phuong tien");
    }
    
    public static void sortHsx()
    {
        Comparator<PTGT> cmp = Comparator.comparing(PTGT::getHsx);
        list.sort(cmp);
    }
    
    public static void sortPrice()
    {
        Comparator<PTGT> cmp = Comparator.comparing(PTGT::getPrice);
        list.sort(cmp);
    }
    
    public static void sortYear()
    {
        Comparator<PTGT> cmp = Comparator.comparing(PTGT::getYear);
        list.sort(cmp);
    }
}
