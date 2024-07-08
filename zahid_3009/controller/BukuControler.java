/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zahid_3009.controller;
import zahid_3009.Mahasiswa.Buku;
import zahid_3009.view.FromBuku;
import zahid_3009.model.BukuDao;
import java.util.HashSet;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MSI GF63
 */
public class BukuControler 
{
    FromBuku formBuku;
    Buku Buku;
    BukuDao BukuDao;
    int index;
    
    public BukuControler(FromBuku formBuku)
    {
        this.formBuku = formBuku;
        BukuDao = new BukuDao();
    }
    
    public void cancel()
    {   int index = formBuku.getTBLbuku().getSelectedRow();
        formMataKuliah.getTxtNama().setText("");
        formMataKuliah.getTxtNobp().setText("");
        formMataKuliah.getTxtkls().setText("");
        formMataKuliah.getTxtMatkul().setText("");
        formMataKuliah.getTxtsks().setText("");
        isiSemester();
    }
    
    
}
