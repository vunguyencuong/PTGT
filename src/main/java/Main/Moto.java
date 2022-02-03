
package Main;
import java.util.Scanner;


public class Moto extends PTGT {
    private int power;
    
    public Moto(){}
    
    @Override
    public void nhap()
    {
        super.nhap();
        super.setSeat(2);
        
        System.out.print("Nhap cong suat: ");
        this.power = Integer.parseInt(sc.nextLine());
        
        
    }
    
    @Override
    public void xuat()
    {
        super.xuat();
        
        System.out.println("Cong suat: " + this.power);
        
    }
    
    public int getPower()
    {
        return power;
    }
}
