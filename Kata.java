public class Kata {
  public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
   while (true) { // Bucle infinito que se detiene con return
            if (firstAttacker.equals(fighter1.name)) {
                fighter2.health -= fighter1.damagePerAttack;
                if (fighter2.health <= 0) {
                    return fighter1.name; // Retorna el ganador
                }
                fighter1.health -= fighter2.damagePerAttack; // El defensor ataca
                if (fighter1.health <= 0) {
                    return fighter2.name; // Retorna el ganador
                }
            } else {
                fighter1.health -= fighter2.damagePerAttack;
                if (fighter1.health <= 0) {
                    return fighter2.name; // Retorna el ganador
                }
                fighter2.health -= fighter1.damagePerAttack; // El defensor ataca
                if (fighter2.health <= 0) {
                    return fighter1.name; // Retorna el ganador
                }
            }
        }
    }
}
