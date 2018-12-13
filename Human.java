public class Human extends aCreature{
    enum Gender {
        Male,
        Female;
    }
    enum BootsTypeOn {
        None,
        Sneakers,
        Sandals;
    }
    enum StandsOn {
        Parket,
        WoodenFloor,
        Asphalt,
        Concrete;
    }
    Gender gender;
    BootsTypeOn boots;
    StandsOn standOn;
    Human (String name, Gender gender, boolean flyingType, BootsTypeOn boots, StandsOn floor){
        this.name  = name;
        this.gender = gender;
        this.flyingType = flyingType;
        this.boots = boots;
        standOn = floor;
    }
    Human (String name, Gender gender, boolean flyingType, BootsTypeOn boots){
        this.name  = name;
        this.gender = gender;
        this.flyingType = flyingType;
        this.boots = boots;
    }
    Human (String name, Gender gender, boolean type){
        this.name  = name;
        this.gender = gender;
        this.flyingType = type;
    }
    Human (String name, boolean type){
        this.name  = name;
        this.gender = gender;
        this.flyingType = type;
    }
    private int countNotGiveUp = 0;

    public int getCountNotGiveUp() {
        return countNotGiveUp;
    }

    public void setCountNotGiveUp(int countNotGiveUp) {
        this.countNotGiveUp = countNotGiveUp;
    }
    public void getShoes(){
        if (this.boots == BootsTypeOn.None)
        System.out.println(name + " стоит босиком на " + standOn);
    }
    static public class GetGender {
        public static Gender get(Human b) throws NoGenderException{
            if (b.gender == null){
                throw new NoGenderException();
            }
            else {
                return b.gender;
            }
        }
    }
}
