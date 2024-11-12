class Animal {
    Animal(){
        System.out.println("Animal created");
    }
    void barking(){
        System.out.println("boobooo");
    }
}
    class Dog extends Animal{
        Dog(){
            super();
            System.out.println("Dog is created");
        }
        void barking(){
            System.out.println("boobooo");
        }
    }
    class Main{
    public static void main(String args[]){
        Dog d =new Dog();
        d.barking();
        Animal d1 = new Animal();
        d1.barking();
    }
    }
