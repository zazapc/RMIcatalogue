import java.rmi.Naming;
import java.util.List;

import metier.Produit;
import service.IcatalogueRemote;

public class RMIcatalogueClient {
	public static void main(String[] args){
		try {
			IcatalogueRemote stub=(IcatalogueRemote) Naming.lookup("rmi://localhost:1099/CATAL");
			System.out.println("Prix Moyen :"+stub.getPrixMoyen());
			List<Produit> prods=stub.consulterProduitsParMC("H");
			for(Produit p:prods){
			System.out.println(p.getNomProduit()+"--"+p.getPrix());	
			}		
			Produit p=stub.consulterProduit(2L);
			System.out.println("----------------------------------");
			System.out.println("Nome du produit :"+p.getNomProduit());	
		}  catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
