public class TestMonster {
    public static void main(String[] args) {
        Monster Fmonster= new FireMonster("Ngo");
        Monster Wmonster=new WaveMonster("Quang");
        Monster Smonster=new StonesMonster("Dai");
        System.out.println(Fmonster.attack());
        System.out.println(Wmonster.attack());
        System.out.println(Smonster.attack());
        Fmonster =new StonesMonster("T2109A");
        System.out.println(Fmonster.attack());
        Monster monster=new Monster("FPT Aptech");
        System.out.println(monster.attack());
    }
}
