package AnimalProject;

public class Animal {
    private String name;
    private int month;
    private String species;

    public Animal(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void eat(){
        System.out.println(this.getName()+"吃东西");
    }

    public void eat(String name){
        System.out.println(name+"吃东西");
    }

    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        Animal temp = (Animal)obj;
        if (this.getName().equals(temp.getName())&&(this.getMonth()==temp.getMonth())){
            return true;
        }else {
            return false;
        }
    }
    
}
