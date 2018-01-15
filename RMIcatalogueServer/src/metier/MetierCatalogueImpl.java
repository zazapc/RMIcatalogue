package metier;

import java.util.ArrayList;
import java.util.List;

public class MetierCatalogueImpl {
	private List<Produit> produits=new ArrayList<>();
	public MetierCatalogueImpl(){
		produits.add(new Produit(1L, "HP Pavillon",6758 , "Pavillon.jpg"));
		produits.add(new Produit(2L, "Dell Latittud",9658 , "Latittud.jpg"));
		produits.add(new Produit(3L, "Toshiba",9558 , "Toshiba.jpg"));
		produits.add(new Produit(4L, "Siemens",4367 , "Siemens.jpg"));
	}
	
	public List<Produit> listProduits(){
		return produits;
	}
	
	public List<Produit> getProduitsParMC(String mc){
		List<Produit> prods=new ArrayList<Produit>();
		for(Produit p: produits){
			if(p.getNomProduit().indexOf(mc)>=0)
				prods.add(p);			
		}
		return prods;
	}
	public Produit getProduit(Long idp){
		for(Produit p:produits)
			if(p.getIdProduit().equals(idp)){
				return p;
			}
		return null;
	}

}
