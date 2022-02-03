
package Main;

import java.util.Scanner;


public class Vans extends PTGT{
    private int weight;
    
    public Vans(){}
    
    @Override
    public void nhap()
    {
        super.nhap();
        
        System.out.print("Nhap trong tan: ");
        this.weight = Integer.parseInt(sc.nextLine());
        super.setSeat(1);
    }
    
    @Override
    public void xuat()
    {
        super.xuat();
        
        System.out.println("Trong tan: " + this.weight);
    }
    
    public int getWeight()
    {
        return weight;
    }
            
}
