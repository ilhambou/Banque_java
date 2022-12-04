package metier.admin;

import presentation.modele.*;

import java.time.LocalDateTime;
import java.util.List;

import static metier.InteractiveConsole.clavier;

public interface IServiceAdmin {

    public default Client nouveauClient(){
        System.out.println("entrer nom: ");
        String nom=clavier.next();
        System.out.println("entrer le prenom: ");
        String prenom=clavier.next();
        System.out.println("entrer login: ");
        String login=clavier.next();
        System.out.println("enter le mdp: ");
        String password=clavier.next();
        System.out.println("entrrer l'email: ");
        String email=clavier.next();
        System.out.println("entrer cin: ");
        String cin = clavier.next();
        System.out.println("enter le num: ");
        String tel=clavier.next();
        System.out.println("entrer le sexe: ");
        String sexe=clavier.next();
        Client client=new Client(login, password, nom, prenom, email, cin, tel, Sexe.values()[Integer.parseInt(sexe)]);

        return client;
    }
    Client          nouveauCompteClientExistant();

    Client          chercherClientParId(Long id);
    List<Client>    chercherClientrNom(String nom);
    List<Client>    chercherClientParPrénom(String prenom);
    Client          chercherClientParCin(String cin);
    Client          chercherClientParEmail(String email);

    Compte          chercherCompteParId(Long idCompte);
    List<Compte>    chercherCompteParSolde(double solde);
    List<Compte>    chercherCompteParDateCreation(LocalDateTime date);
    List<Compte>    chercherCompteParPropriétaire(Client propriétaire);

    Client          modifierClient(String filtre);
    boolean         supprimerClient(Long id);

    TableauDeBord   calculerEtAfficherStatistiques();

    List<Client>    trierClientParNom();
    List<Client>    trierClientParCin();
    List<Client>    trierClientParEmail();
    List<Client>    trierClientParAdresse();
    List<Client>    trierClientParSoldeCompte();
    List<Compte>    trierComptesParSolde();
    List<Compte>    trierComptesParDateDeCreation();
    List<Compte>    trierComptesParNomPropriétaire();

}
