public class AeroPlan extends Vehicle{
    @Override
    public void Walk() {
        System.out.println("Aeroplan is Flying"); 
    }
    @Override
    public void fuel() {
         System.out.println("Fuels"); 
    }    
    public static void main (String[] args){
        AeroPlan garuda = new AeroPlan();
        garuda.function();
        garuda.fuel();
        garuda.Walk();
    }
}

