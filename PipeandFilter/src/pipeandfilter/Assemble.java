package pipeandfilter;

public class Assemble{
    
    Assemble() {
        making_phase mp= new making_phase();
        String V=mp.getVegetable();
        String S=mp.getSauce();
        String P=mp.getPizzaBase();
        System.out.println("Assembling "+P+", "+S+" and "+V+"...");
        System.out.println("Assembling Done!");
    }
    public String getAssembled(){
        return "Assembled part...";
    }
    }
