public class Main {
    public static void main (String[] args){
        Human freken = new Human("Френекен Бок", Human.Gender.Female,false,Human.BootsTypeOn.None,Human.StandsOn.Parket);
        Human karlson = new Human("Карлсон",Human.Gender.Male,true, Human.BootsTypeOn.Sneakers);
        NotGiveUp notGiveUp = ()-> {
            return true;
        };
        int notGiveUpCount = freken.getCountNotGiveUp();
        try {
            Human.GetGender.get(freken);
        }
        catch (NoGenderException e)
        {
            System.out.println("У персонажа " + freken.name + " нет пола");
        }
        while (notGiveUp.getNotGiveUp() == true){
            Flying flyAction = new Flying(){
                public void flyLower(Human o){
                    if (o.flyingType) System.out.println(o.name + " опутистился");
                    else System.out.println(o.name + " не может летать");
                }
                public void flyHigher(Human o){
                    if (o.flyingType) System.out.println(o.name + " взлетел выше и увернулся");
                    else System.out.println(o.name + " не может летать");
                }
            };
            HumanActions action = new HumanActions(){
                public void catchHuman(Human o, Human c){
                    System.out.println("Человек " + o.name + " пытается поймать " + c.name);
                }
                public void swish (SwingableObjects o, Human h, Human p){
                    System.out.println(h.name + " размахивает предметом " + o + ", чтобы сбить  " + p.name);
                }
                public void jump (Human h){
                    System.out.println(h.name + " подпрыгивает");
                }
            };
            action.catchHuman(freken,karlson);
            flyAction.flyHigher(karlson);
            action.swish(SwingableObjects.Beater,freken, karlson);
            freken.getShoes();
            action.jump(freken);
            freken.setCountNotGiveUp(notGiveUpCount++);
            if (notGiveUpCount > 3){
                throw new NotGiveUpException(freken);
            }
        }
    }
}
