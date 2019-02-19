
public abstract class Compte
{
    private double aSolde ;

    public Compte(final double pSolde){
        //this.aSolde=arrondi2(pSolde);
        this.affecte(pSolde);
    }

    public double getSolde(){
        return this.aSolde;
    }

    public void affecte(final double sSolde)
    {// ***il est en privée
        this.aSolde=arrondi2(sSolde);

    }    

    private static double arrondi2( final double pR )
    {
        double vR = Math.abs( pR );
        int    vI = (int)(vR * 1000);
        if ( vI%10 >= 5 )  vR = vR + 0.01;
        return Math.copySign( ((int)(vR*100))/100.0, pR );
    } // arrondi2(.)
    
    public void debite(final double pdebite){
        affecte(this.aSolde-pdebite);
    }

    public void credite(final double pcrédite){
        affecte(this.aSolde+pcrédite);  
    }
    
    public abstract void capitaliseUnAn();
    
    public void bilanAnnuel(){
       System.out.println("solde="+this.aSolde);
       capitaliseUnAn();
       System.out.println(" / après capitalisation, solde= "+this.aSolde);
       
    }
}