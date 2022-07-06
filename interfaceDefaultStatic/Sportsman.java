package interfaceDefaultStatic;

public class Sportsman implements Runner, Swimmer{
    @Override
    public int getResult() {
        return Runner.super.getResult();
    }
}
