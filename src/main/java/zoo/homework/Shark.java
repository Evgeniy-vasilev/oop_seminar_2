package zoo.homework;

import zoo.Predator;

public class Shark extends Predator implements Swimable {

    private int swimmingSpeed = 30;

    public Shark(String name) {
        super(name);
    }

    @Override
    public int getSpeedSwimming() {
        return this.swimmingSpeed;
    }

    @Override
    public String say() {
        return "Акулы не любят разговаривать";
    }
}
