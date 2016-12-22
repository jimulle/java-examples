public class Cheer extends StadiumSounds
{
    Cheer(int crowd) {
        super("Cheer", "AhhhAAhhhhhAAAAAHHHHHHH", crowd);
    }

    void MakeNoise() {
        System.out.println(this.noise);
        System.out.println(this.crowd + " fans go wild!!!");
        System.out.println(this.noise);
    }
}