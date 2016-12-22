public class ChristmasTree extends Tree implements IChristmasTree {
    public boolean lights_on = false;
    public int lights = 0;

    ChristmasTree(String type, Boolean drops, int initial_lights) {
        super(type, drops);
        this.lights += initial_lights;
    }
    
    public boolean CheckLights() {
        return this.lights_on;
    }

    public void TurnLightsOn() {
        if (this.lights > 0)
            this.lights_on = true;
    }

    public void TurnLightsOff() {
        this.lights_on = false;
    }

    public void AddMoreLights(int i) {
        this.lights += i;
    }

    public int HowManyLights() {
        return this.lights;
    }

    public int RankAwesomeness() {
        if (this.CheckLights())
            return this.HowManyLights();
        else
            return 0;
    }

    @Override
    String About() {
        String response = super.About();
        response += "This tree has " + this.lights + " lights on it and they are ";
        if (this.CheckLights()) {
            response += "on. ";
        } else {
            response += "off. ";
        }
        return response;
    }
}