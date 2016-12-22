public interface IChristmasTree {
    boolean CheckLights();

    void TurnLightsOn();

    void TurnLightsOff();

    void AddMoreLights(int i);

    int HowManyLights();

    int RankAwesomeness();

    // default String About() {
    //     String response = super.About();
    //     response += "The lights are ";
    //     if (this.CheckLights()) {
    //         response += "on. ";
    //     } else {
    //         response += "off. ";
    //     }
    //     return response;
    // }



}