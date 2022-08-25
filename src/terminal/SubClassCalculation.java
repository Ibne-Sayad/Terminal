/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terminal;

/**
 *
 * @author Tonoy
 */
public class SubClassCalculation extends SuperClassCalculation{
    
    @Override
    public double mealCostCalculate(){
        personCost=personalTotalMeal*mealRate;
        return personCost;
    }
    
    
}
