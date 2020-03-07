package fr.uvsq.pglp;
import java.time.LocalDateTime;

public class UneClasseMetier {
    public void uneMethodeMetier(Logger logger){
        logger.log(LocalDateTime.now()+":Début de methode");
        logger.log(LocalDateTime.now()+": Fin de methode");
    }


}
