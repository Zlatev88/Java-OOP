package _1_WorkingWithAbstraction.Exercise._4_TrafficLights;

public class TrafficLight {
    private Color currentColor;

    public TrafficLight(Color currentColor) {
        this.currentColor = currentColor;
    }

    public Color getCurrentColor() {
        return currentColor;
    }

    public void changeColor(){
        if (this.currentColor.equals(Color.RED)){
            this.currentColor = Color.GREEN;
        }
        else if (this.currentColor.equals(Color.GREEN)) {
            this.currentColor = Color.YELLOW;
        }
        else if (this.currentColor.equals(Color.YELLOW)) {
            this.currentColor = Color.RED;
        }
    }
}
