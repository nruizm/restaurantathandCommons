package co.unicauca.restaurantathand.commons.domain;

import java.util.Date;
import java.util.List;

/**
 *  Menu de un Restaurante 
 * 
 * @author Mannuel Fernando Granoble
 *         Michel Andrea Gutierrez Vallejo
 *         Ximena Quijano Gutierrez
 *         Nathalia Ruiz Menses
 * 
 */
public class Menu {
    //
    private String atrIdMenu;
    private String atrNomMenu;
    private Date atrFecVimenu;
    private List<Dish> atrlistaPlatos;
    private String atrTypeMenu;

    public Menu(String atrIdMenu, String atrNomMenu, Date atrFecVimenu, String atrTypeMenu) {
        this.atrIdMenu = atrIdMenu;
        this.atrNomMenu = atrNomMenu;
        this.atrFecVimenu = atrFecVimenu;
        this.atrTypeMenu = atrTypeMenu;
    }

    public Menu() {
        
    }

    public String getAtrTypeMenu() {
        return atrTypeMenu;
    }

    public void setAtrTypeMenu(String atrTypeMenu) {
        this.atrTypeMenu = atrTypeMenu;
    }
 
    
    
    public String getAtrIdMenu() {
        return atrIdMenu;
    }

    public void setAtrIdMenu(String atrIdMenu) {
        this.atrIdMenu = atrIdMenu;
    }

    public String getAtrNomMenu() {
        return atrNomMenu;
    }

    public void setAtrNomMenu(String atrNomMenu) {
        this.atrNomMenu = atrNomMenu;
    }

    public Date getAtrFecVimenu() {
        return atrFecVimenu;
    }

    public void setAtrFecVimenu(Date atrFecVimenu) {
        this.atrFecVimenu = atrFecVimenu;
    }

    public List<Dish> getAtrlistaPlatos() {
        return atrlistaPlatos;
    }

    public void setAtrlistaPlatos(Dish prmPlatos) {
        atrlistaPlatos.add(prmPlatos);
    }
    
    
    
}
