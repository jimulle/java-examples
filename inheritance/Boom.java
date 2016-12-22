public class Boom extends Sound {
    Boom() {
        super("boom", "kaBOOOOOOOOOM");
    }

    void MakeBoom() {
        // repeat the sound 3 times
        int i = 3;
        while (i > 0) {
            super.MakeNoise();
            i--;
        }
    }

    void MakeNoise() {
        super.MakeNoise();
        System.out.println("BOOM: ");
    }
}