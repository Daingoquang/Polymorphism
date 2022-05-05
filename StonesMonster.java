public class StonesMonster extends Monster{
    public StonesMonster(String name){
        super(name);
    }
    @Override
    public String attack() {
        return "Attack with stones";
    }
}
