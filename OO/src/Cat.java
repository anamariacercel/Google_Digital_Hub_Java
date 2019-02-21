public class Cat extends Animal implements Pet {
    private String catName;

    public Cat(String name)
    {
        super(4);
        catName=name;
    }

    public Cat()
    {
        this("");
    }

    public String getName(){
        return catName;
    }

    public  void setName(String n){
        catName=n;
    }

    public void play(){
        System.out.println(catName+"likes to play with string.");
    }

    //@Override
    public void eat(){
        System.out.println("A cat eats fish");
    }
}
