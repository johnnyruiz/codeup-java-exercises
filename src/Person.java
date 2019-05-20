class Person {

    private long id;
    private String name;
    private String favoriteColor;

    private Person(long personId, String personName){
        id = personId;
        name = personName;
        favoriteColor = "Unassigned";
    }
    private Person(long personId, String personName, String color) {
        id = personId;
        name = personName;
        favoriteColor = color;
    }

    private String getInfo(){
        return String.format("Hello my name is %s, my favorite color is %s", name, favoriteColor);

    }
    public String getFavoriteColor(){
        return this.favoriteColor;
    }


    public static void main(String[] args) {
        Person p1 = new Person(1,"Rick", "blue");
        Person p2 = new Person(2,"Ana", "pink");
        Person p3 = new Person(3, "Morty");
        System.out.println(p1.getInfo());
        System.out.println(p2.getInfo());
        System.out.println(p3.getInfo());
        //use this for Java Project
        System.out.println(p2.getFavoriteColor());
    }
}