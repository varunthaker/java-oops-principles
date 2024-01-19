class Human 
{
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
 
}


class Demo 
{
        public static void main(String a[]) 
    {   
        Human obj1 = new Human();

        obj1.setAge(29);
        obj1.setName("Mann");

        System.out.println(obj1.getName() + " Your Age is " + obj1.getAge());
    
    }
}




