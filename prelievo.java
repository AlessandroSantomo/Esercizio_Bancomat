public class prelievo {

    private String nome;
    private String cognome;
    private int password;
    private int importo_posseduto=1000;

    public void setNome(String nome) {
        if (nome == "Alessandro") {
            this.nome = nome;
        }
        if (nome == "Lorenzo") {
            this.nome = nome;
        }
        if (nome != "Alessandro" && nome != "Lorenzo") {
            System.out.println("Il nome da lei inserito non è registrato in questa banca. Riprova.");
            System.exit(0);
        }
     }
     public String getNome() {
        return nome;
     }

    public void setCognome(String cognome) {
       if( cognome == "Santomo") {
        this.cognome = cognome;
        }
        if( cognome == "Capitani") {
            this.cognome = cognome;
        }
        if ( cognome != "Santomo" && cognome != "Capitani") {
           System.out.println("Cognome non valido, riprova.");
            System.exit(0);
        }
     }
     public String getCognome() {
        return cognome;
    }

    public void setPassword(int password) {
       if (cognome == "Santomo") {
           if(password == 2020) {
               this.password = password;
           }
           else {
               System.out.println("Password errata. Riprova.");
               System.exit(0);
           }
       }
       if (cognome == "Capitani") {
            if(password == 2021) {
                this.password = password;
            }
            else {
                System.out.println("Password errata. Riprova.");
                System.exit(0);
            }
       }

    }
    public int getPassword() {
        return password;
    }

    public void Inserimento_nome() {
        System.out.println("Il nome inserito è '"+nome+"'.");
    }
    public void Inserimento_cognome() {
        System.out.println("Il cognome inserito è '"+cognome+"'.");
    }
    public void Inserimento_password() {
        System.out.println("La password inserita è '"+password+"'.");
    }
    public void Risposta_password() {
        System.out.println("Password corretta. Benvenuto "+nome+" "+cognome+".");
    }

    public void Prelievo(int importo_da_prelevare) {
        System.out.println("Vuoi prelevare "+importo_da_prelevare+" euro.");
        if (importo_da_prelevare<=importo_posseduto) {
            importo_posseduto = importo_posseduto - importo_da_prelevare;
            System.out.println("Il prelievo di "+importo_da_prelevare+" è stato eseguito con successo.");
        }
        else {
            System.out.println("Prelievo fallito: hai solamente "+importo_posseduto+" euro da prelevare.");
        }
    }

}
