/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zahid_3009.model;
import zahid_3009.Mahasiswa.Buku;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MSI GF63
 */
public class BukuDao {
    private List<Buku> data = new ArrayList<Buku>();
    
    public BukuDao()
    {
        data.add(new Buku("001","BUMI ITU INDAH","TREE LIYE","Gramedia","2005"));
        data.add(new Buku("002","SI ANAK EMAS","TREE LIYE","Gramedia","20024"));
        data.add(new Buku("003","AKU INGIN BISA","TREE LIYE","Gramedia","2020"));
    }
    public void insert(Buku b)
    {
        data.add(b);
    }
    
    public void update(int index, Buku b)
    {
        data.set(index, b);
    }
    
    public void delete(int index)
    {
        data.remove(index);
    }

    public Buku getbuku(int index)
    {
        return data.get(index);
    }

    public List<Buku> getAllbuku() 
    {
        return data;
    }
}
