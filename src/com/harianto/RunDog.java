/**
 * Dog
 */
class RunDog {
    private String nama = "Noname";
    private int umur = 0;
    public RunDog(String nm, int um){nama = nm; umur=um;}
    public void bark(){System.out.println("Gug..gug..!");}
    public void sayHello(){
        System.out.println("Hello my name is" + nama + " I'm " + umur + " years old.");
    }
}