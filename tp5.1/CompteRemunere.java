
/**
 * Décrivez votre classe CompteRémunéré ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class CompteRemunere extends Compte
{
    private double aTaux;
    
    public CompteRemunere(final double pSolde,final double pTaux){
        super(pSolde);
        this.aTaux=pTaux;
    }

    @Override
    public void capitaliseUnAn(){
    }
    
    public double getTaux(){
        return this.aTaux;
    }
}
