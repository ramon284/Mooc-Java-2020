public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory changeHistory = new ChangeHistory();
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity);
        addToWarehouse(initialBalance);
        //changeHistory.add(initialBalance);
    }
    
    @Override
    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        changeHistory.add(this.getBalance());
    }
    
    public double takeFromWarehouse(double amount){
        double x = super.takeFromWarehouse(amount);
        changeHistory.add(this.getBalance());
        return x;
    }
    
    public String history(){
        return this.changeHistory.toString();
    }
    
    public void printAnalysis(){
        System.out.println("Product: "+ super.getName());
        System.out.println("History: "+history());
        System.out.println("Largest amount of product: "+changeHistory.maxValue());
        System.out.println("Smallest amount of product: "+changeHistory.minValue());
        System.out.println("Average: "+changeHistory.average());
    }
}
