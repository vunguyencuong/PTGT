
package Main;
import java.util.Scanner;

public class Car extends PTGT {
    private String engine;
    
    public Car(){}
    
    @Override
    public void nhap()
    {
        super.nhap();
        
        System.out.print("Nhap kieu dong co: ");
        String engine = sc.nextLine();
        this.engine = engine;
        
        System.out.println("So cho ngoi: ");
        int seat = sc.nextInt();
        super.setSeat(seat);
        
        
    }
    
    @Override
    public void xuat()
    {
        super.xuat();
        
        System.out.println("Kieu dong co: " + this.engine);
        System.out.println("So cho ngoi: " + super.getSeat());
        
    }
    
    public String getEngine()
    {
        return engine;
    }
}
