/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sig.app.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Moaaz
 */
public class InvoiceHeader {
    private int num;
    private String customer;
    private Date invoiceDate;
    private ArrayList<InvoiceLine> Lines;
    

    public InvoiceHeader() {
    }

    public InvoiceHeader(int num, String customer, Date invoiceDate) {
        this.num = num;
        this.customer = customer;
        this.invoiceDate = invoiceDate;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public ArrayList<InvoiceLine> getLines() {
        return Lines;
    }

    public void setLines(ArrayList<InvoiceLine> Lines) {
        this.Lines = Lines;
        
    }
    public double getInvoiceTotal()
    {
     double sum=0.0;
     for (int i =0; i<Lines.size();i++){
         sum+=Lines.get(i).getLineTotal();
     }
     return sum;
    }
    
    
}
