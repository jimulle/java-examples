abstract class StadiumSounds extends Sound
{
    int crowd;

    StadiumSounds(String type, String noise, int crowd) {
        super(type, noise);
        this.crowd = crowd;
    }

    abstract void MakeNoise();

}