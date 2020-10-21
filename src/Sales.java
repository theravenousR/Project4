/**
 * CECS 277-07
 * Project 4 - Project File I/O
 * Professor Mimi Opkins
 * @author Ryan Ignasiak, Tina Vu, Matthew Chen
 * 10/21/20
 */

/**
 Represents a single sale.
 */
public class Sales
{
    private String name;
    private String service;
    private double amount;
    private String date;

    /**
     Constructs a Sale.
     @param name client name
     @param service service category
     @param amount cost of service
     @param date date of service
     */
    public Sales(String name, String service, double amount, String date)
    {
        this.name = name;
        this.service = service;
        this.amount = amount;
        this.date = date;
    }

    /**
     Retrieve client name.
     @return name
     */
    public String getName()
    {
        return name;
    }

    /**
     Retrieve service category.
     @return service category
     */
    public String getServiceCategory()
    {
        return service;
    }

    /**
     Retrieve amount.
     @return cost of service
     */
    public double getAmount()
    {
        return amount;
    }

    /**
     Retrieve date.
     @return date of service
     */
    public String getDate()
    {
        return date;
    }

    /**
     * Overwrites default toString method
     * @return name, service, amount, and date separated by colons
     * */
    public String toString()
    {
        return name+":"+service+":"+amount+":"+date;
    }
}