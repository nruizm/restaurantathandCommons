package co.unicauca.restaurantathand.commons.domain;

/**
 *
 *@author Mannuel Fernando Granoble
 *         Michel Andrea Gutierrez Vallejo
 *         Ximena Quijano Gutierrez
 *         Nathalia Ruiz Menses
 */
public class Dish 
{
    //Id
    private String atrIdDish;
    //Nombre
    private String atrNameDish;
    //Precio
    private double atrPriceDish;
    //Descripcion
    private String atrDescriptionDish;
    
    private String atrTypeDish;

    public Dish(String atrIdFood, String atrNameFood, double atrPriceFood, String Description, String atrTypeDish) {
        this.atrIdDish = atrIdFood;
        this.atrNameDish = atrNameFood;
        this.atrPriceDish = atrPriceFood;
        this.atrDescriptionDish = Description;
        this.atrTypeDish = atrTypeDish;
    }

    public Dish() {
        
    }

    public String getAtrTypeDish() {
        return atrTypeDish;
    }

    public void setAtrTypeDish(String atrTypeDish) {
        this.atrTypeDish = atrTypeDish;
    }

    
    public String getAtrIdDish() {
        return atrIdDish;
    }

    public void setAtrIdDish(String atrIdDish) {
        this.atrIdDish = atrIdDish;
    }

    public String getAtrNameDish() {
        return atrNameDish;
    }

    public void setAtrNameDish(String atrNameDish) {
        this.atrNameDish = atrNameDish;
    }

    public double getAtrPriceDish() {
        return atrPriceDish;
    }

    public void setAtrPriceDish(double atrPriceDish) {
        this.atrPriceDish = atrPriceDish;
    }

    public String getAtrDescriptionDish() {
        return atrDescriptionDish;
    }

    public void setAtrDescriptionDish(String atrDescriptionDish) {
        this.atrDescriptionDish = atrDescriptionDish;
    }
    
    
    
    
}
