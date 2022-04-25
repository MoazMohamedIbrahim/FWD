/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sig.app.model;

/**
 *
 * @author Moaaz
 */
public class InvoiceLine {
    
    private String item;
    private double Price;
    private int count;
    private InvoiceHeader header;

    public InvoiceLine() {
    }

    public InvoiceLine(InvoiceHeader header, String item, double Price, int count) {
        this.header = header;
        this.item = item;
        this.Price = Price;
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public InvoiceHeader getHeader() {
        return header;
    }

    public void setHeader(InvoiceHeader header) {
        this.header = header;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }
    public double getLineTotal()
    {
        return Price * count;
        
    }
    
}
