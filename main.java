public class main {


    public static void main(String[] args) {

        prelievo persona_1 = new prelievo();

        //Impostare credenziali per accesso.

        persona_1.setNome("Alessandro");
        persona_1.Inserimento_nome();

        persona_1.setCognome("Santomo");
        persona_1.Inserimento_cognome();

        persona_1.setPassword(2020);
        persona_1.Inserimento_password();
        persona_1.Risposta_password();

        //Immettere importo da prelevare.

        persona_1.Prelievo(1000);


    }
}
