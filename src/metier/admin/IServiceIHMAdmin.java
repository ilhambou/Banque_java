package metier.admin;

import metier.authentification.IServiceIHM;

import static metier.InteractiveConsole.clavier;

public interface IServiceIHMAdmin extends IServiceIHM {
    IServiceAdmin admin = null;



    int menuModification();
    int menuRecherche();
    int menuInformations();
    public default int menuAjout()
    {
        System.out.println("ajout d'un client");
        System.out.println("entrer votre choix: ");
        int choix = clavier.nextInt();
        switch (choix){
            case 0:{
                admin.nouveauClient();
                break;

            }
        }
        return 0;

    }
    int menuSuppression();
    int tableauDeBord();
    int menuTrie();
    int menuComptabilité();

}
