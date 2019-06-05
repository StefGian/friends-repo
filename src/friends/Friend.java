package friends;

public class Friend {
    
    private String name;
    private int age;
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        this.age= age;
    }
    
    public int AgeIn2040 (){
        int result = ((2040 - 2019) + age);
        return result;
    }
    
    public int ageInPast (){
        int result = (age -(2019-1970));
        if (result < 0){
            System.out.println("Not born.");
        }
        return result;
    }
    
    }
