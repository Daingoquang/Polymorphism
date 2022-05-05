public class WaveMonster extends Monster{
    public WaveMonster(String name){
        super(name);
    }
    @Override
    public String attack() {
        return "Attack with wave";
    }
}
