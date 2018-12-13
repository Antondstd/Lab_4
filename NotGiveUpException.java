public class NotGiveUpException extends Error {
    NotGiveUpException(Human h){
        System.out.println(h.name + " не сдается. Программа завершена.");
    }
}
