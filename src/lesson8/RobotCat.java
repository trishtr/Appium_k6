package lesson8;

public class RobotCat {

    private String name;
    private String productionDate;
//constructor
    public RobotCat() {
    }
//constructor
    public RobotCat(String name, String productionDate) {
        this.name = name;
        this.productionDate = productionDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate;
    }

    public String charge(){
        return "charging";
    }
}
