/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul_10;

import javax.swing.JOptionPane;

/**
 *
 * @author Abel Bima Wiratama
 */
class setor {
    private int saldo;
    public int tab = 50000;
    public void menabung (int bal, int s){
        if(s%100!=0)
            JOptionPane.showMessageDialog(null, "Mesin ATM BRI tidak menerima uang koin \nSilahkan ulangi kembali!","Transaksi Gagal",0);
         else if (s<50000)
             JOptionPane.showMessageDialog(null, "Besaran minimal setor tunai adalah Rp 50000,00","ERROR",0);
         else if(s>=50000){
             saldo = tab+bal+s;
             JOptionPane.showMessageDialog(null, "Saldo anda saat ini sebesar : "+ saldo);
         }
    }  
    public int getsaldo(){
        return saldo;
    }
}
