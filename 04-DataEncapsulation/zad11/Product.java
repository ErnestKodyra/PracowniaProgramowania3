public class Product
{
    private String name;
    private boolean vegetarian;
    
    public void setName(String name){
        this.name = name;
    }
    public void setVegetarian(boolean vegetarian){
        this.vegetarian = vegetarian;
    }
    public String getName(){
        return name;
    }
    public boolean getVegetarian(){
        return vegetarian;
    }
}
