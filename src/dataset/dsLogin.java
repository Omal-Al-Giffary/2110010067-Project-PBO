/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;
import java.util.ArrayList;
/**
 *
 * @author Horizz
 */
public class dsLogin {
    
  private ArrayList<Integer> idLogin;
    private ArrayList<String> username;
    private ArrayList<String> password;
    private ArrayList<String> owners;
    private ArrayList<String> kasirs;
    
    public dsLogin() {
        idLogin = new ArrayList<Integer>();
        username = new ArrayList<String>();
        password = new ArrayList<String>();
        owners = new ArrayList<String>();
        kasirs = new ArrayList<String>();
    }
    
    public void tambahIdLogin(int id) {
        idLogin.add(id);
    }
    
    public ArrayList<Integer> getDataSetIdLogin() {
        return idLogin;
    }
    
    public void tambahUsername(String user) {
        username.add(user);
    }
    
    public ArrayList<String> getDataSetUsername() {
        return username;
    }
    
    public void tambahPassword(String pass) {
        password.add(pass);
    }
    
    public ArrayList<String> getDataSetPassword() {
        return password;
    }
    
    public void tambahOwner(String own) {
        owners.add(own);
    }
    
    public ArrayList<String> getDataSetOwners() {
        return owners;
    }
    
    public void tambahKasir(String kas) {
        kasirs.add(kas);
    }
    
    public ArrayList<String> getDataSetKasirs() {
        return kasirs;
    }
    
    public void tambahData(int idLogin, String username, String password, String owner, String kasir) {
        this.idLogin.add(idLogin);
        this.username.add(username);
        this.password.add(password);
        this.owners.add(owner);
        this.kasirs.add(kasir);
    }
}
