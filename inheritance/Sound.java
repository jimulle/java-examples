public class Sound
{
    String type;
    String noise;

    Sound() {
        this("generic", "blurt crackle pop fizzle doodle bang");
    }

    Sound(String type, String noise) {
        this.type = type;
        this.noise = noise;
    }

    void MakeNoise() {
        System.out.println(this.noise);
    }
    void MakeNoise(int i) {
        while (i > 0) {
            this.MakeNoise();
            i--;
        }
    }
}