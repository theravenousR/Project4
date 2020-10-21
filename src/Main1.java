/**
 * CECS 277-07
 * Project 4 - Project File I/O
 * Professor Mimi Opkins
 * @author Ryan Ignasiak, Tina Vu, Matthew Chen
 * 10/21/20
 */
import java.io.*;
import java.util.*;

/**
 * Gathers client info to print to output file salesoutput.txt
 * */
public class Main1 {

    /**
     * Default constructor for SalesSlip class
     * */
    public Main1(){}

    /**
     * Prompts the user for service, name, sale amount, and date data, which is then used to create a Sales object,
     * which is then stored in an ArrayList
     */
    private static ArrayList<Sales> clientInfo()
    {
        String choice = "";
        ArrayList<Sales> sales = new ArrayList<>();

        while (!choice.equalsIgnoreCase("q")) {
            System.out.println("Add new entry (y) or (q) to quit:");
            choice = CheckInput.getString();

            if (choice.equalsIgnoreCase("q")) {
                break;
            }
            System.out.println("Enter the service type:");
            String service = CheckInput.getString();
            System.out.println("Enter the client's name:");
            String name = CheckInput.getString();
            System.out.println("Enter the sale amount:");
            double amount = CheckInput.getDouble();
            System.out.println("Enter the date like so: Jan 1, 2020 - 01/01/20");
            String date = CheckInput.getDate();

            sales.add(new Sales(name, service, amount, date));
        }
        return sales;
    }

    /**
     Writes sale to writer.
     @param out PrintWriter to which sale is written
     @param sale sale information
     */
    private static void writeSale(PrintWriter out, Sales sale)
    {
        out.print(sale.getName());
        out.print(";");
        out.print(sale.getServiceCategory());
        out.print(";");
        out.print(sale.getAmount());
        out.print(";");
        out.print(sale.getDate());
        out.println();
    }

    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter out = new PrintWriter("salesoutput.txt");
        ArrayList<Sales> sales = clientInfo();
        for (Sales s : sales) {
            System.out.println(s);
            writeSale(out, s);
        }
        out.close();
    }
}
