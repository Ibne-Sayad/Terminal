/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terminal;

/**
 *
 * @author Akin_vai
 */
public abstract class SuperClassCalculation implements SuperClassCalculationInterface{
    double houseRent;
    double internetBill;
    double buaBill;
    double electricityBill;
    double extraCost;
    double totalCost;
    double extraMealCost=100;
    
    double totalBazar;
    double totalMeal;
    double mealRate;
    
    double personalTotalBazar;
    double personalTotalMeal;
    double personCost=0;
    
    double loan=0;
    double owing=0;
    
    public SuperClassCalculation(){
        
    }
    
    //**************MEAL RATE BER KRAR JNNO******************//
    
    public double mealRateCalculate(){
        mealRate=totalBazar/totalMeal;
        return mealRate;
    }
    
    //**************PER PERSON ER MEAL COST BER KRAR JNNO******************//
    
     public double mealCostCalculate(){
        personCost=personalTotalMeal*mealRate+extraMealCost;
        return personCost;
    }
    
    //**************MANEGER TAR KACHE KTO TAKA PABE******************//
     
    public double loanCalculate(){
        if(personCost>personalTotalBazar){
            loan=personCost-personalTotalBazar;
        }
        else{
            loan=0;
        }
        return loan;
    }
    
    //**************SE MANEGER ER KACHE KTO TAKA PABE******************//
    
    public double owingCalculate(){
        if(personalTotalBazar>personCost){
            owing=personalTotalBazar-personCost;
        }
        else{
            owing=0;
        }
        return owing;
    }
   
}
