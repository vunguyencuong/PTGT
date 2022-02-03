
package Main;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;
public class PTGT {
    public static Scanner sc = new Scanner(System.in);
    private String id;
    private String hsx;
    private int year;
    private int price;
    private String color;
    private int seat;
    public static int total = 0;
    public boolean checkID(String id)
    {
        Pattern p = Pattern.compile("^[A-Za-z]{2}\\d{3}");
        return (p.matcher(id).matches());
    }
    public boolean checkHsx(String hsx){
        Pattern p = Pattern.compile("\\s+\\W");
        boolean check = p.matcher((hsx)).matches();
        return (!check);
    }
    public boolean checkYear(int year){
        if(year >= 1000 && year <= 9999) return true;
        return false;
    }
    public PTGT(){}
    
    public void nhap(){
        total++;
        System.out.println("Nhap id: ");
        while(true)
        {
            String id = sc.nextLine();
            if(checkID(id))
            {
                this.id = id;
                break;
            }
            else System.out.println("Id khong hop le! Vui long nhap lai");
        }
        System.out.println("Nhap hang san xuat: ");
        while(true)
        {
            String hsx = sc.nextLine();
            if(checkHsx(hsx))
            {
                this.hsx = hsx;
                break;
            }
            else System.out.println("Hsx khong hop le! Vui long nhap lai");
        }
        System.out.println("Nam san xuat: ");
        while(true)
        {
            int year = Integer.parseInt(sc.nextLine());
            if(checkYear(year))
            {
                this.year = year;
                break;
            }
            else System.out.println("Nam san xuat khong hop le! Vui long nhap lai");
        }
        System.out.println("Nhap gia ban: ");
        int price = Integer.parseInt(sc.nextLine());
        this.price = price;
        System.out.println("Nhap mau: ");
        String color = sc.nextLine();
        this.color = color;
        //sc.nextLine();
    }
    
    public void xuat()
    {
        System.out.println("***Thong tin cua phuong tien***");
        System.out.println("Id: " + this.id);
        System.out.println("Hang san xuat: " + this.hsx);
        System.out.println("Nam san xuat: " + this.year);
        System.out.println("Gia ban: " + this.price);
        System.out.println("Mau cua phuong tien: " + this.color);
     
    }
    
    public String getId()
    {
        return id;
    }
    public String getHsx()
    {
        return hsx;
    }
    public  int getYear()
    {
        return year;
    }
    public int getPrice()
    {
        return price;
    }
    public String getColor()
    {
        return color;
    }
    
    public void setSeat(int seat)
    {
        this.seat = seat;
    }
    public int getSeat()
    {
        return seat;
    }
    
}
