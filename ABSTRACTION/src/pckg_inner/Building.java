package pckg_inner;

public class Building {

    private String street;
    private int number;
    private int floorNum;
    private BuildingFloor[] floors;


    public Building(String street, int number){
        this.number = number;
        this.street = street;
    }

    public Building(String street, int number, int floorNum){
        this(street, number);
        this.floorNum = floorNum;
        buildBuilding();
    }

    public void provideBuildingInfo(){
        System.out.println("Street: " + street);
        System.out.println("Number: " + number);
        System.out.println("Floor: " + floorNum);
        System.out.println(getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()));
        for(BuildingFloor floor : floors){
            floor.getFloorInfo();
        }
    }
    class BuildingFloor{
        public void getFloorInfo(){
            System.out.println(getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()));
            System.out.println("This is some building floor info...");
        }
    }

    private void buildBuilding(){
        floors = new BuildingFloor[floorNum];
        for(int k=0; k < floorNum; k++){
            floors[k] = new BuildingFloor();
        }
    }

    public void getSomeFloorInfo(){
        BuildingFloor buildingFloor = new BuildingFloor();
        buildingFloor.getFloorInfo();
    }
    public void specialLocalBuildingFeature(){
        class BuildingCompanyService{

            String name;
            String registeredIn;

            BuildingCompanyService(String name, String registeredIn){
                this.name = name;
                this.registeredIn = registeredIn;
            }

            void performSomeServiceOnBuilding(){
                System.out.println("Performing maintance on; " + street + number);
            }
        }

        BuildingCompanyService buildingCompanyService = new BuildingCompanyService("sv","Cro");
        buildingCompanyService.performSomeServiceOnBuilding();
    }
}

