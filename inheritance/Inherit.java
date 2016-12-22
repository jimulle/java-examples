public class Inherit
{

    public static void main(String[] args) throws Exception
    {
        Sound s = new Sound();
        Boom b = new Boom();
        Cheer c = new Cheer(1200);

        System.out.println();
        System.out.println("----- Sound MakeNoise()-----");
        s.MakeNoise();
        System.out.println("------ Sound MakeNoise(2)----");
        s.MakeNoise(2);
        System.out.println();

        System.out.println("---- Boom MakeBoom() ------");
        // explicitly uses super.MakeNoise()
        b.MakeBoom();
        System.out.println("---- Boom MakeNoise() ------");
        // uses this.MakeNoise() (subclass) 
        b.MakeNoise();
        System.out.println("-----Boom MakeNoise(2)-----");
        // uses super.MakeNoise(i) because subclass does not override it
        // but super.MakeNoise(i) uses the subclass MakeNoise() in it's loop'
        b.MakeNoise(2);
        System.out.println("----------");
        System.out.println();

        System.out.println();
        System.out.println("----- Cheer MakeNoise()-----");
        // cheer overrides the abstract MakeNoise() method from StadiumSounds
        c.MakeNoise();
        System.out.println("------ Cheer MakeNoise(2)----");
        c.MakeNoise(2);
        System.out.println();
    }

}